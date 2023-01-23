package com.example.demo.repository.entity;

import com.example.demo.dto.ProductDTO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {
    @Id
    private Integer id;

    private String nameProduct;
    private String priceProduct;


    //Constructores
    public Product() {
    }

    public Product(Integer id, String nameProduct, String priceProduct) {
        this.id = id;
        this.nameProduct = nameProduct;
        this.priceProduct = priceProduct;
    }

    public Product(ProductDTO productDTO) {
        this.id = productDTO.getId();
        this.nameProduct = productDTO.getName();
        this.priceProduct = productDTO.getPriceProduct();
    }

    //getter y setter
    public String getPriceProduct() {
        return priceProduct;
    }

    public void setPriceProduct(String priceProduct) {
        this.priceProduct = priceProduct;
    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }
}
