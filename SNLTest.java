public class SNLTest {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        SnakesNLadders sl=new SnakesNLadders();
        sl.displayBoard();
        sl.addLadder(31, 64);  // add talest ladder
        sl.addSnake(89, 11);  // add the big snake 
        String player1="Suma";
        String player2="Geethika";
        int p1=0;  // players initial position
        int p2=0;
        for(int i=1;;i++)
        {
            if(i%5 == 0)
                sl.displayBoard();  // Display board for every 5 moves for testing
            
            p1=sl.nextPlace(player1, p1);
            if(p1 == 100)
                break;
            p2=sl.nextPlace("\t\t\t\t\t"+player2,p2); // Just for clear display
            if(p2 == 100)
                break;
        }

    }

}
