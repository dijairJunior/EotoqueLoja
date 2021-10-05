/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Statement;
import model.ModelUsuario;
import util.ConexaoSQLite;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Junior-PC
 */
public class DADUsuario extends ConexaoSQLite {
    
    public boolean salvarUsuarioDAO(ModelUsuario pModelUsuario){
        conectar();
        //executar sql
        String sql = "INSERT INTO tbl_usuario (*"
                + "usu_nome, "
                + "usu_login, "
                + "usu_senha) VALUES (?,?,?)";
        
        PreparedStatement preparedStatement = criarPreparedStatement(sql, Statement.RETURN_GENERATED_KEYS);
        try {
            preparedStatement.setString(1, pModelUsuario.getUsuNome());
            preparedStatement.setString(2, pModelUsuario.getUsuLogin());
            preparedStatement.setString(3, pModelUsuario.getUsuSenha());
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DADUsuario.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
        
        desconectar();
        return true;
        
    }  
    
    
}
