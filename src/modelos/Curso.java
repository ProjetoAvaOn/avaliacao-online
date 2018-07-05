package modelos;

import java.util.ArrayList;

public class Curso {

    private int id;
    private String nome;
    ArrayList<Materia> ListaMat;
    ArrayList<Professor> ListProf;

    public Curso(int id, String nome, ArrayList<Materia> ListaMat) {
        this.id = id;
        this.nome = nome;
        this.ListaMat = ListaMat;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Materia> getListaMat() {
        return ListaMat;
    }

    public void setListaMat(ArrayList<Materia> ListaMat) {
        this.ListaMat = ListaMat;
    }
    
}
