package br.edu.insper.desagil.aula2;

public class Tabuada {

	public String constroi(int n) {
		String str = "";
		for (int i = 1; i <= n; i ++) {
			for (int j = 1; j <= n; j ++) {
				str += i * j + " ";
			}
			str += "\n";
		}
		return str;
	}

}
