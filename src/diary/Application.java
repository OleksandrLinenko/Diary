/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diary;

/**
 *
 * @author oleksandrlinenko
 */
public class Application {

    private static Application app = new Application();
    private Data data = new Data();
    private Diary diary = new Diary();

    private Application() {
    }

    public static Application getInstance() {
        return app;
    }
    
    public Data getData() {
        return data;
    }

    public Diary getDiary() {
        return diary;
    }

    public void addGrade(Grade grade) {
        diary.addGrade(grade);
    }

}
