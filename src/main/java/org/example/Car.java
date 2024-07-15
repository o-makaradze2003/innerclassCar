package org.example;

public class Car {
    private class Engine {
        void startEngine() {
            System.out.println("Start Engine");
            ;
        }
    }

    void displayEngine() {
        Engine eng = new Engine();
        eng.startEngine();
    }

}
