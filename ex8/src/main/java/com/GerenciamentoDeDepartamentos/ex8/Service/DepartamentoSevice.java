package com.GerenciamentoDeDepartamentos.ex8.Service;

import com.GerenciamentoDeDepartamentos.ex8.Model.DepartamentoModel;
import com.GerenciamentoDeDepartamentos.ex8.Repository.DepartamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepartamentoSevice {
    @Autowired
    private DepartamentoRepository repository;

    public DepartamentoModel salvar(DepartamentoModel departamento) {
        return repository.save(departamento);
    }

    public List<DepartamentoModel> listarTodos() {
        return repository.findAll();
    }

    public Optional<DepartamentoModel> buscarPorId(Long id) {
        return repository.findById(id);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }

}
