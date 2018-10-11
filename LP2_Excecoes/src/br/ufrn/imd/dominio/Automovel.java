package br.ufrn.imd.dominio;

import br.ufrn.imd.controle.AcimaVelocidadeException;

public class Automovel {

	private static final int VELOCIDADE_MAXIMA = 120;
	private int velocidadeAtual;
	
	public Automovel() {
		velocidadeAtual = 0;
	}
	
	public void acelerar(int velocidade) throws AcimaVelocidadeException{
		if(velocidadeAtual + velocidade > VELOCIDADE_MAXIMA) {
			throw new AcimaVelocidadeException("Excedeu a velocidade máxima permitida!!!");
		}
		else {
			velocidadeAtual += velocidade;
		}
	}
	
}
