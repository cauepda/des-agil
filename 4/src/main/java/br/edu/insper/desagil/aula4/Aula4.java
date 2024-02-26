package br.edu.insper.desagil.aula4;

public class Aula4 {
	public static void main(String[] args) {
		Ship ship = new Ship();
		ship.setX(2);
		ship.setY(1);

		ship.move(-1, 1);

		System.out.println(ship.getX() + ", " + ship.getY());
	}
}
