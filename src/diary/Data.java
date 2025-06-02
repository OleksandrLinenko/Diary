/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diary;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author oleksandrlinenko in diary we can write students grades for different
 * subjects diary grades subjects
 */
public class Data {

    private static final Data data = new Data();
    private Diary diary = new Diary();

    private Data() {

    }

    public static Data getInstance() {
        return data;
    }

    public Diary getDiary() {
        return diary;
    }

    public void addGrade(Grade grade) {
        diary.addGrade(grade);
    }

    public void loadDiary(File file) {
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] split = line.split(";");
                if (split.length == 2) {
                    String name = split[0].trim();
                    int value = Integer.parseInt(split[1].trim());
                    Subject subject = new Subject(name);
                    diary.addGrade(new Grade(subject, value));
                }
            }
        } catch (IOException ex) {
            System.err.println("Error while reading data from file");
        }
    }

    public void saveDiary(File file) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
            for (Grade grades : diary.getGrades()) {
                bw.write(grades.getSubject().getName() + ";" + grades.getValue());
                bw.newLine();
            }
        } catch (IOException ex) {
            System.err.println("Error while writing data to file");
        }
    }
    
}
