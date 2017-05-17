/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.data.crud;

import br.data.crud.*;
import br.data.entity.Cidade;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

/**
 *
 * @author evee
 */
public class CrudCidade extends AbstractCrud<br.data.entity.Cidade> {

    private EntityManager em;

    private static final String PU = br.data.crud.EMNames.EMN1;

    public CrudCidade() {
        super(Cidade.class);
    }

    @Override
    protected EntityManager getEntityManager() {
        if (em == null) {
            em = Persistence.createEntityManagerFactory(PU).createEntityManager();
        }
        return em;
    }

}
