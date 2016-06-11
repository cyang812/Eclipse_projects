package clock;

public class Display {

    int value = 0;
    int limit = 0;
    
    public void increase() {
        this.value++;
        if (value == limit) {
            value = 0;
        }
    }
   
    public void setLimit(int x) {
        this.limit = x;
        
    }
    
    public int getValue() {
        return value;
    }
    
//    public static void main(String[] args) {
//        Display d1 = new Display();
//        while (true) {
//            d1.limit = 60;
//            d1.increase();
//         System.err.println(d1.getValue());
//        }
//    }

}
