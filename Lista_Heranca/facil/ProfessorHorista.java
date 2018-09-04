public class ProfessorHorista extends Professor{

    private int total_horas;
    private String salario_hora;

    public ProfessorHorista(String nome, String matricula, int idade, int total_horas, String salario_hora){
        super(nome, matricula, idade);
        this.total_horas = total_horas;
        this.salario_hora = salario_hora;
    }

    public int getTotal(){
        return total_horas;
    }

    public void setTotal(int total){
        this.total_horas = total;
    }

    public String getSalarioHora(){
        return salario_hora;
    }

    public void setSalarioHora(String salario_hora){
        this.salario_hora = salario_hora;
    }

    public int Salario(){
        int tmp = Integer.parseInt(salario_hora); 
        return tmp*total_horas;
    }
}
