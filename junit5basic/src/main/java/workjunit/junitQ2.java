package workjunit;

import java.util.*;

public class junitQ2 {
    public static void main(String args[]) throws Exception
    {
  
      
        Integer arr[] = { 2, 5, 1, 8, 34, 20, 4 };
     
        System.out.println("Array: " + Arrays.toString(arr));
  
        int minArray = Collections.min(Arrays.asList(arr));
  
        int maxArray = Collections.max(Arrays.asList(arr));
  
        System.out.println("Minimum value of Array is: "+ minArray);
  
        System.out.println("Maximum value of Array is: "+ maxArray);
    }
}