public class PessoaFisica extends Cliente{
    private String cpf;

    public PessoaFisica(String n, String e, String t, String c){
        super(n, e, t);
        cpf = c;
    }

    public String getCpf(){
        return cpf;
    }

    public void imprimirDados(){
        super.imprimirDados();
        System.out.println("CPF: " + cpf);        
    }
}
