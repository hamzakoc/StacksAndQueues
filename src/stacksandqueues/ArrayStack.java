
package stacksandqueues;

public class ArrayStack {
    
    private int[] stackData;
    private int top;
    private int maxSize;
    
    public ArrayStack(int max){
        this.maxSize=max;
        this.top=-1;
        this.stackData = new int[maxSize];
    }
    
    public boolean push(int item){
        if(top<maxSize-1){
            
        top++;
        stackData[top]=item;
        return true; 
        }
        return false;
                
    }
    
    public int pop(){
        if(top!=-1){
        top--;
        return stackData[top+1]; 
        }
        return -10000;
    }
      
    
    
    public boolean isEmpty(){
        return top==-1;
    }
    
    public boolean isFull(){
        return top==stackData.length-1;
    }
     
    public int peek(){
        return stackData[top];
    }
    
}
