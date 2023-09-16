public class raizmain {
    public static void main(String[] args) {
        raiz n = new raiz();

        n.setNum(25);

        n.calcular_raiz();

        System.out.println("O número é: "+ n.getNum());
        System.out.println("O valor da raiz é: "+ n.calcular_raiz());
    }
}
