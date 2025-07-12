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
public class ShowList {
   public static ShowList create() {
       return new ShowList();
   } 
   
   public void handle(List<Grade> grades) {
       for (Grade grade : grades) {
            Message.create().show(grade.toString());
        }
        Message.create().show("");
   }
}
