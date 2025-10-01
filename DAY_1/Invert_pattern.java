package DAY_1;

public class Invert_pattern {
    public static void main(String[] args) {
        int i,j,n=7;
        for(j=1;j<=n;j++){
            for(i=1;i<=n-j+1;i++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    
}

// Using Single Loop 

// public class Invert_pattern {
//     public static void main(String[] args) {
//         int n = 7;
//         for(int j = n; j >= 1; j--) {
//             System.out.println("*".repeat(j));  // repeat() is available from Java 11
//         }
//     }
// }

