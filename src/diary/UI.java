/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diary;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.List;

/**
 *
 * @author oleksandrlinenko
 */
public class UI {

    private Scanner sc = new Scanner(System.in);

    public void run() throws IOException {
        boolean konecProgramu = false;
        do {
            vypisMenu();
            int volba = nactiVolbu();
            konecProgramu = obsluzVolbu(volba);
        } while (!konecProgramu);
    }

    private void vypisMenu() {
        System.out.println("");
        System.out.println("Diary");
        System.out.println("1. Write grades from the diary");
        System.out.println("2. Add grade to the diary");
        System.out.println("3. Save new grades to the file");
        System.out.println("4. Read grades from the file");
        System.out.println("5. Get average grade from all subjects");
        System.out.println("6. Get average grade by subject");
        System.out.println("0. Exit");

    }

    private int nactiVolbu() {
        System.out.print("Zadej volbu: ");
        int volba;
        try {
            volba = sc.nextInt();
        } catch (InputMismatchException ex) {
            volba = -1;
        }
        sc.nextLine();
        return volba;
    }

    private boolean obsluzVolbu(int volba) throws IOException {
        switch (volba) {
            case 0:
                return true;
            case 1:
                showGrades();
                break;
            case 2:
                addGrade();
                break;
            case 3:
                saveDataToFile();
                break;
            case 4:
                readDataFromFile();
                break;
            case 5:
                statistics();
                break;
            case 6:
                statisticsSubject();
                break;
            default:
                System.out.println("Neplatna volba " + volba);
        }
        return false;
    }

    public void addGrade() {
        System.out.print("Set subject: ");
        String name = sc.nextLine();
        Subject subject = new Subject(name);
        System.out.print("Set the grade: ");
        int gradee = sc.nextInt();
        Grade grade = new Grade(subject, gradee);
        Data data = Data.getInstance();
        data.addGrade(grade);
    }

    public void showGrades() throws IOException {
        Data data = Data.getInstance();
        List<Grade> grades = data.getDiary().getGrades();
        for (Grade grade : grades) {
            System.out.println(grade);
        }
    }

    public void saveDataToFile() {
        System.out.println("Set path to file");
        String path = sc.nextLine();
        File file = new File(path);
        Data data = Data.getInstance();
        data.saveDiary(file);
    }

    public void readDataFromFile() {
        System.out.println("Set path to file");
        String path = sc.nextLine();
        File file = new File(path);
        Data data = Data.getInstance();
        data.loadDiary(file);
    }

    public void statistics() {
        Data data = Data.getInstance();
        int sum = 0;
        int quantity = 0;
        for (Grade grade : data.getDiary().getGrades()) {
            sum += grade.getValue();
            quantity += 1;
        }
        double avg = Math.ceil((double) sum / quantity);
        System.out.println("Average grade is " + avg);
    }

    public void statisticsSubject() {
        List<String> subjects = new ArrayList<>();
        Data data = Data.getInstance();
        for (Grade grade : data.getDiary().getGrades()) {
            if (!subjects.contains(grade.getSubject().getName())) {
                subjects.add(grade.getSubject().getName());
            }
        }

        for (String subject : subjects) {
            int sum = 0;
            int quantity = 0;
            for (Grade grade : data.getDiary().getGrades()) {
                if (subject.equals(grade.getSubject().getName())) {
                    sum += grade.getValue();
                    quantity++;
                }
            }
            double avg = Math.ceil((double) sum / quantity);
            System.out.println("Average grade for " + subject + " is " + avg);
        }

    }

}
