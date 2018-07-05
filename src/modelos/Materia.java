package modelos;

import java.util.ArrayList;

public class Materia {

    private int id;
    private String nome;
    private Professor profMat;
    ArrayList<Questao> ListaQuest;

    public Materia(int id, String nome, Professor profMat) {
        this.id = id;
        this.nome = nome;
        this.profMat = profMat;
        ListaQuest = new ArrayList();
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

    public Professor getProfMat() {
        return profMat;
    }

    public void setProfMat(Professor profMat) {
        this.profMat = profMat;
    }

    public ArrayList<Questao> getListaQuest() {
        return ListaQuest;
    }

    public void setListaQuest(ArrayList<Questao> ListaQuest) {
        this.ListaQuest = ListaQuest;
    }

    public void addQuestao(Questao q) {
        ListaQuest.add(q);
        //adiciona uma questao na lista

    }
}
