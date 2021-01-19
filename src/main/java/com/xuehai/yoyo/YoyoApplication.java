package com.xuehai.yoyo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@Slf4j
public class YoyoApplication {

    public static void main(String[] args) {
        SpringApplication.run(YoyoApplication.class, args);
    }

    @Autowired
    private KafkaTemplate<Object, Object> template;

    @GetMapping("/send/{input}")
    public void sendFoo(@PathVariable String input){
        this.template.send("topic_input", input);
    }

    @KafkaListener(id = "webGroup", topics = "topic_input")
    public void listen(String input) {
        log.info("input value: {}", input);
    }


}
