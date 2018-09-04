import java.util.ArrayList;

public class Sistema{
    
    ArrayList<Cliente> sistema;    

    public Sistema(){
        sistema = new ArrayList<Cliente>();
    }

    //Adicionar um produto no depósito
    public void adicionar(Cliente prod){
        sistema.add(prod);
    }

    //Remover um produto do depósito
    public void remover(Cliente prod){
        sistema.remove(prod);
    }

    //Informar a quantidade total de clientes
    public void total(){
        System.out.println("Quantidade de clientes cadastrados: " + sistema.size());
    }

    public void qntFisicas(){
        int cont = 0;
        for(Cliente cliente: sistema){
            if(cliente instanceof PessoaFisica){
                cont++;
            }
        }
        System.out.println("Quantidade de Pessoas Físicas: " + cont);
    }

    public void qntJuridicas(){
        int cont = 0;
        for(Cliente cliente: sistema){
            if(cliente instanceof PessoaJuridica){
                cont++;
            }
        }
        System.out.println("Quantidade de Pessoas Físicas: " + cont);
    }
}
