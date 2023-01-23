package com.example.demo.service.Implement;

import com.example.demo.dto.ProductDTO;
import com.example.demo.repository.IProductRepository;
import com.example.demo.repository.entity.Product;
import com.example.demo.service.IProductService;
import org.springframework.stereotype.Service;

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
}
