public class Clock {
    int hour;
    int minute;
    int second;
    Clock(int a,int b,int c){
        hour=a;
        minute=b;
        second=c;
    } 
    void show(){
        System.out.println("现在的时间是:"+hour+"时"+":"+minute+"分"+":"+second+"秒");
    }
    void set(int a,int b,int c){
        
    }
    void incSecond(){
        second=second+1;
        if(second==60){
            minute=minute+1;
            second=0;
        }
        if (minute==60) {
            hour=hour+1;
            minute=0;
        }
        if (hour==24) {
            hour=0;
        }
    }
        public static void main(String[] args) {
            Clock s=new Clock(0,0,0);
            s.show();
            s.incSecond();
            s.show();
            Clock s1=new Clock(0,0,59);
            s1.show();
            s1.incSecond();
            s1.show();
            Clock s2=new Clock(0,59,59);
            s2.show();
            s2.incSecond();
            s2.show();
            Clock s3=new Clock(23,59,59);
            s3.show();
            s3.incSecond();
            s3.show();
    }
}
