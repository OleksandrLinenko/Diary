/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diary;

import java.util.List;

/**
 *
 * @author oleksandrlinenko
 */
public class Grade {
    private Subject subject;
    private int value;

    public Grade(Subject subject, int value) {
        this.subject = subject;
        this.value = value;
    }

    public Subject getSubject() {
        return subject;
    }

    public int getValue() {
        return value;
    }
    
    @Override
    public String toString() {
        return subject.getName() + ": " + value;
    }
}
