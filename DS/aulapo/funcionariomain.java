public class funcionariomain {

           public static void main(String[] args) {

            funcionarios f1 = new funcionarios();

            f1.setCodigo(1330);
            f1.setSalario(12000);
            f1.setCargo("Professor");
            f1.setNome("Oscar Junior");
            f1.setHe(10);
            f1.setDescontos(200);

            //chamar metodo ver_dados()

            f1.ver_dados();
            f1.calcula_sal(12000);


        }
    }

