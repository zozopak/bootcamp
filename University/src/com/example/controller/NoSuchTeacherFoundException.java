package com.example.controller;

public class NoSuchTeacherFoundException extends Exception{
    @Override
    public String getMessage() {
        return "There is no such a Teacher!!!";
    }
}
