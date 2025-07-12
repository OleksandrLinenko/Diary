/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diary;

import java.util.List;
import userinterface.ShowList;

/**
 *
 * @author oleksandrlinenko
 */
public class ShowGradesCommand {

    public static ShowGradesCommand create() {
        return new ShowGradesCommand();
    }
    
    public void handle() {
        List<Grade> grades = Application.getInstance().getDiary().getGrades();
        ShowList.create().handle(grades);
    }
}
