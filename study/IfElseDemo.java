package study;

public class IfElseDemo {
    public static void main(String[] args) {
        int month=9;
        String season;
        if(month==12||month==1||month==2)
        season="����";
        else if(month==3||month==4||month==5)
        season="����";
        else if(month==6||month==7||month==8)
        season="�ļ�";
        else if(month==9||month==10||month==11)
        season="�＾";
        else 
        season="err!";
        System.out.println(month+"������"+season+".");
    }
}
