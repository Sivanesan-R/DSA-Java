public class dlist {
      public static void main(String[] args) {
        dll list = new dll();
        list.insertionatFirst(3);
        list.insertionatFirst(2);
        list.insertionatFirst(44);
        list.insertionatFirst(5345);
        list.display();
    }    
}

public class dll{
    private node head;
    public void insertionatFirst(int val){
        node newnode = new node(val);
        if (head == null) {
            head = newnode;
        }else{
            newnode.next = head;
            head.prev = newnode;
            head = newnode;
        }
    }

    public void display(){
        node bot = head;
        while (bot != null) {
            System.out.print(bot.val + " -> ");
            bot = bot.next;
        }
        System.out.print(" END ");
    }
}

public class node{


    int val;
    node prev= null;
    node next = null;

    node(int val){
        this.val = val;
    }
      
}
