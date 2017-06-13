/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.web;

import br.data.entity.Cliente;
import javax.inject.Named;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author alexandrelerario
 */
@ManagedBean
@RequestScoped
public class JsfCliente {

    /**
     * Creates a new instance of JsfCliente
     */
    private int codigo;
    private String nome;
    private int cidade;

    private boolean novo = false;
    private boolean listar = false;
    private boolean edit = false;

    public JsfCliente() {
    }

    public java.util.Collection<br.data.entity.Cliente> getAll() {
        return new br.data.crud.CrudCliente().getAll();
    }

    public void persist() {
            br.data.entity.Cliente cli;
            cli = new br.data.entity.Cliente();
            cli.setCodigo(codigo);
            cli.setNome(nome);
            cli.setCidade(new br.data.crud.CrudCidade().find(cidade));
            new br.data.crud.CrudCliente().persist(cli);
    }

    public void remove(Cliente cli) {
        new br.data.crud.CrudCliente().remove(cli);
    }

    public void editar(Cliente cli) {
        this.setCodigo(cli.getCodigo());
        this.setNome(cli.getNome());
        this.setCidade(cli.getCidade().getCodigo());
        this.novo = false;
        this.edit = true;
    }

    public void merge() {
        br.data.entity.Cliente cli = new br.data.crud.CrudCliente().find(this.codigo);
        cli.setNome(nome);
        cli.setCidade(new br.data.crud.CrudCidade().find(cidade));
        new br.data.crud.CrudCliente().merge(cli);
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCidade() {
        return cidade;
    }

    public void setCidade(int cidade) {
        this.cidade = cidade;
    }

    public boolean isNovo() {
        return novo;
    }

    public void setNovo(boolean novo) {
        this.novo = novo;
    }

    public boolean isListar() {
        return listar;
    }

    public void setListar(boolean listar) {
        this.listar = listar;
    }

    public boolean isEdit() {
        return edit;
    }

    public void setEdit(boolean edit) {
        this.edit = edit;
    }

}
