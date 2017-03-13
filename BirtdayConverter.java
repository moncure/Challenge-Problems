
import java.util.StringTokenizer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Amy Moncure
 */
//import java.util.StringTokenizer;
import java.util.StringTokenizer;

//Birthday Converter explores the StringTokenizer library functionality

public class BirtdayConverter {
    
    
    
       

    
    public static void main(String[] arguments) {
        
        StringTokenizer st1, st2;
        
        String birthday = "12/04/2008";
        st1 = new StringTokenizer(birthday,"/");
        
        String month = st1.nextToken();
        String day = st1.nextToken();
        String year = st1.nextToken();
        
       
       System.out.println("Month: " + month +"\nday: " + day + "\nyear: "+ year);
       
       
       st2 = new StringTokenizer(birthday,"/");
              System.out.println("Month: " +st2.nextToken()+"\nday: " + st2.nextToken() + "\nyear: "+ st2.nextToken());

    }
    
}

    

