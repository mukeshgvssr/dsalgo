public class MyStack {

    private int maxSize;
    private int top;
    private long[] stackArray;
   
    public MyStack(int size)
    {
        maxSize=size;
        top=-1;
        stackArray=new long[maxSize];
    }
    public void push(long value)
    {
        if(!isFull())
        {   
           stackArray[++top]=value;
        }
        else
        {
            System.out.println("Sorry ! Stack is Full");
        }
    }
    public long pop()
       {
        if(!isEmpty())
        {   
              return stackArray[top--];
        }
        else
        {
            System.out.println("Sorry ! Stack is Empty");
            return -1;
           
        }   
    }
    public long getTop()
    {
        return (isEmpty()) ? -1 : stackArray[top];
    }
    public boolean isEmpty()
    {
        return (top==-1);
    }
    public boolean isFull()
    {
        return ( top== maxSize -1 );
    }
    public void print()
    {
        System.out.println(" Current Stack ");
        for( int i=top;i>=0;i--)
        {  System.out.println("|"+stackArray[i]+"|");
          System.out.println("---");
        } 
    }
   
   
}
