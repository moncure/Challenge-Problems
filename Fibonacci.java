/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Amy Moncure
 */
public class Fibonacci {
    
    
    public int fibSequence(int term){
        //Return the sum of the fibonacci sequence up to the first n numbers.
       
            int tMinusOne = 1;
            int tMinusTwo = 0;
            int nextTerm = tMinusOne + tMinusTwo;
            if (term == 1)
               return 1; //base case;
            else {
                 for(int i = 2; i <=term; i++){
                      nextTerm = tMinusOne + tMinusTwo;
                      tMinusTwo = tMinusOne;
                      tMinusOne = nextTerm;
                 }//end for
            }//end else
            return nextTerm;
    }//end fibSequence;
    
    private boolean fibSequenceTester(){
        boolean case1 = fibSequence(1)==1;
        boolean case2 = fibSequence(2)==1;
        boolean case3 = fibSequence(8) ==21;
        
        return (case1 && case2 && case3);
    }
    
    public int recursiveFib(int term){
        
        if(term == 1)
            return 1;
        else if (term == 0)
            return 0;
        else return (recursiveFib(term-1) + recursiveFib(term-2));
        
    }
    
    private boolean recursiveFibTester(){
        boolean case1 = recursiveFib(1)== 1;
        boolean case2 = recursiveFib(2) == 1;
        boolean case3 = recursiveFib(5) == 5;
        boolean case4 = recursiveFib(7) == 13;
        boolean case5 = recursiveFib(8) == 21;
        
        return (case1 && case2 && case3 && case4 && case5);
    }
    
    public boolean FibonacciTester(){
        
        
        if(!fibSequenceTester()){
            System.out.println("fibSequenceTester broken");
            return false;
        }
        
        if(!recursiveFibTester()){
            System.out.println("recursiveFibTester broken");
            return false;
        }
        
        return true;
    }
    
    public static void main(String[] args){
        Fibonacci prob = new Fibonacci();
        if(prob.FibonacciTester())
            System.out.println("All methods successful");
        else System.out.println("ERROR");
        
    }
            
}
