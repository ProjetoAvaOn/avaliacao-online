package modelos;

import java.util.ArrayList;

public class Questao {

    private int id;
    private String enunciado;
    ArrayList<OpQuestao> OpcQuest;

    public Questao(ArrayList<OpQuestao> OpcQuest) {
        OpcQuest = new ArrayList();
    }

    public Questao() {
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEnunciado() {
        return enunciado;
    }

    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }

    public ArrayList<OpQuestao> getOpcQuest() {
        return OpcQuest;
    }

    public void setOpcQuest(ArrayList<OpQuestao> OpcQuest) {
        this.OpcQuest = OpcQuest;
    }

    

}
