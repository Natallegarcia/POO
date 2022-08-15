package controle;

import modelo.ClienteCadastro;
import modelo.VeiculoCadastro;

public class Principal {

	public static void main(String[] args) {
		ClienteCadastro cliente = new ClienteCadastro();
		VeiculoCadastro veiculo = new VeiculoCadastro ();
		
		cliente.nome = "Larissa";
		cliente.endereco = "Av. das Nações qd 31 lt 24 Setor Novo Goiânia-Goiás ";
		cliente.fone =  "62 3513- 2457";
		cliente.email = "larissamorais@gmail.com";
		cliente.cpf = "856794658611";
		
		veiculo.modelo = "ONIX";
		veiculo.fabricante = "Chevrolet";
		veiculo.cor = "prata";
		veiculo.ano = 2016;
		veiculo.placa = "NGD 1579";
		
		System.out.println ("CADASTRO");
		System.out.println ("NOME:  " +  cliente.nome);
		System.out.println ("ENDEREÇO:  " +  cliente.endereco);
		System.out.println ("TELEFONE:  " +  cliente.fone);
		System.out.println ("MATRÍCULA:  " +  cliente.cpf);
		System.out.println ("EMAIL:  " +  cliente.email);
		
		System.out.println ("VEÍCULO");
		System.out.println ("MODELO:  " +  veiculo.modelo);
		System.out.println ("FABRICANTE:  " +  veiculo.fabricante);
		System.out.println ("COR:  " +  veiculo.cor);
		System.out.println ("ANO:  " +  veiculo.ano);
		System.out.println ("REGISTRO PLACA:  " +  veiculo.placa);
		
	}

}
