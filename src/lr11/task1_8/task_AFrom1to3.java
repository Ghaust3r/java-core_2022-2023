package lr11.task1_8;


import java.util.Scanner;

public class task_AFrom1to3 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Введите размер списка");
        int size=in.nextInt();
            createHead(size,size-1);
        System.out.println();
createTail(size,size-1);

    }
public static String createHead(int size,int id){
    String stroka="";
        for (id=0;id<size;id++){
            Node ref= new Node(id,null).next= new Node(id,null);
    System.out.print(" " + ref.value);
            ref=ref.next;
        }
    return stroka;
}
public static String createTail(int size,int id){
        Node head=null;
    for (id=size-1;id>=0;id--) {
        head = new Node(id, head);
    }
    Node ref=head;
    while (ref!=null){
        System.out.print(" "+ref.value);
        ref=ref.next;
    }
    String stroka="";

    return stroka;
}

}
