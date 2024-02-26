package br.edu.insper.desagil.aula2;

public class Inversa {

	public String constroi(String s) {
		String r = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			r += s.charAt(i);
		}
		return r;
	}

}
