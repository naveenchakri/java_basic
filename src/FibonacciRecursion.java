import java.util.Scanner;

public class FibonacciRecursion{
    static int n1 =0 , n2 =1 , n3;
    static void print(int count){
        if(count>0){
            n3 = n1 + n2;
            System.out.print(" "+n3);
            n1 = n2;
            n2 = n3;
            print(count-1);
        }
    }

    public static void main (String[] args){
        System.out.println(" Enter :");
        Scanner sc = new Scanner(System.in);
        int count = Integer.parseInt(sc.nextLine());
        System.out.print(n1+" "+n2);
        print(count-2);
    }

}