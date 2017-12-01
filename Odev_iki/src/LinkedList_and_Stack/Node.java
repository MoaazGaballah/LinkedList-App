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
public class Node <T>{
    Node<T>nextNode;
    T data;
    
    public Node(T data){
        this.nextNode=null;
        this.data=data;
    }
}
