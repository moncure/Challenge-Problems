/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Amy
 */

//ExploreLanguage demonstrates three Java Language behaviors:
//
//     An array of integers can be copied into an arry of floats
//
//     The result of two floats divided can be casted to an integer 
//
//     A switch statement that does not include "break;" at the end of each
//     case will execute all of the cases after the expected case statement.
//     If this is not the desired behavior, break needs to follow the end of 
//     every case statement.

public class ExploreLanguage {
    
    public static void main(String[] arguments)
    {
        
        int[] array1 = { 7, 4, 8, 1, 4, 1, 4};
        float[] array2 = new float [array1.length];
        
        //Print out the first array
        System.out.print("array1: [ ");
        for (int i = 0; i <array1.length; i++)
        {
            System.out.println(array1[i] + " ");
        }//end for
        System.out.println("]");
    
        System.out.println("array2: [ ");
        
        
        
        //Copy integers from array1 into array2 proceeding the first value
        //of 1 in array 1.
        int count = 0;
        while(count < array1.length && array1[count] != 1 )
        {
            array2[count] = (float)array1[count];
            //Print array2
            System.out.print(array2[count++] + " ");
        }//end while
        System.out.println("]");
        
        //Demonstrate that the division of two floats can be type casted to an
        //integer value and print the results.
        float x = 9;
        float y= 5;
        int z = (int) (x/y);
     
        System.out.println("Value of z : " + z);
        
        //Demonstrate a switch case where break is omitted.  
        //Each subsequent case will be executed once the specific case is 
        //executed.
        //Therefore, if z=1; case 1, 2, and default will be executed.
        //If z=2, case 2 and default will be executed.
        //If this is not the desired behavior, break needs to follow each
        //case statement
        switch (z) {
            case 1: 
            { x = x + 2; System.out.println("Case 1 executed");} 
            case 2: 
            {x = x + 3; System.out.println("Case 2 executed");} 
            default: 
            {x = x + 1; System.out.println("default executed");}
        }//end switch
        System.out.println("Value of x: " + x);
        }
               
    }//end main

