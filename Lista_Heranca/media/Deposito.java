public class Deposito{
    
    ArrayList<Produto> deposito;    

    public Deposito(){
        deposito = new ArrayList<Produto>();
    }

    //Adicionar um produto no depósito
    public void Adicionar(Produto prod){
        deposito.add(prod);
    }

    //Remover um produto do depósito
    public void Remover(Produto prod){
        deposito.remove(prod);
    }

    //Informar a quantidade de produtos no depósito
    public void Quantidade(){
        System.out.println("Quantidade de produtos no depósito: " + deposito.size());
    }

    //Informa se o depósito está vazio
    public void Vazio(){
        boolean tmp = deposito.isEmpty();
        if(tmp){
            System.out.println("Depósito está vazio");
        } else {
            System.out.println("Depósito contém produtos");
        }
    }

    //Informa o produto com o maior valor
    public void Caro(){
        int max = 0;
        for(int i=1; i<deposito.size(); i++){
            if(deposito[i] > max){
                max = i;
            }
        }
        System.out.println("Produto com maior valor: "+ deposito[max].getNome());
    }
}
