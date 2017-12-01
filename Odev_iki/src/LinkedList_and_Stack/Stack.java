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
public class Stack<T> {

    int size = 0;
    private Node <T>header;

    

    Node pop() { // remove last
        if (header == null) {
            throw new myException("şu an stağınız boştur !!");
        } else {
            Node<T> temp = header;
            header = header.nextNode;
            temp.nextNode = null;
            size--;
            return temp;
        }
    }

    void push(T data) { // add first
        Node<T> newNode = new Node(data);
        if (header == null) {
            header = newNode;
        } else {
            newNode.nextNode = header;
            header = newNode;
        }
        size++;
    }
}
