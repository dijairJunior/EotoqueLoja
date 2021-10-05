/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cotroller;

import DAO.DADUsuario;
import model.ModelUsuario;


/**
 *
 * @author Junior-PC
 */
public class ControllerUsuario {
    DADUsuario daoUsuario = new DADUsuario();

    /**
     *
     * @param modelUsuario
     */
    public boolean salvarUsuarioController(ModelUsuario modelUsuario) {
        return this.daoUsuario.salvarUsuarioDAO(modelUsuario);
    }
           
}
