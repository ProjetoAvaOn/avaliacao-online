package modelos;

public class Professor {

    private String nome;
    private String email;
    private boolean cadAtivo;

    public Professor(String nome, String email) {
        this.nome = nome;
        this.email = email;
        this.cadAtivo = false;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isCadAtivo() {
        return cadAtivo;
    }

    public void setCadAtivo(boolean cadAtivo) {
        this.cadAtivo = cadAtivo;
    }

}
