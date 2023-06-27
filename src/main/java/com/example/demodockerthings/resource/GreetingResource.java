package com.example.demodockerthings.resource;

import org.apache.logging.log4j.util.Strings;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("greeting")
public class GreetingResource {

    private static final Logger log = LoggerFactory.getLogger(GreetingResource.class);

    @GetMapping
    ResponseEntity<String> sayHello(String name) {
        log.info("👀👀👀👀");
        String msg = ("Say hello to " + (Strings.isNotBlank(name) ? name : "everyone") + " " + LocalDateTime.now());
        return new ResponseEntity<>(msg, HttpStatus.OK);
    }

}
