/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package userinterface;

/**
 *
 * @author oleksandrlinenko
 */
public class Message {
    public static Message create() {
        return new Message();
    }
    
    public void show(String string) {
        System.out.print(string);
    }
}
