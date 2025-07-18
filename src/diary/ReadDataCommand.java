/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diary;

import java.io.File;
import userinterface.Ask;

/**
 *
 * @author oleksandrlinenko
 */
public class ReadDataCommand {

    public static ReadDataCommand create() {
        return new ReadDataCommand();
    }

    public void handle() {
        String path = Ask.create().getString("Set path to file: ");
        Data.create().loadDiary(path);
    }
}
