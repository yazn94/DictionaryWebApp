package org.example.dictionarywebapp;

import org.example.dictionarywebapp.client.DictionaryClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class DictionaryWebAppApplication {

    public static void main(String[] args) throws IOException {
        SpringApplication.run(DictionaryWebAppApplication.class, args);
    }

}
