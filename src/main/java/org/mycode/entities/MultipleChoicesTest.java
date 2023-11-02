package org.mycode.entities;

public class MultipleChoicesTest extends Test {
    @Override
    public void displayQuestions() {
        System.out.println("Displaying Questions Of Multiple Choices Test...");
    }

    @Override
    public void collectAnswers() {
        System.out.println("Collecting Answers Of Multiple Choices Test...");
    }

    @Override
    public void evaluateAnswers() {
        System.out.println("Evaluating Answers Of Multiple Choices Test...");
    }

    @Override
    public void displayResult() {
        System.out.println("Displaying Results Of Multiple Choices Test...");
    }
}
