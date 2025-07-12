/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diary;

import userinterface.Ask;

/**
 *
 * @author oleksandrlinenko
 */
public class SaveDataCommand {
    
    public static SaveDataCommand create() {
        return new SaveDataCommand();
    }
    
    public void handle() {
        String path = Ask.create().getString("Set path to file: ");
        Data.create().saveDiary(path);
    }
}
