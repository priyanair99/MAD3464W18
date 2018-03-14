/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day1activity;

/**
 *
 * @author macstudent
 */

public class Day1Activity                   
{
    public static void main(String[] args) 
    {
                    
        // array declaration 
       int numbers[] = new int[5];
       int i;
       
        for ( i = 0; i < 5; i++) 
        {
           numbers[i] = i;
           System.out.println("Array element a[" + i + "] = " + numbers[i]);
           
        }
               
      i = 0;   
     int Random_no;
     int sample_array[] =  new int[10];
     int sorted_array[] =  new int[10];
        for (int j = 0; j < 10; j++) 
        {
            Random_no = (int)(Math.random() * 10);
            System.out.println("no " +i + 1+ "=" + Random_no );
            sample_array[j] = Random_no;
            
            
        }
                 
        // sorting
        int min,temp ;
        for (int j = 0; j < 10; j++) 
        {
            min = sample_array[j];
            for (int k = j+1 ; k < 10; k++) 
            {
                if (min > sample_array[k]) 
                {
                    temp = sample_array[k];
                    sample_array[k] = min;
                    min = temp;
                }
            }
            
            sorted_array[j] = min;
        }
        
        System.out.println("The array is : >>>>)");
        for (int j = 0; j < 10; j++) 
        {
            System.out.println(sorted_array[j]);
        }
        
        
        
        for (i = 1; i <= 5; i++) 
        {
            if (i == 1 || i == 5)
            {
                for (int j = 1; j <= 5; j++) 
                {
                    System.out.print("*");
                }
                
            }
            else
            {
                for (int k = 1; k <=5; k++) 
                {
                    if( k == 1 || k == 5)
                    {
                    System.out.print("*");
                    }
                    
                    else
                    {
                        System.out.print(" ");

                    }
                }
            }
            System.out.print("\n");
                    
        }
        
        
        
//        System.out.println("1 2 3 4 5 4 3 2 1");
//        System.out.println("1 2 3 4   4 3 2 1");
//        System.out.println("1 2 3       3 2 1");
//        System.out.println("1 2           2 1");
//        System.out.println("1               1");   
//        System.out.println("1 2           2 1"); 
//        System.out.println("1 2 3       3 2 1"); 
//        System.out.println("1 2 3 4   4 3 2 1"); 
//        System.out.println("1 2 3 4 5 4 3 2 1"); 
    }
}
