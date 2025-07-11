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
public class GetAvgEverySubjectCommand {
    public static GetAvgEverySubjectCommand create() {
        return new GetAvgEverySubjectCommand();
    }
    
    public void handle() {
        Data data = Data.getInstance();
        String subjects = data.getDiary().getAvgEverySubject();
        Message.create().show(subjects);
    }
}
