// import java.util.Scanner;

// public class reverse {
//     public static void main(String[] args) {
//         Scanner in = new Scanner(System.in);
//         int n=in.nextInt();
//         int rev=0;
//         while(n>0){
//             int r=n%10;
//             rev=rev*10+r;
//             n=n/10;
//         }
//         System.out.println("Reverse : "+rev);
//     }
// }


// Reverse in method 

class reverse{
    static int rev(int n){
        int R=0;
        while(n>0){
            int r=n%10;
            R=R*10+r;
            n/=10;
        }
        return R;
    }
    public static void main(String[] args) {
        int result=rev(1234);
        System.out.println(result);
    }
}