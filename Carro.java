package primeiro;

public class Carro {
	
	String numChassi;
	double velocidadeMaxima;
	double quilometragem;
	double potencia;
	String cor;
	int qtdePortas;
	double velocidade;
	int marcha;
	boolean ligado;
	
	Carro(){

	}
	
	Carro(String numChassi){
		this.numChassi = numChassi;
		velocidadeMaxima = 180;
		quilometragem = 0;
		potencia = 80;
		cor = "branco";
		qtdePortas = 4;
		velocidade = 0;
		marcha = 0;
		ligado = false;
	}
	
	boolean ligar(){
		ligado = true;
		return true;
	}
	
	boolean desligar(){
		ligado = false;
		return false;
	}
	
	double acelerar(){
		velocidade = velocidade + 5;
		if(velocidade >= 0 && velocidade <= 20){
			velocidadeMaxima = 20;
			marcha = 1;
			marcha(1);
		}else if(velocidade > 20 && velocidade <= 30){
			velocidadeMaxima = 30;
			marcha = 2;
			marcha(2);
		}else if(velocidade > 30 && velocidade <= 40){
			velocidadeMaxima = 40;
			marcha = 3;
			marcha(3);
		}else if(velocidade > 40 && velocidade <= 65){
			velocidadeMaxima = 65;
			marcha = 4;
			marcha(4);
		}else if(velocidade > 65 && velocidade <= 180){
			velocidadeMaxima = 180;
			marcha = 5;
			marcha(5);
		}else{
			System.out.println("Marcha Incorreta!!! Velocidade permitida 0 a 180 km/h");
		}
		return velocidade;
	}
	
	double frear(){
		velocidade = velocidade - 5;
		if(velocidade >= 0 && velocidade <= 20){
			velocidadeMaxima = 20;
			marcha = 1;
			marcha(1);
		}else if(velocidade > 20 && velocidade <= 30){
			velocidadeMaxima = 30;
			marcha = 2;
			marcha(2);
		}else if(velocidade > 30 && velocidade <= 40){
			velocidadeMaxima = 40;
			marcha = 3;
			marcha(3);
		}else if(velocidade > 40 && velocidade <= 65){
			velocidadeMaxima = 65;
			marcha = 4;
			marcha(4);
		}else if(velocidade > 65 && velocidade <= 180){
			velocidadeMaxima = 180;
			marcha = 5;
			marcha(5);
		}else{
			System.out.println("Marcha Incorreta!!! Velocidade permitida 0 a 180 km/h");
		}
		return velocidade;
	}
	
	void girarVolante(){
		
	}
	
	int reduzirMarcha(){
		marcha = marcha - 1;
		if(marcha == 1){
			velocidadeMaxima = 20;
		}else if(marcha == 2){
			velocidadeMaxima = 30;
		}else if(marcha == 3){
			velocidadeMaxima = 40;
		}else if(marcha == 4){
			velocidadeMaxima = 65;
		}else if(marcha == 5){
			velocidadeMaxima = 180;
		}else{
			System.out.println("Marcha incorreta!!!!");
		}
		return marcha;
	}
	
	int subirMarcha(){
		marcha = marcha + 1;
		if(marcha == 1){
			velocidadeMaxima = 20;
		}else if(marcha == 2){
			velocidadeMaxima = 30;
		}else if(marcha == 3){
			velocidadeMaxima = 40;
		}else if(marcha == 4){
			velocidadeMaxima = 65;
		}else if(marcha == 5){
			velocidadeMaxima = 180;
		}else{
			System.out.println("Marcha incorreta!!!!");
		}
		return 0;
	}
	
	void marcha(int marcha){
		if(marcha == 0){
			this.velocidadeMaxima = velocidadeMaxima;
		}else if(marcha == 1){
			velocidadeMaxima = 20;
		}else if(marcha == 2){
			velocidadeMaxima = 30;
		}else if(marcha == 3){
			velocidadeMaxima = 40;
		}else if(marcha == 4){
			velocidadeMaxima = 65;
		}else if(marcha == 5){
			this.velocidadeMaxima = velocidadeMaxima;
		}else{
			velocidadeMaxima = 0;
			System.out.println("Marcha incorreta!!!");
		}
	}
	
	void imprimir(){
		System.out.println("Chassi: " + numChassi);
		System.out.println("Velocidade maxima: " + velocidadeMaxima + " km/h");
		System.out.println("Quilometragem: " + quilometragem + " km");
		System.out.println("Potencia: " + potencia + " cv");
		System.out.println("Cor: " + cor);
		System.out.println("N. de portas: " + qtdePortas);
		System.out.println("Velocidade: " + velocidade + " km/h");
		System.out.println("Marcha atual: " + marcha);
		if(ligado == true){
			System.out.println("Carro ligado!");
		}else if (ligado == false){
			System.out.println("Carro desligado!");
		}		
		System.out.println("--------------------------------------");
	}

}
