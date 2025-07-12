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
public class ShowAvgEverySubjectCommand {
    
    public static ShowAvgEverySubjectCommand create() {
        return new ShowAvgEverySubjectCommand();
    }
    
    public void handle() {
        String subjects = Application.getInstance().getDiary().getAvgEverySubject();
        Message.create().show(subjects);
    }
}
