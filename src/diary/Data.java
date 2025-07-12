/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diary;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author oleksandrlinenko in diary we can write students grades for different
 * subjects diary grades subjects
 */
public class Data {

    public static Data create() {
        return new Data();
    }

    public void loadDiary(File file) {
        List<Grade> diary = Application.getInstance().getDiary().getGrades();
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] split = line.split(";");
                if (split.length == 2) {
                    String name = split[0].trim();
                    int value = Integer.parseInt(split[1].trim());
                    Subject subject = new Subject(name);
                    Application.getInstance().addGrade(new Grade(subject, value));
                }
            }
        } catch (IOException ex) {
            System.err.println("Error while reading data from file");
        }
    }

    public void saveDiary(File file) {
        List<Grade> diary = Application.getInstance().getDiary().getGrades();
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
            for (Grade grades : diary) {
                bw.write(grades.getSubject().getName() + ";" + grades.getValue());
                bw.newLine();
            }
        } catch (IOException ex) {
            System.err.println("Error while writing data to file");
        }
    }
    
}
