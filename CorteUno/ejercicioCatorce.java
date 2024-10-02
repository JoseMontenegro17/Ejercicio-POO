/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

/**
 *
 * @author Alejo
 */
 import java.util.Arrays;
public class ejercicioCatorce {
    public static void main(String[] args) {
        	String[] nombres = {"juan", "pedro", "ana", "maria", "felipe", "luis", "eduardo"};
        Arrays.sort(nombres);
        for (String s : nombres) {
            System.out.println(s);
        }
    }
}
