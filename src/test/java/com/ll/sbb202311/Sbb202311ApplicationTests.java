package com.ll.sbb202311;

import com.ll.sbb202311.answer.Answer;
import com.ll.sbb202311.answer.AnswerRepository;
import com.ll.sbb202311.question.Question;
import com.ll.sbb202311.question.QuestionRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import java.util.Optional;
import org.springframework.transaction.annotation.Transactional;


@SpringBootTest
class Sbb202311ApplicationTests {

    @Autowired
    private QuestionRepository questionRepository;

    @Autowired
    private AnswerRepository answerRepository;

    @Transactional
    @Test
    void testJpa() {
        Optional<Question> oq = this.questionRepository.findById(2);
        assertTrue(oq.isPresent());
        Question q = oq.get();

        List<Answer> answerList = q.getAnswerList();

        assertEquals(1, answerList.size());
        assertEquals("네 자동으로 생성됩니다.123", answerList.get(0).getContent());
    }
}