package sistema.controller;
// Generated 05/06/2017 10:05:02 by Hibernate Tools 4.3.1

import sistema.model.DAOProdutoServico;




/**
 * ProdutoServico generated by hbm2java
 */
public class ProdutoServico  implements java.io.Serializable {


     private int idProdutoServico;
     private OrdemServico ordemServico;
     private Produto produto;
     private Integer quantidade;

    public ProdutoServico() {
    }

	
    public ProdutoServico(int idProdutoServico, OrdemServico ordemServico, Produto produto) {
        this.idProdutoServico = idProdutoServico;
        this.ordemServico = ordemServico;
        this.produto = produto;
    }
    public ProdutoServico(int idProdutoServico, OrdemServico ordemServico, Produto produto, Integer quantidade) {
       this.idProdutoServico = idProdutoServico;
       this.ordemServico = ordemServico;
       this.produto = produto;
       this.quantidade = quantidade;
    }
   
    public int getIdProdutoServico() {
        return this.idProdutoServico;
    }
    
    public void setIdProdutoServico(int idProdutoServico) {
        this.idProdutoServico = idProdutoServico;
    }
    public OrdemServico getOrdemServico() {
        return this.ordemServico;
    }
    
    public void setOrdemServico(OrdemServico ordemServico) {
        this.ordemServico = ordemServico;
    }
    public Produto getProduto() {
        return this.produto;
    }
    
    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    public Integer getQuantidade() {
        return this.quantidade;
    }
    
    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public void armazenar(){
        DAOProdutoServico dao = new DAOProdutoServico();
        dao.armazenar(this);
    }


}


