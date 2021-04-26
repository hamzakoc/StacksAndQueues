
package stacksandqueues;

class QueueNode{

        public int data;
        public QueueNode next;
        
        
        public QueueNode (int item){
        
            this.data=item;
            this.next=null;
        
        }

}

public class LinkedQueue {
      private  QueueNode head;
      private  QueueNode tail;

    public LinkedQueue(){
        head=null;
    }

   public void enqueue(int key){ //add Last
        QueueNode newNode = new QueueNode(key);
        if (head==null) {
            head = tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
    }

    int deQueue(){ //remove front
        if (head==null){
            return -10000000; //
        }
        QueueNode curr=head;
        head=head.next;
        return curr.data;
    }

    boolean isEmpty(){
        return head==null;
    }
    int peek(){ //remove front
        if (head==null){
            return -10000000; //
        }
        return head.data;
    }

}
