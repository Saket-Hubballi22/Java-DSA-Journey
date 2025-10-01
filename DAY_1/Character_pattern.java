package DAY_1;

public class Character_pattern {
    public static void main(String[] args) {
        int i,j,n=4;
        char ch='A';

        for(j=1;j<=n;j++){
            for(i=1;i<=j;i++){
                System.out.print(ch);
                ch++;
            }
            System.out.println("");
            
        }
    }
    
}
