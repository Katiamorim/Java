public class trianguloex1 {

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double base;
    public double altura;

    public double area;



    //public void area_tri(){
    //  System.out.println("A área do triângulo é: "+ getArea());
    //}

    public double calcular_Area() {
        setArea((getBase() * getAltura()) / 2);
        return getArea();



    }

}
