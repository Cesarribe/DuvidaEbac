package org.example.Dao;

import org.example.service.IContratoService;

public class ContratoDao implements IContratoService {
    @Override
    public String salvar() {
       throw new UnsupportedOperationException("Nao funciona com o banco");
    }

}
