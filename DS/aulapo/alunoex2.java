public class alunoex2 {

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }


    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    private String senha;
    protected String usuario;


    public void exibir_dados(){
        System.out.println("O nome do aluno é: "+ getUsuario());
        System.out.println(("A senha é: ")+ getSenha());

    }
}
