package org.mycode;

import org.mycode.entities.MultipleChoicesTest;
import org.mycode.entities.Test;
import org.mycode.entities.TrueFalseTest;

public class Main {
    public static void main(String[] args) {
        Test test1 = new MultipleChoicesTest();
        Test test2 = new TrueFalseTest();

        System.out.println("Multiple Choices Test:");
        test1.startTest();
        System.out.println("\n\nTrue/False Test:");
        test2.startTest();
    }
}