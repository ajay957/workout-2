import java.util.Scanner;

class MathFunction{

    void multiply(int x,int y){

        int s=x*y;
        System.out.println("the multiplication is:"+s);
    }

   void multiply(int x, float y){

       float s1=x*y;
       System.out.println("the multiplication is:"+s1);
    }

    void multiply(float x,float y) {

        float s2 = x * y;
        System.out.println("the multiplication is:"+s2);
    }

}
class Multiplication
{
    public static void main(String[] args) {

        MathFunction obj1=new MathFunction();
        obj1.multiply(10,10);
        obj1.multiply(20, (float) 39.6);
        obj1.multiply(3.5F, (float) 5.8);

    }
}
