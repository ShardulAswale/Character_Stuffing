/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package charstuff61;

import java.util.Scanner;

/**
 *
 * @author unrea
 */
public class Charstuff61 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          Scanner sc = new Scanner(System.in);
        String charbyte;
        String charstuff = new String();
        int i = 0 , j = 0;
        
        System.out.println("Enter Message");
        charbyte = sc.next();

  
            charbyte = 'F' + charbyte + 'F'; 
            while(i < charbyte.length())
            { 
                if (charbyte.charAt(i) == 'F' && i != 0 && i != (charbyte.length() - 1))
                {
                    charstuff = charstuff + 'E' + charbyte.charAt(i);
                }
                else if (charbyte.charAt(i) == 'E') 
                {
                    charstuff = charstuff + 'E' + charbyte.charAt(i);
                }
                else
                {
                    charstuff = charstuff + charbyte.charAt(i);
                }
                i++;
            } 
  
            System.out.println("Stuffing:\n" + charstuff); 
        
        
        Reciever r = new Reciever();
        r.decrypt(charstuff);
        
    }
    
}


class Reciever
{
    public void decrypt(String data)
    {
        String datastuff = new String();
        int i = 1 , j = 0;
        
        System.out.println(" Unstuffing: "); 
   
        while(i < data.length() - 1)
        {   
            if (data.charAt(i) == 'F')
            {
                datastuff = datastuff + data.charAt(i);
            }
            else if (data.charAt(i) == 'E' && data.charAt(i + 1) == 'E')
            { 
                datastuff = datastuff + 'E'; 
                i++; 
            }
            else if (data.charAt(i) == 'E' && data.charAt(i + 1) == 'F')
            { 
                datastuff = datastuff; 
            }
            else
            {
                datastuff = datastuff + data.charAt(i);
            }
            i++;
        } 
        System.out.println(datastuff); 
            
    }
}

    
    

