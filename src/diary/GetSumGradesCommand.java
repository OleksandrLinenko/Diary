/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diary;

/**
 *
 * @author oleksandrlinenko
 */
public class GetSumGradesCommand {
    public static GetSumGradesCommand create() {
        return new GetSumGradesCommand();
    }
    
    public int handle() {
        Data data = Data.getInstance();
        int sum = 0;
        for (Grade grade : data.getDiary().getGrades()) {
            sum += grade.getValue();
        }
        
        return sum;
    }
}
