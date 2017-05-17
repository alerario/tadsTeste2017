/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.web;


import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author utfpr
 */
@ManagedBean
@RequestScoped
public class JsfCidade {

    /**
     * Creates a new instance of JsfCidade
     */
    public JsfCidade() {
    }
    
    public java.util.Collection<br.data.entity.Cidade> getAll(){
        return new br.data.crud.CrudCidade().getAll();
    }
    
}
