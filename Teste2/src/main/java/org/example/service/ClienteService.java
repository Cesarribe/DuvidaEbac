package org.example.service;

import org.example.Dao.ClienteDao;
import org.example.Dao.IClienteDao;

public class ClienteService {

    private IClienteDao clienteDao;

    public ClienteService(IClienteDao clienteDao) {
         this.clienteDao = clienteDao;
    }

    public String salvar() {
        clienteDao.salvar();
        return "Sucesso";
    }
}