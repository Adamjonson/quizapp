package com.adamjonson.quizapp.service;

import com.adamjonson.quizapp.Question;
import com.adamjonson.quizapp.dao.QuestionDao;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Service
public class QuestionService {

    QuestionDao questionDao;
    public List<Question> getAllQuestions() {
        return questionDao.findAll();
    }

    public List<Question> getAllQuestionsByCategory(String category) {
        return questionDao.findByCategory(category);
    }

    public String addQuestion(Question question) {
        questionDao.save(question);
        return "success";
    }
}
