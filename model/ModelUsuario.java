/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Junior-PC
 */
public class ModelUsuario {
    
    private int usuId;
    private String usuName;
    private String usuLogin;
    private String usuSenha;

    /**
     * @return the usuId
     */
    public int getUsuId() {
        return usuId;
    }

    /**
     * @param usuId the usuId to set
     */
    public void setUsuId(int usuId) {
        this.usuId = usuId;
    }

    /**
     * @return the usuName
     */
    public String getUsuName() {
        return usuName;
    }

    /**
     * @param usuName the usuName to set
     */
    public void setUsuName(String usuName) {
        this.usuName = usuName;
    }

    /**
     * @return the usuLogin
     */
    public String getUsuLogin() {
        return usuLogin;
    }

    /**
     * @param usuLogin the usuLogin to set
     */
    public void setUsuLogin(String usuLogin) {
        this.usuLogin = usuLogin;
    }

    /**
     * @return the usuSenha
     */
    public String getUsuSenha() {
        return usuSenha;
    }

    /**
     * @param usuSenha the usuSenha to set
     */
    public void setUsuSenha(String usuSenha) {
        this.usuSenha = usuSenha;
    }

    public String getUsuNome() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
