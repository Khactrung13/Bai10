/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaiTapsua;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class KiemTraUsename {
    
 
    public static void main(String[] args) {
        int username = 123, password = 123456;
        int guessUser, guessPass;
        Scanner scanner = new Scanner(System.in);
         
        do {
            System.out.println("Nhập vào username: ");
            guessUser = scanner.nextInt();
            System.out.println("Nhập vào password: ");
            guessPass = scanner.nextInt();
        } while((username != guessUser) || (password != guessPass));
     
        System.out.println("Welcome " + guessUser);
    }
}

