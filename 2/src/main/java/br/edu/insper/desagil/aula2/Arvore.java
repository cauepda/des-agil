package br.edu.insper.desagil.aula2;

public class Arvore {

	public String constroi(int n) {
		String str = "";

		for (int i = 0; i < n; i++) {
			str += " ".repeat(n - i - 1) + ("/".repeat(i)) + ("|") + ("\\".repeat(i)) + "\n";
		}
		return str;
	}

}
