package org.example.service;

import org.example.Dao.IContratoDao;

public class ContratoService implements IContratoService {

   IContratoDao contratoDao;
    public ContratoService(IContratoDao dao) {
        this.contratoDao = dao;

    }

    @Override
    public String salvar() {
        contratoDao.salvar();
        return "Sucesso";
    }
}
