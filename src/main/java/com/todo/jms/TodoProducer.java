package com.todo.jms;

import com.todo.domain.ToDo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class TodoProducer {

    private JmsTemplate jmsTemplate;

    public TodoProducer(JmsTemplate jmsTemplate){
        this.jmsTemplate = jmsTemplate;
    }

    public void sendTo(String destination, ToDo toDo){
        this.jmsTemplate.convertAndSend(destination, toDo);
        log.info("message successfully sent to consumer");
    }

}
