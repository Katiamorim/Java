public class funcionarios {

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public float getVendas() {
        return vendas;
    }

    public void setVendas(float vendas) {
        this.vendas = vendas;
    }

    public float getHe() {
        return he;
    }

    public void setHe(float he) {
        this.he = he;
    }

    public float getDescontos() {
        return descontos;
    }

    public void setDescontos(float descontos) {
        this.descontos = descontos;
    }
    //atributos da classe funcionarios

    public int codigo;
    public String nome;
    protected float salario;
    public String cargo;
    public float vendas;
    public float he; //horas extras
    public float descontos;

    //metodos da classe funcionários

    //método sem retorno e sem parâmetro
    public void ver_dados(){
        System.out.println("Codigo: "+ getCodigo());
        System.out.println("Nome: "+ getNome());
        System.out.println("Salário: "+ getSalario());
        System.out.println("Cargo: "+ getCargo());
        System.out.println("Vendas: "+ getVendas());
        System.out.println("Horas Extras: "+ getHe());
        System.out.println("Descontos: "+ getDescontos());
        System.out.println(".................................");
    }
    //método com retorno sem parâmetro
    public float calc_he(){
        setHe(((getSalario())/220)*getHe());
        return getHe();
    }

    //método com retorno e com parâmetro
    public float calc_descontos(float desc) {
        setDescontos(desc);
        if (getSalario() > 0) {
            System.out.println("Salário líquido: "+ getSalario());
        }
        return getSalario();
    }

    //método sem retorno e com parâmetro

    public void calcula_sal(float sal){

        if(sal > 4000 ){
            setSalario(getSalario()-getDescontos()+((getSalario()/220*getHe())));
            System.out.println("Salário Liquido: "+ getSalario());
        }
    }
}


