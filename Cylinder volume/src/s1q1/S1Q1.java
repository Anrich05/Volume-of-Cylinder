
package s1q1;

import java.util.Scanner;


public class S1Q1 {

    public static double raduis;
    public final double height;
    public static double Volume;
    
    public static void main(String[] args) {

        new S1Q1();
  
    }

    public S1Q1() {
        
        this.height = 10;
        System.out.println("Please enter the raduis");
        Scanner input = new Scanner(System.in);
        String value = input.next();
        raduis = Double.parseDouble(value);
        
        
        Volume = Math.PI*(raduis*raduis)*height;
        System.out.println(Volume);

        
    }
    
    
    
}
