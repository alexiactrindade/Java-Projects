package FuncionariosHotel;

public class App {

	public static void main(String[] args) {
		Recepcionista recepcionista = new Recepcionista("Carla", 5000, "Noturno", "A123" , "Espanhol e Inglês", true); 
		Camareira camareira = new Camareira("Joana", 5000, "Diurno", "A321", 4, "Branco"); 

		System.out.println("===Recepcionista===");
		recepcionista.mostrarDadosRecepcionista();
		System.out.println("===Camareira===");
		camareira.mostrarDadosCamareira();

	}

}
