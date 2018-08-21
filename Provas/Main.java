public class Main{
	public static void main(String[] args){
		Prova p1, p2, p3, p4, p5, p6;
		p1 = new Prova(4.0, 2.5);
		p2 = new Prova(1.0, 7.0);
		p3 = new Prova(6.5, 3.5);
		p4 = new Prova(0.0, 3.0);
		p5 = new Prova(5.0, 4.0);
		p6 = new Prova(6.0, 1.5);
		Aluno a1, a2, a3;
		a1 = new Aluno(p1, p2);
		a2 = new Aluno(p3, p4);
		a3 = new Aluno(p5, p6);
		Turma lp;
		lp = new Turma(a1, a2, a3);
		//Média dos alunos
		System.out.println("Média do aluno 1: " + a1.calcularMedia());
		System.out.println("Média do aluno 2: " + a2.calcularMedia());
		System.out.println("Média do aluno 3: " + a3.calcularMedia());

		//Média da turma
		System.out.println("Média da turma: " + lp.calcularMedia());
	}
}
