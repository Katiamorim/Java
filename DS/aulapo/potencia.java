import java.lang.Math;

public class potencia {



    public double getNum() {
        return num;
    }

    public void setNum(double num) {
        this.num = num;
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double num;
    public double num1;

    public double calcular_potencia(){
        return Math.pow(getNum(), getNum1());

    };

}
