/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diary;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author oleksandrlinenko
 */
public class Diary {

    private List<Grade> grades = new ArrayList<>();

    public List<Grade> getGrades() {
        return grades;
    }

    public void addGrade(Grade grade) {
        grades.add(grade);
    }

    public int getQuantity() {
        int quantity = 0;
        for (Grade grade : grades) {
            quantity += 1;
        }

        return quantity;
    }

    public int getSum() {
        int sum = 0;
        for (Grade grade : grades) {
            sum += grade.getValue();
        }

        return sum;
    }

    public List<String> getUniqueSubjects() {
        List<String> subjects = new ArrayList<>();
        Data data = Data.getInstance();
        for (Grade grade : data.getDiary().getGrades()) {
            if (!subjects.contains(grade.getSubject().getName())) {
                subjects.add(grade.getSubject().getName());
            }
        }

        return subjects;
    }

    public String getAvgEverySubject() {
        StringBuilder sb = new StringBuilder();
        List<String> subjects = getUniqueSubjects();
        for (String subject : subjects) {
            int sum = 0;
            int quantity = 0;
            for (Grade grade : grades) {
                if (subject.equals(grade.getSubject().getName())) {
                    sum += grade.getValue();
                    quantity++;
                }
            }
            double avg = Math.ceil((double) sum / quantity);
            sb.append(String.format("Average grade for %s is %.2f\n", subject, avg));
        }

        return sb.toString();
    }

    public double getAvg() {
        return Math.ceil((double) getSum() / getQuantity());
    }
}
