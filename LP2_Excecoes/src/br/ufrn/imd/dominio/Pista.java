package br.ufrn.imd.dominio;

import br.ufrn.imd.controle.AcimaVelocidadeException;
import br.ufrn.imd.controle.PistaException;

public class Pista {
	
	public void iniciar() throws PistaException {
		
		Automovel auto = new Automovel();
		
		try {
			auto.acelerar(130);
		} catch (AcimaVelocidadeException ave) {
			throw new PistaException("Problema na Pista", ave);
		}
		
	}
	
}
