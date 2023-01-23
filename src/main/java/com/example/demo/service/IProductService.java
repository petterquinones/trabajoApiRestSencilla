package com.example.demo.service;

import com.example.demo.dto.ProductDTO;

import java.util.List;

public interface IProductService {
    //Guardar un nuevo producto
    void save(ProductDTO productDTO);
    //Obtener una lista con todos los elementos guardados
    List<ProductDTO> getAll();
}
