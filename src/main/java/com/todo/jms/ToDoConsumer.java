package com.todo.jms;

import com.todo.domain.ToDo;
//import com.todo.repository.ToDoRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

@Component
@Slf4j
public class ToDoConsumer {

    /*private ToDoRepository toDoRepository;

    public ToDoConsumer(ToDoRepository toDoRepository){
        this.toDoRepository = toDoRepository;
    }*/

    @JmsListener(destination =  "${todo.jms.destination}", containerFactory = "jmsFactory")
    public void processToDo(@Validated ToDo toDo){
        log.info("consumer :: {}", toDo.getDescription());
    }

}
