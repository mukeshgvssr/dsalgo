import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class NumberTitle {
   
    String strInput;
    int titleLength;
    ArrayList myTitles= new ArrayList();
   
    NumberTitle(String strInput)
    {
         this.strInput=strInput;
         titleLength=strInput.length();
        
    }
    private void addTitle(String match)
    {
        myTitles.add(match);
    }
    public ArrayList getTitles()
    {
        return myTitles;
    }
    public void checkMatches()
    {
        // create searchSpace that is required no need to go to dictionary file everytime
        createSearchSpace(titleLength);
       
        // Now remove those titles which does not match
        for (int i=0;i<titleLength;i++)  // this can be O(10) max number of digits in mobile
        {
            System.out.println("When i="+i+" Array: "+myTitles);
            char num=strInput.charAt(i);
            // Assume there are no 0 or 1 as they dont represent any char in dialPad
            char[] matchchars = matchedChars(num);
             
                for(int j=0;j<myTitles.size();j++)
                {
                    String s=(String) myTitles.get(j);
                       
                    if( (s.charAt(i)==matchchars[0] ) || (s.charAt(i)==matchchars[1] ) ||
                        (s.charAt(i)==matchchars[2] ) ||
                        (    (matchchars[3] !=' ') && (s.charAt(i)==matchchars[3] ) )
                       )
                       continue;
                    else
                        myTitles.remove(s);
                   
                       
                }
           
           
           
        }
       
       
       
    }
   
    public void createSearchSpace(int length)
    {
        String filePath = "D:/tmp/dictionary.txt";
        BufferedReader br;
        String line;
       
        try {
            br = new BufferedReader(new FileReader(filePath));
            try {
                while((line = br.readLine()) != null)
                {
                    if( line.length() == length)
                        addTitle(line);
                }
               } catch (IOException ioe)
                 {
                   ioe.printStackTrace();
                 }
            } catch (FileNotFoundException fe)
              {
                   fe.printStackTrace();
              }
           
    }
    public char[] matchedChars(char num)
    {
        char[] dialPad={' ',' ',' ',' '};
        if(num == '2')
        {    dialPad[0] ='a';
            dialPad[1] ='b';
            dialPad[2] ='c';
        } else if(num == '3')
                {    dialPad[0] ='d';
                    dialPad[1] ='e';
                    dialPad[2] ='f';
                }else if(num == '4')
                      {    dialPad[0] ='g';
                          dialPad[1] ='h';
                          dialPad[2] ='i';
                      }else if(num == '5')
                              {    dialPad[0] ='j';
                                  dialPad[1] ='k';
                                  dialPad[2] ='l';
                              }else if(num == '6')
                                  {    dialPad[0] ='m';
                                      dialPad[1] ='n';
                                      dialPad[2] ='o';
                                  }
                          else if(num == '7')
                          {    dialPad[0] ='p';
                              dialPad[1] ='q';
                              dialPad[2] ='r';
                              dialPad[3] ='s';
                          }
                      else if(num == '8')
                      {    dialPad[0] ='t';
                          dialPad[1] ='u';
                          dialPad[2] ='v';
                      }
                  else if(num == '9')
                  {    dialPad[0] ='w';
                      dialPad[1] ='x';
                      dialPad[2] ='y';
                      dialPad[3] ='z';
                 }
       
      return dialPad;   
    }

}
