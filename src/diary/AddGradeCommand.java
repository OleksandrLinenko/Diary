/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diary;


/**
 *
 * @author oleksandrlinenko
 */
public class AddGradeCommand {
    
    public static AddGradeCommand create() {
        return new AddGradeCommand();
    }
    
    public void handle() {
        Grade grade = GetGradeCommand.create().handle();
        Data data = Data.getInstance();
        data.addGrade(grade);
    }
}
