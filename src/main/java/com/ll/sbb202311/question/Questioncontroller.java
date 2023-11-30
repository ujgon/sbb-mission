package com.ll.sbb202311.question;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import java.util.List;

@RequiredArgsConstructor
@Controller
public class Questioncontroller{

    private final QuestionRepository questionRepository;

    @GetMapping("/question/list")
    public String list(Model model) {

        List<Question> questionList = this.questionRepository.findAll();
        model.addAttribute("questionList", questionList);
        return "question_list";
    }
}
