package org.mycode.entities;

public abstract class Test {
    public final void startTest(){
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
