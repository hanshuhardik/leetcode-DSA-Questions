import java.util.Scanner;

public class Buttons {
    public static void main(String ARGS[]) {
        Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    for(int i=0;i<n;i++){
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a>b){
            System.out.println("First");
        }
        else if(a<b){
            System.out.println("Second");
        }
        else {
            if((c)%2==0){
                System.out.println("Second");
            }
            else
                System.out.println("First");
        }
    }
    }
}
