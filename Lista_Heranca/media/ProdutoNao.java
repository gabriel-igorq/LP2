public class ProdutoNao extends Produto{
    private String validade;
    private String genero;

    public ProdutoNao(){
        super();
        this.validade = validade;
        this.genero = genero;
    }

    public String getValidade(){
        return validade;
    }

    public void setValidade(String validade){
        this.validade = validade;
    }

    public String getGenero(){
        return genero;
    }

    public void setGenero(String genero){
        this.genero = genero;
    }  
}
