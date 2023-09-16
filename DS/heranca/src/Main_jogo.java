import javax.swing.*;

public class Main_jogo {

    public static void main(String[] args) {

        int num1 = 0;
        do {
            int opcao = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção do JOGO  1-Cartas 2-Tabuleiro 3-Video Game"));
            if(opcao < 4){
            String nome = JOptionPane.showInputDialog("Digite o nome do Jogo ");
            String cate = JOptionPane.showInputDialog("Digite a categoria do Jogo ");
            String gene = JOptionPane.showInputDialog("Digite o genero do jogo ");
            double pre = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço do jogo "));
            int qtd = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade: "));

            switch (opcao) {
                case 1:
                    JogoDeCarta jc = new JogoDeCarta(nome, cate, gene, pre);
                    jc.qtd_cart = qtd;
                    JOptionPane.showMessageDialog(null, "Nome do jogo: " + jc.nome_do_jogo);
                    JOptionPane.showMessageDialog(null, "Categoria jogo: " + jc.cate);
                    JOptionPane.showMessageDialog(null, "Gênero jogo: " + jc.gen);
                    JOptionPane.showMessageDialog(null, "Preço jogo: " + jc.pre);
                    JOptionPane.showMessageDialog(null, "Quantidade: " + jc.qtd_cart);
                    break;
                case 2:
                    JogoDeTabuleiro jt = new JogoDeTabuleiro(nome, cate, gene, pre);
                    jt.qtd_pec = qtd;
                    JOptionPane.showMessageDialog(null, "Nome do jogo: " + jt.nome_do_jogo);
                    JOptionPane.showMessageDialog(null, "Categoria jogo: " + jt.cate);
                    JOptionPane.showMessageDialog(null, "Gênero jogo: " + jt.gen);
                    JOptionPane.showMessageDialog(null, "Preço jogo: " + jt.pre);
                    JOptionPane.showMessageDialog(null, "Quantidade: " + jt.qtd_pec);
                    break;
                case 3:
                    String pais_origem = JOptionPane.showInputDialog("Digite o pais de origem: ");
                    String modelo = JOptionPane.showInputDialog("Digite o modelo: ");
                    Video_Game vg = new Video_Game(nome, cate, gene, pre);
                    vg.pais_origem = pais_origem;
                    vg.mod = modelo;
                    JOptionPane.showMessageDialog(null, "Nome do jogo: " + vg.nome_do_jogo);
                    JOptionPane.showMessageDialog(null, "Categoria jogo: " + vg.cate);
                    JOptionPane.showMessageDialog(null, "Gênero jogo: " + vg.gen);
                    JOptionPane.showMessageDialog(null, "Preço jogo: " + vg.pre);
                    JOptionPane.showMessageDialog(null, "Pais origem: " + vg.pais_origem);
                    JOptionPane.showMessageDialog(null, "Modelo: " + vg.mod);
                    break;
            }

                }
            else{

                JOptionPane.showMessageDialog(null, "Incorrect option");

            }

            }
            while (num1 < 4) ;


        }
    }

