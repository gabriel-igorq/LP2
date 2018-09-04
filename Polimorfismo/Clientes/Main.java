import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        Sistema database = new Sistema();
    
        Cliente p1 = new PessoaFisica("JP'", "IMD", "97777777", "7776666969");
        database.adicionar(p1);
        Cliente j1 = new PessoaJuridica("Betcel", "Setor 3", "12921828", "1209210", "TTNG");
        database.adicionar(j1);
        Cliente p2 = new PessoaFisica("Vini", "Netoland", "77777", "120274201");
        database.adicionar(p2);
        p1.imprimirDados();        
        database.total();
        database.qntFisicas();
        database.qntJuridicas();
    }
}
