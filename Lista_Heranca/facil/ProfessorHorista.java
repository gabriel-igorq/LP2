public class ProfessorHorista extends Professor{

    private int total_horas;
    private float salario_hora;

    public ProfessorHorista(String nome, String matricula, int idade, int total_horas, float salario_hora){
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

    public float getSalarioHora(){
        return salario_hora;
    }

    public void setSalarioHora(float salario_hora){
        this.salario_hora = salario_hora;
    }

    public float Salario(){
        return salario_hora*total_horas;
    }
}
