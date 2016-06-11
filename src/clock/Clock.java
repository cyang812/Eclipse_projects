package clock;

public class Clock {
    
    Display ss = new Display();
    Display mm = new Display();
    Display tt = new Display();

    public Clock (int t,int m,int s) {
        ss.value = s;
        mm.value = m;
        tt.value = t;
        ss.setLimit(60);
        mm.setLimit(60);
        tt.setLimit(24);
    }
    
    public void tick() {
        ss.increase();
        if (ss.value == 0) {
            mm.increase();
            if (mm.value == 0) {
                tt.increase();
            }
        }
    }
    
    public String toString() {
        return String.format("%02d:%02d:%02d",tt.value,mm.value,ss.value);
    }
    
//    public static void main(String[] args) {
//        Clock clock = new Clock();
//        clock.ss.limit = 60;
//        clock.mm.limit = 60;
//        clock.tt.limit = 24;
//        for(;;) {
//            clock.tick();
//            System.out.printf("%02d:%02d:%02d\n", clock.tt.value,clock.mm.value,clock.ss.value);
//        }
//    }
}
