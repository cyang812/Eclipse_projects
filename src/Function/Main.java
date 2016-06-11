package Function;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Fraction a = new Fraction(in.nextInt(), in.nextInt());
        Fraction b = new Fraction(in.nextInt(),in.nextInt());
        a.print();
        b.print();
        a.plus(b).print();
        a.multiply(b).plus(new Fraction(5,6)).print();
        a.print();
        b.print();
        in.close();
    }

}

    class Fraction{
       int a;
       int b;
       int c;
       int d;
        Fraction(int a,int b) {
            //toDouble(a, b);
            this.a = a;
            this.b = b;
        }
    
        Fraction plus(Fraction y){
             c = this.a*y.b+y.a*this.b;
             d = this.b*y.b;
             return new Fraction(c,d);
        }
        
        Fraction multiply(Fraction y) {
            c = this.a*y.a;
            d = this.b*y.b;
            return new Fraction(c,d);
        }
        
        void print() {
            if (a==b) {
                System.out.println(1);
            }else {
                int z = this.gcd(a, b);
                if (z==1) {
                    System.out.println(a+"/"+b);
                }else {
                    System.out.println((a/z)+"/"+(b/z));    
                }
            }
        }
        
        
        //用于寻找两个数的最大公约数
        int gcd(int a,int b) {
             int x = a;
             a = b;
             b = x%b;
             if(b==0) {
                return a;
             }
             return gcd(a,b);
         }
        
     }