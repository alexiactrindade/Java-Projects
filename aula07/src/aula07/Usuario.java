package aula07;

public class Usuario {
	private Long id; 
	private String username; 
	private String email;
	private String password; 
	private boolean expired; 
	private String photo;
	
	public Usuario(Long id, String username, String email, String password, boolean expired, String photo) {
		this.id = id;
		this.username = username;
		this.email = email;
		this.password = password;
		this.expired = expired;
		this.photo = photo;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isExpired() {
		return expired;
	}

	public void setExpired(boolean expired) {
		this.expired = expired;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	} 
	
	public void getData() { 
		System.out.println("------User------");
		System.out.println("ID: " + id);
		System.out.println("Username: " + username);
		System.out.println("E-Mail " + email);
		System.out.println("Password " + password);
		System.out.println("Expired: " + (expired ? "yes" : "no"));
		System.out.println("Photo: " + photo);
	
	}
}
