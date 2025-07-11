/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diary;

/**
 *
 * @author oleksandrlinenko
 */
public class WriteAvgGradeCommand {
    public static WriteAvgGradeCommand create() {
        return new WriteAvgGradeCommand();
    }
    
    public void handle() {
        double avg = Math.ceil((double) GetSumGradesCommand.create().handle() / GetGradesQuantityCommand.create().handle());
    }
}
