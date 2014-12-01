package br.com.pesquisafacil.formulario.relatorios.controller;

import br.com.pesquisafacil.persistencia.ConectarBD;
import java.util.Map;


public class RelatorioBean extends RelatorioDatabaseController{

    @Override
    public void imprimir(Map<String, ?> params) {
        ConectarBD banco = new ConectarBD();
        banco.openConection();
        super.imprimir("report1.jasper", "Relatório Pesquisa Fácil", banco.conn, params);
        banco.closeConection();
    } 
    
}
