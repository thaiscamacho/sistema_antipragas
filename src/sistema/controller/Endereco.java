package sistema.controller;
// Generated 05/06/2017 10:05:02 by Hibernate Tools 4.3.1


import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import sistema.model.DAOEndereco;

/**
 * Endereco generated by hbm2java
 */
@Entity
@Table(name="Endereco")
public class Endereco  implements Serializable {
     @Id
     @GeneratedValue(strategy=GenerationType.IDENTITY)
     private int idEndereco;
     private String ruaAven;
     private Integer numero;
     private String cep;
     private String complemento;
     private Set ordemServicos = new HashSet(0);
     private Set cadastros = new HashSet(0);
     private Set fornecedors = new HashSet(0);

    public Endereco() {
    }

	
    public Endereco(int idEndereco) {
        this.idEndereco = idEndereco;
    }
    public Endereco(int idEndereco, String ruaAven, Integer numero, String cep, String complemento, Set ordemServicos, Set cadastros, Set fornecedors) {
       this.idEndereco = idEndereco;
       this.ruaAven = ruaAven;
       this.numero = numero;
       this.cep = cep;
       this.complemento = complemento;
       this.ordemServicos = ordemServicos;
       this.cadastros = cadastros;
       this.fornecedors = fornecedors;
    }
   
    public int getIdEndereco() {
        return this.idEndereco;
    }
    
    public void setIdEndereco(int idEndereco) {
        this.idEndereco = idEndereco;
    }
    public String getRuaAven() {
        return this.ruaAven;
    }
    
    public void setRuaAven(String ruaAven) {
        this.ruaAven = ruaAven;
    }
    public Integer getNumero() {
        return this.numero;
    }
    
    public void setNumero(Integer numero) {
        this.numero = numero;
    }
    public String getCep() {
        return this.cep;
    }
    
    public void setCep(String cep) {
        this.cep = cep;
    }
    public String getComplemento() {
        return this.complemento;
    }
    
    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }
    public Set getOrdemServicos() {
        return this.ordemServicos;
    }
    
    public void setOrdemServicos(Set ordemServicos) {
        this.ordemServicos = ordemServicos;
    }
    public Set getCadastros() {
        return this.cadastros;
    }
    
    public void setCadastros(Set cadastros) {
        this.cadastros = cadastros;
    }
    public Set getFornecedors() {
        return this.fornecedors;
    }
    
    public void setFornecedors(Set fornecedors) {
        this.fornecedors = fornecedors;
    }

    public void armazenar(){
        DAOEndereco dao = new DAOEndereco();
        dao.armazenar(this);
    }
    
    public void alterar(){
        DAOEndereco dao = new DAOEndereco();
        dao.alterar(this);
    }
    
    public void excluir(){
        DAOEndereco dao = new DAOEndereco();
        dao.excluir(this.getIdEndereco());
    }
    
    public void buscarComId(int idEnd){
        DAOEndereco dao = new DAOEndereco();
        Endereco e = dao.buscarComID(idEnd);
        this.setCep(e.getCep());
        this.setComplemento(e.getComplemento());
        this.setIdEndereco(e.getIdEndereco());
        this.setRuaAven(e.getRuaAven());
    }

}


