package org.example.controller;

public interface Observable{
    void update();
    void addObserver(Observer<?> observer);
}
