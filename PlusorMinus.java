import java.util.Scanner;

public class PlusorMinus {
    public static void main(String ARGS[]) {
        Scanner sc = new Scanner(System.in);
    int t=sc.nextInt();
    for(int i=0;i<t;i++){
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a+b==c)
            System.out.println("+");
        else
            System.out.println("-");
    }
    }
}
