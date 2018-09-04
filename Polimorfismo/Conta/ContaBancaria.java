public class ContaBancaria(){
    private String cliente;
    private int num_conta;
    private double saldo;

    public ContaBancaria(String c, int n, double s){
        cliente = c;
        num_conta = n;
        saldo = s;
    }

    public void sacar(double valor){
        if(valor <= 0){
            System.out.println("Valor inválido");
        } else if(valor > saldo){
            System.out.println("Saldo insuficiente");
        } else{
            saldo = saldo - valor;
            System.out.println("Operação realizada com sucesso");
            System.out.println("Valor do saque: " + valor);
            System.out.println("Saldo atual: " + saldo);
        }
    }

    public void depositar(double valor){
        if(valor <= 0){
            System.out.println("Valor inválido");
        } else{
            saldo = saldo + valor;
            System.out.println("Operação realizada com sucesso");
            System.out.println("Valor do depósito: " + valor);
            System.out.println("Saldo atual: " + saldo);
        }
    }

    public String toString(){
        
    }
}
