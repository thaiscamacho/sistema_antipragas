package sistema.controller;
// Generated 05/06/2017 10:05:02 by Hibernate Tools 4.3.1


import sistema.model.DAOCliente;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.Session;

/**
 * Cliente generated by hbm2java
 */
@Entity
@Table(name="Cliente")
public class Cliente  implements java.io.Serializable {

     @Id
     @GeneratedValue(strategy=GenerationType.IDENTITY)
     private int idCliente;
     @Embedded 
     private Cadastro cadastro;
     private Set ordemServicos = new HashSet(0);
     private Set propostas = new HashSet(0);

    public Cliente() {
    }

	
    public Cliente(int idCliente, Cadastro cadastro) {
        this.idCliente = idCliente;
        this.cadastro = cadastro;
    }
    public Cliente(int idCliente, Cadastro cadastro, Set ordemServicos, Set propostas) {
       this.idCliente = idCliente;
       this.cadastro = cadastro;
       this.ordemServicos = ordemServicos;
       this.propostas = propostas;
    }
   
    public int getIdCliente() {
        return this.idCliente;
    }
    
    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }
    public Cadastro getCadastro() {
        return this.cadastro;
    }
    
    public void setCadastro(Cadastro cadastro) {
        this.cadastro = cadastro;
    }
    public Set getOrdemServicos() {
        return this.ordemServicos;
    }
    
    public void setOrdemServicos(Set ordemServicos) {
        this.ordemServicos = ordemServicos;
    }
    public Set getPropostas() {
        return this.propostas;
    }
    
    public void setPropostas(Set propostas) {
        this.propostas = propostas;
    }
    
    public void excluir(){
        DAOCliente dAOCliente = new DAOCliente();
        dAOCliente.excluir(this.getIdCliente());
    }
}


