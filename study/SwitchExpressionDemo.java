package study;

public class SwitchExpressionDemo {
    public static void main(String[] args) {
        int month=6;
        String season;
        season=switch(month){
            case 12,1,2->{
                yield "¶¬¼¾";
            }
            case 3,4,5->{
                yield "´º¼¾";
            }
            case 6,7,8->{
                yield "ÏÄ¼¾";
            }
            case 9,10,11->{
                yield "Çï¼¾";
            }
    
            default->{
                yield "err!";
            }
        };
        System.out.println(month+"ÔÂÊôÓÚ"+season+".");
    }
    
}
