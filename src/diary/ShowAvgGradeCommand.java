/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diary;

import userinterface.Message;

/**
 *
 * @author oleksandrlinenko
 */
public class ShowAvgGradeCommand {
    
    public static ShowAvgGradeCommand create() {
        return new ShowAvgGradeCommand();
    }
    
    public void handle() {
        double avg = Application.getInstance().getDiary().getAvg();
        Message.create().show(String.format("Average grades is %.2f\n", avg));
    }
}
