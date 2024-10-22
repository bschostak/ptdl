package de.bschostak.todo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import de.bschostak.todo.dto.UserInputDto;


@Controller
@RequestMapping("/todolist")
public class HtmlController {
    private static final Logger LOG = LoggerFactory.getLogger(HtmlController.class);
    
    @GetMapping
    public String index() {
        return "index";
    }

    @PostMapping("/insert")
    public String insertUserInput(@ModelAttribute UserInputDto userInputDto) {
        LOG.info("User input: {}", userInputDto);
        return "response";
    }
}
