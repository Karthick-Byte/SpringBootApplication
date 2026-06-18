package com.infy.user.kafka;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserEvent {
    private String eventType;
    private Integer userId;
    private String name;
    private String email;

}
