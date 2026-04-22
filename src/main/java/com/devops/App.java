package com.devops;

public class App {
    public String greet() {
        return "CI/CD Pipeline Successful";
    }
    public static void main(String[] args) {
        App app = new App();
        System.out.println(app.greet());
    }
}
