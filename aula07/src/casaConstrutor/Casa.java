package casaConstrutor;

	public class Casa {
	    private String cor;
	    private int numero;
	    
	    private Comodo sala;
	    private Comodo cozinha;
	    private Comodo banheiro;

	    public Casa(String cor, int numero) {
	        this.cor = cor;
	        this.numero = numero;
	    }

	    public void criarSala() {
	        this.sala = new Comodo("Sala", 25.5, "Madeira Laminada");
	    }

	    public void criarCozinha() {
	        this.cozinha = new Comodo("Cozinha", 15.0, "Porcelanato");
	    }

	    public void criarBanheiro() {
	        this.banheiro = new Comodo("Banheiro", 4.2, "Cerâmica Antiderrapante");
	    }

	    public void mostrarDetalhes() {
	        System.out.println("--- Detalhes da Casa ---");
	        System.out.println("Cor: " + cor);
	        System.out.println("Número: " + numero);

	        System.out.println("--- Cômodos da Casa ---");
	        System.out.println("Sala");
	        sala.mostrarComodo();
	        System.out.println("Cozinha");
	        cozinha.mostrarComodo();
	        System.out.println("Banheioro");
	        banheiro.mostrarComodo();
	    }
	}
