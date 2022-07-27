package Java_projects.LinkedList;
import java.util.*;
public class AddFirstLast {
    Node head;
    private int size;
    AddFirstLast (){
        size = 0;
    }
    public class Node{
        String  data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    public void addFirst(String data) {
        Node newNode = new Node(data);
        
    }
    public static void main(String args[]){
    
    }
}
