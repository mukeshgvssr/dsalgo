import dsclasses.NumberTitle;

public class NumToText {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
          // inp: 26678837  out: computer
        
         NumberTitle nt=new NumberTitle("26678837");
         nt.checkMatches();
         System.out.println(" The titles for you can have are :"+nt.getTitles() );
        
   
    }

}
