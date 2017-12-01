/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedList_and_Stack;

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
public class LinkedList<T> {

    private Node<T> Header;

    // add last is used for adding characters that generated randomly
    void addLast(Node newNode) {
        if (Header == null) {
            Header = newNode;
        } else {
            Node Temp = Header;
            while (Temp.nextNode != null) {
                Temp = Temp.nextNode;
            }
            Temp.nextNode = newNode;
        }

    }

    Node removeFirst() {
        if (Header == null) {
            //throw new myException("şu an listeniz boştur !!");
            System.out.println("Üzgünüz... Sınırınız 100 elemandır! Lütfen R'den başka bir seçenek seşiniz");
            TestProgram.status=true;
            return null;
        } else {
            Node<T> temp = Header;
            Header = Header.nextNode;
            temp.nextNode = null;
            return temp;
        }
    }

    void printList() {

        Node<T> Temp = Header;
        while (Temp != null) {
            System.out.print(((Karakter) (Temp.data)).seymbol + " ==> ");
            Temp = Temp.nextNode;
        }
        System.out.print("null");
        System.out.println("");
    }
}
