package JavaLabTestQuestion_1;

public class Numeric {
    public static double intPower(double x,int n){

        if(n>0 && n%2==0){

            double power = Math.pow(Math.pow(x,n/2.0),2);
            return power;
        }
        else if(n>0 && n%2!=0){

            double power = Math.pow(x,n-1)*x;
            return power;
        }
        else {

            double power = 1.0/Math.pow(x,-n);
            return power;
        }

    }
}
