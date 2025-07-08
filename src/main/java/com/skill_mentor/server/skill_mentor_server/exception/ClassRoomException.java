package com.skill_mentor.server.skill_mentor_server.exception;

public class ClassRoomException extends RuntimeException{
    public ClassRoomException(String message, Throwable throwable){
        super(message, throwable);
    }

    public ClassRoomException(String message){
        super(message);
    }

    public ClassRoomException(){}
}

