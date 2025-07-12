/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diary;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author oleksandrlinenko
 */
public class GetSubjectsListCommand {

    public static GetSubjectsListCommand create() {
        return new GetSubjectsListCommand();
    }

    public List<String> handle() {
        List<String> subjects = new ArrayList<>();
        for (Grade grade : Application.getInstance().getDiary().getGrades()) {
            if (!subjects.contains(grade.getSubject().getName())) {
                subjects.add(grade.getSubject().getName());
            }
        }
        return subjects;
    }
}
