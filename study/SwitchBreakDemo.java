package study;

public class SwitchBreakDemo {
    public static void main(String[] args) {
        int month=6;
        String season;
        switch(month){
            case 12:
            case 1:
            case 2:
            season="����";
            break;
            case 3:
            case 4:
            case 5:
            season="����";
            break;
            case 6:
            case 7:
            case 8:
            season="�ļ�";
            break;
            case 9:
            case 10:
            case 11:
            season="�＾";
            break;
            default:
            season="err!";
        }
        System.out.println(month+"������"+season+".");
    }
    
}
