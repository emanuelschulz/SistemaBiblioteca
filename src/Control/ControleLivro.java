package Control;

import Model.Livro;
import java.sql.PreparedStatement;

public class ControleLivro {

    public void cadastrarLivro(Livro l) {
        String sql = "insert into livro (titulo, subtitulo, isbn, edicao, braile, classificacao, paginas, online, editora, ano, status) values(?,?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement comando = DB.connection().prepareStatement(sql);
            comando.setString(1, l.getTitulo());
            comando.setString(2, l.getSubTitulo());
            comando.setString(3, l.getIsbn());
            comando.setInt(4, l.getEdicao());
            comando.setBoolean(5, l.getBraile());
            comando.setString(6, l.getClassificaçao());
            comando.setInt(7, l.getNumero_de_paginas());
            comando.setBoolean(8, l.getOnline());
            comando.setInt(9, l.getId_editora());
            comando.setInt(10, l.getAno());
            comando.setBoolean(11, true);
            comando.executeUpdate();
        } catch (Exception e) {
            System.out.println("deu erro");
        }
    }

    public void pesquisarLivroPorNome(String nome) {
        String sql = "Select * from livro where nome like ?%";
        try {
            PreparedStatement comando = DB.connection().prepareStatement(sql);
            comando.setString(1, nome);
            comando.executeUpdate();
        } catch (Exception e) {
            System.out.println("deu erro");
        }
    }
}
