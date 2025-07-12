/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diary;

import userinterface.Ask;
import userinterface.Message;

/**
 *
 * @author oleksandrlinenko
 */
public class GetGradeCommand {

    public static GetGradeCommand create() {
        return new GetGradeCommand();
    }

    public Grade handle() {
        Grade grade = null;
        do {
            try {
                String name = Ask.create().getString("Set subject: ");
                Subject subject = new Subject(name);
                int gradee = Ask.create().getInt("Set grade: ");
                grade = new Grade(subject, gradee);
            } catch (IllegalArgumentException ex) {
                Message.create().show(ex.getMessage());
            }
        } while (grade == null);

        return grade;
    }
}
