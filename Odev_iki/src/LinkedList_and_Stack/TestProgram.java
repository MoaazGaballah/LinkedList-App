/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedList_and_Stack;

import java.util.Random;
import java.util.Scanner;

/**
 * @Odev_iki
 * 
 * This program is going right and left with a limit of 100 
 * Using Linked list Stack and spcial data structure is developed 
 * You can go right or left to get that random character generated 
 * Run it now !
 * 
 * 2. Ödev
 * 
 * 03/11/2017
 * 
 * @author Moaaz Gabllah
 * @author moaaz.ahmed@stu.fsm.edu.tr
 * 
 */
public class TestProgram {

    // This method will return a character that generated 
    static Karakter generateCharacter() {
        Random r = new Random();
        int n = r.nextInt(26) + 65;
        Karakter ch = new Karakter(n);
        return ch;
    }

    static void readyForPrinting() {
        System.out.println("Şu anki bağlı listeniz :");
    }

    // this for not adding null to stack
    static boolean status = false;

    // getting charecter from user
    static String readyMethod() {
        System.out.println(" ** saga ilerle (R)");
        System.out.println(" ** sola ilerle (L)");
        System.out.println(" ** cikis (C)");
        Scanner sc = new Scanner(System.in);
        return sc.next();
    }

    public static void main(String[] args) {
        // creating a linked list
        LinkedList ls = new LinkedList();
        Stack s = new Stack();
        ScreenData sd = new ScreenData();
        for (int i = 0; i < 100; i++) {
            // generating a new character
            Karakter ch = generateCharacter();
            // creating new node from character
            Node<Karakter> newNode = new Node<>(ch);
            // adding new node generated to created linked list
            ls.addLast(newNode);
        }
        
        // getting ready for printing 
        //readyForPrinting();
        
        // this is the linked list that generated randomly
        //ls.printList();
        
        String girisHarfi = readyMethod();
        
        while (!girisHarfi.equalsIgnoreCase("c")) {
            if (girisHarfi.equalsIgnoreCase("R")) {
                if (s.size == 0) { // if there is no node in stack
                    Node<Karakter> removedNode = ls.removeFirst();
                    if (status != true) {
                        sd.addLast(removedNode);
                    }
                    System.out.print("Ekran çıktısı : ");
                    sd.printScreen();
                    girisHarfi = readyMethod();
                } else {
                    Node<Karakter> removedNode = s.pop();
                    sd.addLast(removedNode);
                    System.out.print("Ekran çıktısı : ");
                    sd.printScreen();
                    girisHarfi = readyMethod();
                }
            } else if (girisHarfi.equalsIgnoreCase("L")) {
                Karakter removedNode = sd.removeLast();
                if (status != true) {
                    s.push(removedNode);
                }
                status = false;
                System.out.print("Ekran çıktısı : ");
                sd.printScreen();
                girisHarfi = readyMethod();
            } else {
                System.out.println("Girdiğiğiniz harf hatlıdır ! Lütfen doğru seşenek yapınız");
                System.out.print("Ekran çıktısı : ");
                sd.printScreen();
                girisHarfi = readyMethod();
            }
        }
        System.out.println("Çıkış yaptığınız için teşekkür ederiz");
    }
}
