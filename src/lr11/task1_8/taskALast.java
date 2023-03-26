package lr11.task1_8;


public class taskALast {
    public static void main(String[] args) {
        Node head=null;

//        for (int i=10;i>=0;i--){
//            AddFirst(i,head);
//        }

//        AddLast(15);

//Insert(55,5);

//        RemoveFirst(4);

Remove(6,2);

    }
//    public static void AddFirst(int i, Node head){
//        head=new Node(i,head);
//        Node ref=head;
//
//        while (ref!=null){
//            System.out.println(""+ref.value);
//            ref=ref.next;
//        }
//    }


//    public static void AddLast(int i){
//        Node head=null;
//        Node newtail = new Node(i, null);
//        for (int b=0 ;b<i;b++){
//            head=new Node(b,head);
//        }
//
//        Node ref = head;
//        while (ref.next != null) { // пока не последний элемент
//            ref = ref.next;
//        }
//        ref.next=newtail;
//        ref=ref.next;
//        System.out.println("Элемент добавлен "+ref.value);
//
//    }


//    public static void Insert(int i,int b){
//        Node head=null;
//        for (int a=9;a>=0;a--){
//            head=new Node(a,head);
//
//        }
//        Node newNode=new Node(i, null);
//
//        Node ref = head;    // используем временную переменную
//       int  k=1;   // счетчик элементов
//
//
//        while (ref.next!= null && (k<b )) { ref = ref.next;
//            k++;
//        }
//
//        newNode.next=ref.next.next;
//        ref.next=newNode;
//
//        while (ref!=null){
//            System.out.println(""+ref.value);
//            ref=ref.next;
//        }
//    }


//    public static void RemoveFirst(int i){
//        Node head=null;
//        for (;i>=0;i--){
//            head=new Node(i,head);
//
//        }
//
//       Node ref = head;
//
//        while (ref.next.next != null) {
//            ref = ref.next;
//            System.out.println(" "+ref.value);
//        }
//
//        ref.next=null;
//
//    }

    public static void Remove(int a,int b){
        Node head=null;
        for (;a>=0;a--){
            head=new Node(a,head);

        }
       Node ref = head;
       int k = 1;

        while (ref.next != null && (k < b)) {
            ref = ref.next;
            k++;
        }

        ref.next = ref.next.next;
        while (ref!=null){
            System.out.println(""+ref.value);
            ref=ref.next;
        }
    }
}
