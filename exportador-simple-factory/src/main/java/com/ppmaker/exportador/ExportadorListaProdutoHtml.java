package com.ppmaker.exportador;
/**
 *
 * @author 05728612148
 */
public class ExportadorListaProdutoHtml extends AbstractExportadorListaProduto{

    @Override
    public String abrirTabela() {
        return "<table>\n";
    }

    @Override
    public String fecharTabela() {
        return "</table>\n";
    }

    @Override
    public String abrirLinha() {
        return "<tr>";
    }

    @Override
    public String fecharLinha() {
        return "</tr>\n";
    }

    @Override
    public String fecharLinhsTitulos() {
        return "";
    }

    @Override
    public String abrirColuna(String valor) {
        return "<td>" + valor;
    }

    @Override
    public String fecharColuna() {
        return "</td>";
    }
    
}