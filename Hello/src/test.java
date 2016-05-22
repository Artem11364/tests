

/**
 * Created by God on 22.05.2016.
 */
public class test {

    int n;

    public static int  number(int n){
        int summ = 0;

        for(int nn=n ; nn != 0; nn /= 10)
        {
            summ = summ + (nn % 10);
        }


        return summ;
    }

    public static void  doubleInt(double d){
        int n=0;

        if ((d-(int)d)<0.5 ){
            System.out.println((int)d);
        } else  System.out.println((int)d+1);


    }


    public static void division(int q, int w){
        double d = (double)q/(double)w;
        if ((int)d - d !=0){
            int re = q-((int)d)*w;
            System.out.println(q + "/"+w+"="+(int)d +" residual: "  +re  );
        } else  System.out.println((int)d );
    }

    public static void randomNumber(){
        double d = Math.random()*6-3;
        System.out.println(d );
    }

    public static void randomNumberN(int n){

        double d = Math.random()*2*n-n;
        System.out.println(d );
    }
    public static void randomNumberAB(int a, int b){

        double d = a + (Math.random() * ((b - a) ));
        System.out.println(d );

    }
    public static void cosinus(){
    int a=40,b=45,c=60;
    double aRad=a*Math.PI/180;
    double bRad=b*Math.PI/180;
    double cRad=c*Math.PI/180;
    System.out.println("cos(" +a+ ") =" + (float)Math.cos(aRad));
    System.out.println("cos(" +b+ ") =" +(float)Math.cos(bRad));
    System.out.println("cos(" +c+ ") =" +(float)Math.cos(cRad));
}
    public static void triangle( double a, double  b){
        System.out.println( "area of a triangle: "+a*b/2);
        double c = Math.sqrt(a*a+b*b);
        double p=a+b+c;
        System.out.println( "perimeter of the triangle: "+ p);
    }

public static void main(String args []){
    System.out.println(number(120));
    doubleInt(1.57);
    division(43,11);
    randomNumber();
    randomNumberN(10);
    randomNumberAB(1, 15);
    cosinus();
    triangle(3.0,4.0);
}


}
