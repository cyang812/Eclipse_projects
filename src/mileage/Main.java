package mileage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

class Mileage {

     public ArrayList<String> cityList = new ArrayList<String>();
     public HashMap<String,Integer> mileage= new HashMap<String,Integer>();
     
    public void addCity(String e) {        
        if (!e.equals("###")) {
            cityList.add(e);
        }else {
        }
    }
    
    public void addmileage(int i,int j,int m) {
        mileage.put(""+cityList.get(i)+"-"+""+cityList.get(j), m);       
    }
    
    public int getMileage(String s) {
        return mileage.get(s);
    }
}

class Main{
    public static void main(String[] args) {
        Mileage cityMileage = new Mileage();
        Scanner in = new Scanner(System.in);
        String ac = in.next();
        do {
            cityMileage.addCity(ac);
            ac = in.next();
        } while (!ac.equals("###"));   
        
        int size = cityMileage.cityList.size();
        for (int i=0;i<size;i++ ) {
            for(int j=0;j<size;j++) {
                int mileage = in.nextInt();
                cityMileage.addmileage(i, j, mileage);
            }
        }
        
        String cityOne = in.next();
        String cityTwo = in.next();
        in.close();
        System.out.println("the distance of "+""+cityOne+" and "+""+cityTwo);
        int mileage = cityMileage.getMileage(""+cityOne+"-"+""+cityTwo);
        System.out.println(mileage);
    }

}
