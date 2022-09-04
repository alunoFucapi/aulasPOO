package primeiro;

public class Principal {

	public static void main(String[] args) {

		/*
		System.out.println("Olá mundo!!!");

		String str;
		Pessoa pessoa1 = new Pessoa();
		pessoa1.nome = "Paulo";
		pessoa1.cpf = "123.456.789-00";
		pessoa1.idade = 22;
		pessoa1.energia = 77.7f;
		
		pessoa1.imprimir();
		
		Pessoa pessoa2 = new Pessoa();
		
		pessoa2.imprimir();
		
		Pessoa pessoa3 = new Pessoa("Joao");
		
		pessoa3.imprimir();
		
		Pessoa pessoa4 = new Pessoa("Alto", 33);
		
		pessoa4.imprimir();
		
		Pessoa pessoa5 = new Pessoa("Baixo", 37, "12345678900");

		pessoa5.imprimir();
		
		//System.out.println(pessoa1.nome);
		
		
		pessoa1.fazerAniversario();
		pessoa1.imprimir();

		pessoa1.comer();
		pessoa1.comer();
		pessoa1.comer();
		pessoa1.trabalhar();
		pessoa1.imprimir();

		pessoa1.comer();
		pessoa1.trabalhar();
		pessoa1.imprimir();

		pessoa1.comer();
		pessoa1.comer();
		pessoa1.trabalhar();
		pessoa1.imprimir();
		*/
		
		/*Carro1: Um de cor vermelho usando o construtor vazio e definindo o estado do carro acessando diretamente os atributos do objeto*/
		
		Carro carro1 = new Carro();
		carro1.numChassi = "11223344abcd";
		carro1.velocidadeMaxima = 180;
		carro1.quilometragem = 18273;
		carro1.potencia = 120;
		carro1.cor = "vermelho";
		carro1.qtdePortas = 4;
		carro1.velocidade = 0;
		carro1.marcha = 0;
		carro1.ligado = false;		
		carro1.imprimir();
		
		/*Carro2: cor preto usando o segundo construtor.*/
		
		Carro carro2 = new Carro("1a2b3c4d5e6f");
		carro2.cor = "preto";		
		carro2.imprimir();
		
		carro1.marcha = 4;
		carro1.marcha(4);
		carro1.imprimir();
		
		carro2.marcha = 6;
		carro2.marcha(6);
		carro2.imprimir();
		
		carro1.ligar();
		carro1.acelerar();
		carro1.imprimir();
		carro1.acelerar();
		carro1.acelerar();
		carro1.acelerar();
		carro1.imprimir();
		carro1.acelerar();
		carro1.acelerar();
		carro1.imprimir();
		carro1.acelerar();
		carro1.acelerar();
		carro1.imprimir();
		carro1.acelerar();
		carro1.acelerar();
		carro1.acelerar();
		carro1.imprimir();
		carro1.acelerar();
		carro1.acelerar();
		carro1.imprimir();
		carro1.acelerar();
		carro1.acelerar();
		carro1.imprimir();
		carro1.acelerar();
		carro1.acelerar();
		carro1.acelerar();
		carro1.imprimir();
		
		carro2.imprimir();
		carro2.ligar();
		carro2.imprimir();
		carro2.reduzirMarcha();
		carro2.imprimir();
		carro2.reduzirMarcha();
		carro2.reduzirMarcha();
		carro2.reduzirMarcha();
		carro2.reduzirMarcha();
		carro2.imprimir();
		carro2.acelerar();
		carro2.imprimir();
		carro2.acelerar();
		carro2.acelerar();
		carro2.acelerar();
		carro2.imprimir();
		carro2.acelerar();
		carro2.acelerar();
		carro2.imprimir();
		carro2.acelerar();
		carro2.acelerar();
		carro2.imprimir();
		carro2.acelerar();
		carro2.acelerar();
		carro2.acelerar();
		carro2.imprimir();
		carro2.acelerar();
		carro2.acelerar();
		carro2.imprimir();
		carro2.acelerar();
		carro2.acelerar();
		carro2.imprimir();
		carro2.acelerar();
		carro2.acelerar();
		carro2.acelerar();
		carro2.imprimir();
	}

}
