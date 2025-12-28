package casaConstrutor;

public class Comodo {
    private String nome;
    private double metragem;
    private String tipoPiso;


    public Comodo(String nome, double metragem, String tipoPiso) {
        this.nome = nome;
        this.metragem = metragem;
        this.tipoPiso = tipoPiso;
    }

    public String getNome() {
        return nome;
    }

    public double getMetragem() {
        return metragem;
    }

    public String getTipoPiso() {
        return tipoPiso;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMetragem(double metragem) {
        this.metragem = metragem;
    }

    public void setTipoPiso(String tipoPiso) {
        this.tipoPiso = tipoPiso;
    }

    public void mostrarComodo() {
        System.out.println("Nome: " + nome);
        System.out.println("Metragem: " + metragem + " m²");
        System.out.println("Tipo de Piso: " + tipoPiso);
    }
}