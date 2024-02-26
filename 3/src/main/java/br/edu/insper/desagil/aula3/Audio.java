package br.edu.insper.desagil.aula3;

import java.util.List;

public class Audio {

	public void clip(List<Integer> onda, int limite) {

		int i = 0;
		for(int n : onda) {
			if(n < 0) {
				n *= -1;

				if(n > limite) {
					onda.set(i, -limite);
				}
			}
			else {
				if(n > limite) {
					onda.set(i, limite);
				}
			}
			i += 1;
		}
	}

}
