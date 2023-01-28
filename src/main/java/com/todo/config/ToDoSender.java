package com.todo.config;

import com.todo.domain.ToDo;
import com.todo.jms.TodoProducer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ToDoSender {

    @Bean
    public CommandLineRunner sendToDos(@Value("${todo.jms.destination}") String destination, TodoProducer producer){
        return args -> {
            producer.sendTo(destination, new ToDo("test todo!"));
        };
    }

}
