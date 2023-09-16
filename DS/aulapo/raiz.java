import java.lang.Math;

public class raiz {


    public double getNum() {
        return num;
    }

    public void setNum(double num) {
        this.num = num;
    }

    public double num;

    public double calcular_raiz() {
        return Math.sqrt(getNum());

    }

}
