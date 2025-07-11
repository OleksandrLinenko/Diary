/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diary;

import userinterface.Ask;

/**
 *
 * @author oleksandrlinenko
 */
public class GetGradeCommand {

    public static GetGradeCommand create() {
        return new GetGradeCommand();
    }

    public Grade handle() {
        String name = Ask.create().getString("Set subject: ");
        Subject subject = new Subject(name);
        int gradee = Ask.create().getInt("Set grade: ");
        return new Grade(subject, gradee);       
    }
}
