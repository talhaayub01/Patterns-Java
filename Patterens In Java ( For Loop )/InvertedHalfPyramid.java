import java.util.*;
class InvertedHalfPyramid {
    public static void main(String[] args){
        // Print Inverted Half Pyramid.

        int n =5;
        for(int i=1; i<=5; i++){   
            // for spaces
            for(int j=1; j<=n; j++){
                System.out.print("");
            }
            // for inverted numbers 
            for(int j=1; j<=n-i+1; j++){
                System.out.print(i);
            }
            System.out.println();
        }

    }
}
