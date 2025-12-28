package aula07;

public class UsuarioDto {
	
	public Long id; 
	public String username; 
	public String email;
	public boolean expired; 
	public String photo;
	
	public UsuarioDto(Usuario usuario) {
		this.id = usuario.getId(); 
		this.username = usuario.getUsername(); 
		this.email = usuario.getEmail(); 
		this.expired = usuario.isExpired(); 
		this.photo = usuario.getPhoto(); 
	}
	
	static public UsuarioDto fromUsuario(Usuario usuario) { 
		return new UsuarioDto(usuario);
	}
	
	public void getData() { 
		System.out.println("------User------");
		System.out.println("ID: " + id);
		System.out.println("Username: " + username);
		System.out.println("E-Mail " + email);
		System.out.println("Expired: " + (expired ? "yes" : "no"));
		System.out.println("Photo: " + photo);
	
	}
	
}
