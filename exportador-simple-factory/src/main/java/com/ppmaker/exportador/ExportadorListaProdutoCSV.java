/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ppmaker.exportador;

/**
 *
 * @author 05728612148
 */
public class ExportadorListaProdutoCSV extends AbstractExportadorListaProduto {

    private static final String SEPARADOR_COL = ",";

    @Override
    public String abrirTabela() {
        return "";
    }

    @Override
    public String fecharTabela() {
        return "";
    }

    @Override
    public String abrirLinha() {
        return "";
    }

    @Override
    public String fecharLinha() {
        return "\n";
    }

    @Override
    public String fecharLinhsTitulos() {
        return "";
    }

    @Override
    public String abrirColuna(String valor) {
        return valor;
    }

    @Override
    public String fecharColuna() {
        return "" + SEPARADOR_COL;
    }
    
}
