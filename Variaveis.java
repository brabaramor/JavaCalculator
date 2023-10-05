/* Criando e iniciando as variáveis que serão utilizadas no método principal */
public class Variaveis {
    private String operacao;
    private double num1;
    private double num2;

//Métodos construtores
    public Variaveis (String operacao, double num1, double num2){
    this.operacao = operacao;
    this.num1 = num1;
    this.num2 = num2;

    }

/*Métodos de acesso*/
    // operacao
    public String getOperacao(){
        return operacao;
    }

    public void setOperacao(String operacao){
        this.operacao = operacao;
    }

    //num1
    public double getNum1(){
        return num1;
    }

    public void setNum1(double num1){
        this.num1 = num1;
    }

    //num2
    public double getNum2(){
        return num2;
    }

    public void setNum2(double num2){
        this.num2 = num2;
    }
}
