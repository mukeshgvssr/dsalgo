import java.util.HashMap;
import java.util.Random;

public class SnakesNLadders {

    // Snakes and Ladders game Assuming the Displaying UI is taken care
    //  If we provide the correct parameters...
     HashMap board;
    
     SnakesNLadders() 
     {
         board = new HashMap();
         board.put(12,24); // ladder
         board.put(21,45); // ladder from 2row 1 col to 4th row 5th column
         board.put(34,8);  // snake from 3rd row 4th col to 0th row 8 col
         board.put(52,25);  // snake
    }
    public boolean addLadder(int start,int end)
    {
        if( (( (end/10)-(start/10)) < 1 ) || (end > 99) || (start > 99) )  // min is next row on board
            return false;
        else
        {   board.put(start,end);
            return true;
        }
    }
    public boolean addSnake(int start,int end)
    {
        if( (( (start/10)-(end/10)) < 1 ) || (end > 99) || (start > 99) )  // min is next row on board
            return false;
        else
        {   board.put(start,end);
            return true;
        }
    }
    private int getDiceValue()
    {
        // get a random value out of 1 to 6 for the move
        int dice=0;
        Random ran = new Random();
        dice = ran.nextInt(6) + 1;  // 1+ some random number in 0..5
        return dice;
    }
    public int nextPlace(String player,int val)
    {
        //  98 +3=101 will keep pawn at 98 only 
        //  at 99 only possible dice value is 1
        int next=val;
        String snakeRLader="N";
        int dice=getDiceValue();
        next=next+dice;
        System.out.print("Dice:"+dice+":");
        next= board.containsKey(next) ? (Integer) board.get(next) : next  ;
        if(Math.abs(next-val) > 6)
        {
            if(next > val)
                snakeRLader="L";
            else
                snakeRLader="S";
        }
        int result = ( next <= 100) ? next : val ;
        display(player,result,snakeRLader);
        return result;
    }
    private static void display(String player,int position,String sorn)
    {
        // UI should be taken care seperately in awt or some other technique
        if(sorn.equals("S"))
            System.out.println(" Oops : "+player+" got a Snake bite ");
        if(sorn.equals("L"))
            System.out.println(" Hurray : "+player+" got a Ladder fly ");
        System.out.println(player+" moved to :"+position);
        if( position == 100)
        {
            System.out.println("Congratulations "+player+" !! You won the match");
        }
        
    }
    public void displayBoard()
    {
        System.out.println("----------------------------------");
        System.out.println(board);
        System.out.println("----------------------------------");
    }
}
