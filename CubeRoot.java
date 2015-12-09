import java.lang.Math.*;

public class CubeRoot {

    /**
     * @param args
     */
    public static void main(String[] args) {
        //  Find the square root or Cube root using The Binary Search method
        //  Complexity is O(log n) 
        
        System.out.println(" Approximate Square root:"+ sqr_root(100));
        System.out.println(" Approximate Cubic root:"+ cube_root(1000));

    }
    static double sqr_root(double number) 
    {  
        double lo = 0;  
        double hi =number;  
        double mid=number; 
        double epsilon = 0.000001; //precision 
        
        while ( lo <= mid && hi >= mid ) 
        {     
         mid = (lo + hi)/2;
        
         if (Math.abs(((mid * mid) - number)) <= epsilon)  
          break;  
         else if ( (mid * mid) < number)  
          lo = mid;  
         else  
          hi = mid;  
         
        } 
       
        return mid;  
    }  
    static double cube_root(double number) 
    {  
        double lo = 0;  
        double hi =number;  
        double mid=number; 
        double epsilon = 0.000001; //precision 
        
        while ( lo <= mid && hi >= mid ) 
        {     
         mid = (lo + hi)/2;
        
         if (Math.abs(((mid * mid * mid) - number)) <= epsilon)  
          break;  
         else if ( (mid * mid * mid ) < number)  
          lo = mid;  
         else  
          hi = mid;  
         
        } 
       
        return mid;  
    }  

}
