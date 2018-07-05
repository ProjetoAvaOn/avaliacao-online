/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import connection.ConexaoBanco;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import modelos.Aluno;

/**
 *
 * @author Victor
 */
public class AlunoDao {
  
    private ConexaoBanco conexao;
    
    public AlunoDao()
    {
        this.conexao = new ConexaoBanco();
    }
    
    
    public void inserir(Aluno aluno) {
        //string com a consulta que será executada no banco
        String sql = "INSERT INTO alunos (id,nome) VALUES (?,?)";
        
        try
        {
            //tenta realizar a conexão, se retornar verdadeiro entra no IF
            if(this.conexao.conectar())
            {
                //prepara a sentença com a consulta da string
                PreparedStatement sentenca = this.conexao.getConnection().prepareStatement(sql);
                
                //subtitui as interrograções da consulta, pelo valor específico
                sentenca.setString(1,aluno.getNome()); //subsitui a primeira ocorrência da interrogação pelo atributo nome
                
                
                sentenca.execute(); //executa o comando no banco
                sentenca.close(); //fecha a sentença
                this.conexao.getConnection().close(); //fecha a conexão com o banco
            }
        }
        catch(SQLException ex)
        {
           throw new RuntimeException(ex);
        }
    }
    
}
