package study;

public class chick {
    public static void main(String[] args) {
        int count=0;
        for(int i=1;i<=100/5;i++){
            for(int j=1;j<=100/3;j++){
                for(float k=0;k<=100*3;k++){
                    if((5*i+3*j+k/3==100)&&(i+j+k==100)){
                        System.out.println("����"+i+"ĸ��"+j+"С��"+k);
                        count++;

                }


            }
        }

    }
    System.out.println("һ����"+count+"����");
    }
}
