/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unifei.dao.jogo;

import br.edu.unifei.bd.jogo.ComandoExat;
import javax.persistence.EntityManager;

/**
 *
 * @author Tercio
 */
public class ComandoExatDao extends AbstractDao<ComandoExat, Integer>{
    
    public ComandoExatDao(EntityManager em) {
        super(em);
    }
    
}
