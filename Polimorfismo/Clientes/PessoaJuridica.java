public class PessoaJuridica extends Cliente{
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

    public void setNomeFantasia(String nf){
        nomeFantasia = nf;
    }

    public void imprimirDados(){
        super.imprimirDados();
        System.out.println("CNPJ: " + cnpj);
        System.out.println("Nome fantasia da empresa: " + nomeFantasia);
    }
}
