package com.ll.sbb202311;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class MainController {

    @GetMapping("/jtsbb")
    @ResponseBody
    public String index () {
        return "안녕하세요 반갑습니다.";
    }

    @GetMapping("/")
    public String root() {
        return "redirect:/question/list";
    }
}
