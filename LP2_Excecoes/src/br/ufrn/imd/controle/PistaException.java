package br.ufrn.imd.controle;

public class PistaException extends Exception {

	public PistaException(String message, AcimaVelocidadeException ave) {
		super(message, ave);
	}

}
