import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StackOperations {

    private MyStack TransStack;
    private MyStack maxStack;
    StackOperations()
    {
        TransStack=new MyStack(10);
        maxStack=new MyStack(10);
    }
   
    public  void interactiveDisplay() throws IOException
    {
       int newStreamData=-1;
   
      do
      {   
        System.out.println(" Please Enter:: 1.Push  2.Pop ");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String streamData= in.readLine();
        newStreamData = Integer.parseInt(streamData);
        if(newStreamData==1)
        {
            System.out.println("Enter element to Push:");
            streamData= in.readLine();
            addElement(Integer.parseInt(streamData));
        }
        if(newStreamData==2)
        {
            System.out.println("Element poped from stack:");
            removeElement();
        }
        if(newStreamData != -1)
        {   
          TransStack.print();
         System.out.println("Current Maximum:"+maxStack.getTop());
        }
       
      }while(newStreamData != -1);
    }
    public void addElement(int value)
    {
        TransStack.push(value);
        if(maxStack.getTop()== -1)
            maxStack.push(value);
        else
        {
            if(maxStack.getTop() <= value)
                maxStack.push(value);
           
        }   
       
    }
    public void removeElement()
    {
        long tmp=TransStack.pop();
        if(tmp == maxStack.getTop())
             maxStack.pop();
    }
}
