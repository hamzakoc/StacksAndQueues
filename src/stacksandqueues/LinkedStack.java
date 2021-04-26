
package stacksandqueues;


class LinkNode{

        public String data;
        public LinkNode next;
        
        
        public LinkNode (String item){
        
            this.data=item;
            this.next=null;
        
        }

}

public class LinkedStack {
    private LinkNode top;
    
    
    public LinkedStack(){
        this.top=null;
        
    }
    
    
    public void push (String item){
        
        LinkNode newNode= new LinkNode(item);
        newNode.next=top;
        top=newNode;
    }
    
    
    public String pop (){
        
        if(top!=null){
            String data = top.data;
            top=top.next;
            return data;     
       
        }
        return null;
    }
    
    
    public String peek(){
        
        if(top!=null){
            return top.data;
        }
        return null;
    }
    
    
    
    
    
    
}
