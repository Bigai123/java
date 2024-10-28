package study;

public class Fibonacci {
    public static void main(String[] args) {
        long f1,f2,f3,n=40;
        f1=f2=1;
        System.out.print(f1+" "+f2+" ");
        for(int i=1;i<=n;i++){
            f3=f1+f2;
            f1=f2;
            f2=f3;
            System.out.print(f3+" ");
            if(i%10==0)
            {System.out.println();}
        }
    }
    
}
