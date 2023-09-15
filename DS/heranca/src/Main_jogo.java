import javax.swing.*;

public class Main_jogo {

    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Digite o nome do Jogo ");
        String cate = JOptionPane.showInputDialog("Digite a categoria do Jogo ");
        String gene = JOptionPane.showInputDialog("Digite o genero do jogo ");
        double pre = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço "));
        int qtd = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade "));
        String po = JOptionPane.showInputDialog("Digite o país de Origem ");
        String mo = JOptionPane.showInputDialog("Digite o modelo ");


        JogoDeCarta jdc = new JogoDeCarta(nome, cate, gene, pre); //classe filha
        jdc.qtd_cart = qtd;

        JogoDeTabuleiro jdt = new JogoDeTabuleiro(nome, cate, gene, pre); //classe filha
        jdt.qtd_pec = qtd;

        Video_Game vd = new Video_Game(nome, cate, gene, pre); //classe filha
        vd.pais_origem = po;
        vd.mod = mo;


        JOptionPane.showMessageDialog(null, "O nome do jogo é: "+ nome);
        JOptionPane.showMessageDialog(null, "A categoria do jogo é: " + cate);
        JOptionPane.showMessageDialog(null, "O gênero do jogo é: "+gene);
        JOptionPane.showMessageDialog(null, "O preço do jogo é: "+pre);
        JOptionPane.showMessageDialog(null, "A quantidade é: "+qtd);
        JOptionPane.showMessageDialog(null, "O país de origem é: "+po);
        JOptionPane.showMessageDialog(null, "O modelo é: "+mo);
    }
}
