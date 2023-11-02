package org.mycode.entities;

abstract public class Test {
    public void startTest(){
        displayQuestions();
        collectAnswers();
        evaluateAnswers();
        displayResult();
    }

    public abstract void displayQuestions();

    public abstract void collectAnswers();

    public abstract void evaluateAnswers();

    public abstract void displayResult();
}
