package com.ppmaker.exportador;

import java.util.Arrays;
import java.util.List;
/**
 *
 * @author 05728612148
 */
public abstract class AbstractExportadorListaProduto 
        implements ExportadorListaProduto{
    
    protected static final List<String> TITULO_COLUNAS = Arrays.asList("ID", "Descrição", "Marca", "Modelo", "Estoque"); 

    @Override
    public String exportar(List<Produto> listaProdutos) {
        final StringBuilder sb = new StringBuilder();
        sb.append(abrirTabela());
        
        sb.append(gerarColunasLinha(TITULO_COLUNAS));
        sb.append(fecharLinhsTitulos());
        gerarLinhasProdutos(sb, listaProdutos);
        
        sb.append(fecharTabela());
        return sb.toString();
    }

    protected String gerarColunasLinha(List<String> lista) {
        StringBuilder sb = new StringBuilder();
        sb.append(abrirLinha());
        for (String string : lista) {
             sb.append(abrirColuna(string))
              .append(fecharColuna());
        }
        sb.append(fecharLinha());
        return sb.toString();
    }

    private void gerarLinhasProdutos(StringBuilder sb, List<Produto> listaProdutos) {
        for (Produto listaProduto : listaProdutos) {
            List<String> valoresCamposProduto = 
                    Arrays.asList(String.valueOf(listaProduto.getId()), 
                            listaProduto.getDescricao(), 
                            listaProduto.getMarca(),
                            listaProduto.getModelo(),
                            String.valueOf(listaProduto.getEstoque())
                    );
            sb.append(gerarColunasLinha(valoresCamposProduto));
        }
    }
    
    
}