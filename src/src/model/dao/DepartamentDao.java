package model.dao;

import model.entities.Department;

import java.util.List;

public interface DepartamentDao {

    // responsável por inserir no DB o objeto que é dado como entrada
    void insert(Department obj);
    // responsável por atualizar no DB o objeto que é dado como entrada
    void update(Department obj);
    // responsável por apagar no DB pelo Id que é dado como entrada
    void deleteById(Integer id);
    // responsável por buscar no DB um departamento pelo Id que é dado como entrada (se não encontrar retorna null)
    Department findById(Integer id);
    // responsável por buscar no DB todos os departamentos (se não encontrar retorna null)
    List<Department> findAll();
}
