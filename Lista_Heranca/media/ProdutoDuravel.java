public class ProdutoDuravel extends Produto{
    private String material;
    private int durabilidade;

    public ProdutoDuravel(String nome, float preco, String marca, String marca, String descricao, String fabricacao, String material, int durabilidade){
        super(nome, preco, marca, descricao, fabricacao);
        this.material = material;
        this.durabilidade = durabilidade;
    }

    public String getMaterial(){
        return material;
    }

    public void setMaterial(String material){
        this.material = material;
    }

    public int getDurabilidade(){
        return durabilidade;
    }

    public void setDurabilidade(int durabilidade){
        this.durabilidade = durabilidade;
    }
}
