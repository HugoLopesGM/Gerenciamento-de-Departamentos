package com.GerenciamentoDeDepartamentos.ex8.Repository;


import com.GerenciamentoDeDepartamentos.ex8.Model.DepartamentoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartamentoRepository extends JpaRepository<DepartamentoModel, Long> {
}
