public class Main{
    public static void main(String[] args ){
        ProfessorRegime regime = new ProfessorRegime("Thanos","20129030", 35, 10000);
        ProfessorHorista horista = new ProfessorHorista("Samyr", "20109021", 43, 20, 230); 
    
        System.out.println("Dados do Professor Integral:");
        System.out.println("Nome: "+ regime.getNome());
        System.out.println("Matricula: "+ regime.getMatricula());
        System.out.println("Idade: "+ regime.getIdade());
        System.out.println("Salario: "+ regime.getSalario());

        System.out.println("Dados do Professor Horista:");
        System.out.println("Nome: "+ horista.getNome());
        System.out.println("Matricula: "+ horista.getMatricula());
        System.out.println("Idade: "+ horista.getIdade());
        System.out.println("Salário: "+ horista.Salario());
    } 
}
