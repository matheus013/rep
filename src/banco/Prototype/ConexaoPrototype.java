/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco.Prototype;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author pedro_000
 */
public class ConexaoPrototype implements PrototypeInterface{
    
    Connection conexao;
    String nomeBanco ;
    @Override
    public ConexaoPrototype clone()
    {
        return new ConexaoPrototype();
    }
    
    public void setNomeBanco(String nome)
    {
        nomeBanco = nome;
    }
    
    public Connection getConnection() {
        
        try {
            String stringConexao = "jdbc:postgresql://localhost:5432/";
            String usuarioBanco = "postgres";
            String senhaBanco = "matheus23";

            Class.forName("org.postgresql.Driver");

            conexao = DriverManager.getConnection(stringConexao + nomeBanco,
                    usuarioBanco, senhaBanco);

        } catch (SQLException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            conexao = null;
        }
        return conexao;
    }
    public void close() throws SQLException
    {
        conexao.close();
    }
}
 
