package lr11.task1_8;

import java.util.Scanner;

public class task_B {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Введите размер списка");
        int size=in.nextInt();
       int id=size;
        Node head=null;
        Node ref=null;
            createHeadRec(ref,size,id);

        System.out.println();
        createTail(head,size,id);
    }
    public static void createHeadRec(Node ref,int size,int id){


        if (id==size){
            return;

        }
        id++;
         ref= new Node(id,null).next= new Node(id,null);

        System.out.print(" " + ref.value);
        ref=ref.next;
        createHeadRec(ref,size,id);
    }
    public static void createTail(Node nulle,int size,int id){
        if (id==0){
            return;
        }
         Node  head = new Node(id, nulle);
        id--;
        Node ref=head;
        System.out.print(" "+ref.value);
            ref=ref.next;
        createTail(head,size,id);
    }
}
