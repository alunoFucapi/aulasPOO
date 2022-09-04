package primeiro;

public class Pessoa {

	String nome;
	String cpf;
	int idade;
	float energia;

	Pessoa(){
		nome = "nome";
		cpf = "cpf";
		idade = 0;
		energia = 0;
	}
	
	Pessoa(String nome){
		this.nome = nome;
		cpf = "cpf";
		idade = 0;
		energia = 0.1f;
	}
	
	Pessoa(String nome, int idade){
		this.nome = nome;
		cpf = "cpf";
		this.idade = idade;
		energia = 0.1f;
	}
	
	Pessoa(String nome, int idade, String cpf){
		this.nome = nome;
		this.cpf = cpf;
		if(idade > 0){
		System.out.println("Idade deve ser 0");
		//this.idade = 2;
		}else{
			this.idade = idade;
		}
		energia = 0.1f;
		}
	
	void fazerAniversario(){
		idade++;
	}
	
	void imprimir(){
		System.out.println("Nome: " + nome + " CPF: " + cpf + " Idade: " + idade + " Energia: " + energia);
	
	/*
	System.out.println("Nome: " + nome);
	System.out.println("CPF: " + cpf);
	System.out.println("Idade: " + idade);
	System.out.println("Energia: " + energia);
	System.out.println("---------------------");
	*/
	}
	
	void comer(){
		energia++;
	}
	
	void trabalhar(){
		energia = energia - 2;
	}

}
