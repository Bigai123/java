package study;

public class SampleContinue {
    public static void main(String args[]){
        for(int i=1;i<20;i++){
            System.out.println(i+" ");
            if(i%5!=0)
            continue;
            System.out.println();
        }
    }
    
}
