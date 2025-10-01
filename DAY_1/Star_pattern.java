package DAY_1;

public class Star_pattern {
    public static void main(String[] args){
    int i,j;
    System.out.println("The Star Pattern:");
    for(j=1;j<=4;j++){
        for(i=1;i<=j;i++){
            System.out.print("*");
        }
        System.out.println("");
    }
    }
}

/*Learnt how to print Star Pattern
-- 1 outer loop for how much lines to print and inner loop to print the Star
-- and outside the inner loop one next line . 
-- Here j=outer lines, and i=for printing the stars as long as i<=i.
*/