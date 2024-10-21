package de.bschostak.todo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import de.bschostak.todo.model.User;


@Controller
@RequestMapping("/todolist")
public class HtmlController {

    private static final Logger log = LoggerFactory.getLogger(HtmlController.class);
    
    @GetMapping
    public String index() {
        return "index";
    }

    @PostMapping("/insert")
    public String insertUserInput(@ModelAttribute User user) {
        log.info("User input: {}", user);
        return "response";
    }
}
