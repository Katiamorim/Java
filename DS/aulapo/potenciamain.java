public class potenciamain {
    public static void main(String[] args) {


        potencia po = new potencia();

        po.setNum(3);
        po.setNum1(2);

        po.calcular_potencia();

        System.out.println("O número base é: "+ po.getNum() + " e a potência escolhida é: "+ po.getNum1());
        System.out.println("O resultado é: "+ po.calcular_potencia());

    }
}
