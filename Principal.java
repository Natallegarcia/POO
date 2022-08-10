package exercicioUA1;

public class Principal {

	public static void main(String[] args) {
	
		Aluno cadAluno = new Aluno ();
		
		cadAluno.nome = "Rafael";
		cadAluno.endereco = "Av. das Nações qd 31 lt 24 Setor Novo Goiânia-Goiás ";
		cadAluno.telefone = "62 3513- 2457";
		cadAluno.matricula = 2022010825;
		cadAluno.email = "rafael2022@gmail.com";
		
		System.out.println ("Cadastro do aluno");
		System.out.println ("NOME:  " +  cadAluno.nome);
		System.out.println ("ENDEREÇO:  " +  cadAluno.endereco);
		System.out.println ("TELEFONE:  " +  cadAluno.telefone);
		System.out.println ("MATRÍCULA:  " +  cadAluno.matricula);
		System.out.println ("EMAIL:  " +  cadAluno.email);

}
}
 