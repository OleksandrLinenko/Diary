/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diary;

/**
 *
 * @author oleksandrlinenko
 */
public class Grade {

    private Subject subject;
    private int value;

    public Grade(Subject subject, int value) {
        if (value <= 0 || value > 5) {
            throw new IllegalArgumentException("Grade can be in range from 1 to 5");
        }
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
        return String.format("%s: %d\n", subject.getName(), value);
    }
}
