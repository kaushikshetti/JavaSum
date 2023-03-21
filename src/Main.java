import java.util.*;

class HelloWorld{
    public static void main(String[] args)
    {
        int a,b,sum;
        System.out.println("Enter number 1");
        Scanner input=new Scanner(System.in);
        a= input.nextInt();
        System.out.println("Enter Number 2");
        b=input.nextInt();
        sum=a+b;
        System.out.println("The sum of 2 number is "+sum);
    }
}