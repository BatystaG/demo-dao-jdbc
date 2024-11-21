package model.dao;

import model.entities.Department;
import model.entities.Seller;

import java.util.List;

public interface SellerDao {

    // responsável por inserir no DB o objeto que é dado como entrada
    void insert(Seller obj);
    // responsável por atualizar no DB o objeto que é dado como entrada
    void update(Seller obj);
    // responsável por apagar no DB pelo Id que é dado como entrada
    void deleteById(Integer id);
    // responsável por buscar no DB um vendedor pelo Id que é dado como entrada (se não encontrar retorna null)
    Seller findById(Integer id);
    // responsável por buscar no DB todos os vendedores (se não encontrar retorna null)
    List<Seller> findAll();
}
