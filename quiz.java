package refresh;
import java.util.Scanner; 
import java.util.Random;
/**
 *
 * @author daylinhenry
 */
public class Refresh {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        Random rnd = new Random();  
        
        int num1 =0; 
        int num2 =0;  
        
        
        System.out.println("Pick a number between 1- 20. This will be your upper limit. "); 
        num1 =keyboard.nextInt();
        
        System.out.println("Insert another number between 1-20. This is the amount of numbers to generate "); 
        num2 =keyboard.nextInt(); 
        
        while(num1 > 20 || num1<1 || num2>20 || num2<1){
            System.out.println("I specifically asked for a number 1-20..."); 
            System.out.println("Pick a number between 1- 20"); 
            num1 =keyboard.nextInt();
            System.out.println("Insert another number between 1-20 "); 
            num2 =keyboard.nextInt(); 
            
        }
        
        for(int counter = 0; counter<num2; counter++){
        
         int random = 1 + rnd.nextInt(num1);
         System.out.println(random);
       
        
    }
    
    } 
} 

