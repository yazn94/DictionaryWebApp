package org.example.dictionarywebapp.controller;

import org.example.dictionarywebapp.client.DictionaryClient;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;

@Controller
public class DictionaryController {
    private final DictionaryClient client;

    public DictionaryController() throws IOException {
        client = new DictionaryClient();
        client.startConnection("localhost", 8080);
    }

    @GetMapping("/dictionary")
    @ResponseBody
    public String getWordDefinition(@RequestParam String word) throws IOException {
        return client.sendMessage(word);
    }

    @GetMapping("/")
    public String index() {
        return "dictionary";
    }
}