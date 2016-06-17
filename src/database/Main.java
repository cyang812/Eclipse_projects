package database;

public class Main {

    public static void main(String[] args) {
            Data cd = new Data();
            Data mp3 = new Mp3("the ture","abc",30,200);
            Data dvd = new Data();

            cd = new Mp3("the ture","abc",30,200);
            
            cd.pritnData();
            mp3.pritnData();
            dvd.pritnData();
    }

}
