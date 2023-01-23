package com.example.demo.service.Implement;

import com.example.demo.dto.ProductDTO;
import com.example.demo.repository.IProductRepository;
import com.example.demo.repository.entity.Product;
import com.example.demo.service.IProductService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductServiceImplement implements IProductService {

    private final IProductRepository repository;

    public ProductServiceImplement(IProductRepository repository) {
        this.repository = repository;
    }

    @Override
    public void save(ProductDTO productDTO) {
        if(repository.existsById(productDTO.getId())){
            repository.save(new Product(productDTO));
        }
    }

    @Override
    public List<ProductDTO> getAll() {
        //Obtener todos los elementos que se encuentran registrados en una lista
        List<Product> productList = (List<Product>) this.repository.findAll();
        return productList.stream()
                .map(ProductDTO::new)
                .collect(Collectors.toList());

    }
}
