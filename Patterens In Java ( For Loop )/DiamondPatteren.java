import java.util.*;

public class DiamondPatteren {
    public static void main(String args[]){
         // diamond patteren 
         int n = 5; 
         for(int i=1; i<=n; i++){
             // spaces
             for(int j=1; j<=n-i; j++){
                 System.out.print(" ");
             }
            //  stars
             for(int j=1; j<=i; j++){
                 System.out.print("*");
             }
             for(int j=2; j<=i; j++){
                 System.out.print("*");
             }
             System.out.println("");
         }
        //  flip diamond
         for(int i=n; i>=1; i--){
             // spaces
             for(int j=1; j<=n-i; j++){
                 System.out.print(" ");
             }
             for(int j=1; j<=i; j++){
                 System.out.print("*");
             }
             for(int j=2; j<=i; j++){
                 System.out.print("*");
             }
             System.out.println("");
         }
    }
}
