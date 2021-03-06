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
public class ScreenData<T> {

    Node<T> header;

    // this is to add to the screen at first
    void addLast(Node newNode) {
        if (header == null) {
            header = newNode;
        } else {
            Node<T> temp = header;
            while (temp.nextNode != null) {
                temp = temp.nextNode;
            }
            temp.nextNode = newNode;
        }
    }

    // this is to remove from screen at last
    Karakter removeLast() {
        Node<T> temp = header;
        if (header == null) {
            System.out.println("Ekrandan silenecek bir eleman kalmadı! Lütfen L' den başka bir seçenek seçeniz ");
            TestProgram.status=true;
            return null;
        } else if (header.nextNode== null) {
            T removedNodeData = temp.data;
            header= null;
            return (Karakter) removedNodeData;
        } else {
            while (temp.nextNode.nextNode != null) {
                temp = temp.nextNode;
            }
            T removedNodeData = temp.nextNode.data;
            temp.nextNode = null;
            return (Karakter) removedNodeData;
        }
    }
    
    // this is to print data on the screen
    void printScreen() {
        Node<T> Temp = header;
        while (Temp != null) {
            System.out.print(((Karakter) (Temp.data)).seymbol + " ==> ");
            Temp = Temp.nextNode;
        }
        System.out.print("null");
        System.out.println("");
    }
}
