/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diary;

import java.util.List;
import userinterface.Message;

/**
 *
 * @author oleksandrlinenko
 */
public class ShowGradesCommand {
    public static ShowGradesCommand create() {
        return new ShowGradesCommand();
    }
    
    public void handle() {
        Data data = Data.getInstance();
        List<Grade> grades = data.getDiary().getGrades();
        for (Grade grade : grades) {
            Message.create().show(grade.toString());
        }
    }
}
