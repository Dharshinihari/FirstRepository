package com.example.TextfileAPI.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.ClassPathResource;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

@RestController
@RequestMapping("/api/data")
public class TextFileController {
    @GetMapping
    public String getData() throws IOException {
        //Read the content of the text file
        ClassPathResource resource = new ClassPathResource("text.txt");
        byte[] data = FileCopyUtils.copyToByteArray(resource.getInputStream());
        String fileContent = new String(data, StandardCharsets.UTF_8);
        //You can parse the file content into your Data class or return it as a String
        return fileContent;
    }
    @Value("${configusername}")
    private String greetingMessage;
    @GetMapping("/greeting")
    public String getGreeting() {
        return greetingMessage;
    }
    @GetMapping("/value")
    public String getEnv() {
        // Retrieve the value from the environment variable
        String myValue = System.getenv("MY_ENV_VARIABLE");
        // Return the value in the response
        return "Value from Environment Variable: " + myValue;
    }
}


