public class Produto{
    private String nome;
    private float preco;
    private String marca;
    private String descricao;
    private String data_fabricacao;

    public Produto(String nome, float preco, String marca, String descricao, String fab){
        this.nome = nome;
        this.preco = preco;
        this.marca = marca;
        this.descricao = descricao;
        this.data_fabricacao = fab;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public float getPreco(){
        return preco;
    }

    public void setPreco(float preco){
        this.preco = preco;
    }

    public String getMarca(){
        return marca;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public String getDescricao(){
        return descricao;
    }

    public void setDescricao(String desc){
        this.descricao = desc;
    }

    public String getData(){
        return data_fabricacao;
    }

    public void setData(String fab){
        this.data_fabricacao = fab;
    }
}
