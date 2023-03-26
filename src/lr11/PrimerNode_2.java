package lr11;

public class PrimerNode_2 {
    public static void main(String[] args) {
        Node head=null;
        for (int i=9;i>=0;i--){
            head=new Node(i,head);

        }
// создается новый элемент со значением 44 – для вставки
        Node newNode=new Node(44, null);

      Node  ref = head;    // используем временную переменную
        int k=1;   // счетчик элементов

// поиск нужного положения узла для вставки
        while (ref.next!= null && (k<2 )) { ref = ref.next;
            k++;
        }

// переброска ссылок при вставке элемента
        newNode.next=ref.next.next;
        ref.next=newNode;

        while (ref!=null){
            System.out.println(""+ref.value);
            ref=ref.next;
        }
    }
}
