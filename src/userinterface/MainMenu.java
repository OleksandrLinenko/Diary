/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package userinterface;

import diary.AddGradeCommand;
import diary.ShowAvgEverySubjectCommand;
import diary.ReadDataCommand;
import diary.SaveDataCommand;
import diary.ShowGradesCommand;
import diary.ShowAvgGradeCommand;
import java.util.InputMismatchException;

/**
 *
 * @author oleksandrlinenko
 */
public class MainMenu {

    public static MainMenu create() {
        return new MainMenu();
    }

    public void show() {
        boolean konecProgramu = false;
        boolean error;
        do {
            error = false;
            try {
                menu();
                int volba = readOption();
                konecProgramu = doOption(volba);
            } catch (Exception ex) {
                error = true;
            }
        } while (!konecProgramu || error == true);
    }

    private void menu() {
        Message.create().show("");
        Message.create().show("Diary");
        Message.create().show("1. Write grades from the diary");
        Message.create().show("2. Add grade to the diary");
        Message.create().show("3. Save new grades to the file");
        Message.create().show("4. Read grades from the file");
        Message.create().show("5. Get average grade from all subjects");
        Message.create().show("6. Get average grade by subject");
        Message.create().show("0. Exit");

    }

    private int readOption() {
        int volba;
        try {
            volba = Ask.create().getInt("Pick the option: ");
        } catch (InputMismatchException ex) {
            volba = -1;
        }
        Message.create().show("\n");
        return volba;
    }

    private boolean doOption(int volba) {
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
                Message.create().show("Undefined option: " + volba);
        }
        return false;
    }

    public void addGrade() {
        AddGradeCommand.create().handle();
    }

    public void showGrades() {
        ShowGradesCommand.create().handle();
    }

    public void saveDataToFile() {
        SaveDataCommand.create().handle();
    }

    public void readDataFromFile() {
        ReadDataCommand.create().handle();
    }

    public void statistics() {
        ShowAvgGradeCommand.create().handle();
    }

    public void statisticsSubject() {
        ShowAvgEverySubjectCommand.create().handle();
    }
}
