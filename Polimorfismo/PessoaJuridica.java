public class PessoaJuridica{
    private String cnpj;
    private String nomeFantasia;

    public PessoaJuridica(String n, String e, String t, String c, String nf){
        super(n, e, t);
        cnpj = c;
        nomeFantasia = nf;
    }

    public String getCnpj(){
        return cnpj;
    }

    public String getNomeFantasia(){
        return nomeFantasia;
    }

    public String setNomeFantasia(String nf){
        nomeFantasia = nf;
    }

    public void ImprimirDados(){

    }
}
