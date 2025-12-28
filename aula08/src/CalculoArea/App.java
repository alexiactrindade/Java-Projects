package CalculoArea;

public class App {

	public static void main(String[] args) {
        Circulo circulo = new Circulo("Nome", "Vermelho", 20.8, 14.3);
        Retangulo retangulo = new Retangulo("Nome 2", "Azul", 34.5, 67.3, 100.7);
        Triangulo triangulo = new Triangulo("Triangulo", "Verde", 59.2, 32.8, 46.0);
       
        circulo.mostrarInfo();
        retangulo.mostrarInfo();
        triangulo.mostrarInfo();
   	}

}
