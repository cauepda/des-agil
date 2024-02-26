package br.edu.insper.desagil.aula3;

import java.util.HashMap;
import java.util.Map;

public class Frequencia {

	public Map<Character, Integer> conta(String s) {
		Map<Character, Integer> dicio = new HashMap<>();

		for(int i = 0; i < s.length(); i++) {
			char caracter = s.charAt(i);

			if(dicio.containsKey(caracter)) {
				int number_aux = dicio.get(caracter);
				number_aux += 1;
				dicio.put(caracter, number_aux);
			}
			else {
				dicio.put(caracter, 1);
			}
		}
		return dicio;
	}

}
