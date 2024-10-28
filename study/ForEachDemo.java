package study;

public class ForEachDemo {
    public static void main(String[] args) {
        int sum=0;
        int a[]=new int[] {1,2,3,4,5,6,7,8,9};
        for(int e:a)
        sum+=e;
        System.out.println("the sum is "+sum);
    }
    
}
