/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diary;

/**
 *
 * @author oleksandrlinenko
 */
public class GetGradesQuantityCommand {
    public static GetGradesQuantityCommand create() {
        return new GetGradesQuantityCommand();
    }
    
    public int handle() {
        Data data = Data.getInstance();
        int quantity = 0;
        for (Grade grade : data.getDiary().getGrades()) {
            quantity += 1;
        }
        
        return quantity;
    }
}
