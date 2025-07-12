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
public class GetSubjectsListCommand {

    public static GetSubjectsListCommand create() {
        return new GetSubjectsListCommand();
    }

    public List<String> handle() {
        return Application.getInstance().getDiary().getUniqueSubjects();
    }
}
