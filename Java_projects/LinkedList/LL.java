package Java_projects.LinkedList;
import java.util.LinkedList;
public class LL {
    public static void main(String args[]){
        LinkedList<String> ll = new LinkedList<>();
        ll.add("is");
        ll.addFirst("this");
        ll.addLast("list");
        ll.add(2, "a");
        System.out.println(ll);
    }
}
