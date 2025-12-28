package aula07;

public class App {

	public static void main(String[] args) {
		Usuario usuario = new Usuario(1l, "alexiatrindade", "alexiadacostatrindade@gmail.com", "minhasenha123", false, "photos/usuario1");
		System.out.println("Salvando no banco de dados...");
		UsuarioDto usuarioDto = UsuarioDto.fromUsuario(usuario); 
		System.out.println("Enviando para o front-end...");
		usuarioDto.getData(); 
	}
}