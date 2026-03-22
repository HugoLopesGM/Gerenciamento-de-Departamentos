package com.GerenciamentoDeDepartamentos.ex8.Controller;

import com.GerenciamentoDeDepartamentos.ex8.Model.DepartamentoModel;
import com.GerenciamentoDeDepartamentos.ex8.Service.DepartamentoSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Departamento")
public class DepartamentoController {

    @Autowired
    private DepartamentoSevice service;

    @PostMapping
    public DepartamentoModel criar(@RequestBody DepartamentoModel departamento) {
        return service.salvar(departamento);
    }

    @GetMapping
    public List<DepartamentoModel> listarTodos() {
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public Optional<DepartamentoModel> buscarPorId(@PathVariable Long id) {
        return service.buscarPorId(id);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }   
}
