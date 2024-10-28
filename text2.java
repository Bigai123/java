public class text2 {
    public static void main(String [] args) {
        int a[] = {78,23,56,34,12,45,67,89};
        for(int i = 0;i<8;i++) {
        for(int j = 0;j<7-i;j++) {
        if (a[j+1]<a[j]) {
        int t = a[j];
        a[j] = a[j+1];
        a[j+1] = t;}
     }
    }
    for(int i=0;i<8;i++)
    System.out.println(a[i]+"\t");
    }
    
}