package com.example.demo.dto;

import com.example.demo.repository.entity.Product;

public class ProductDTO {
    private Integer id;
    private String nameProduct;
    private String priceProduct;

    //Constructores
    public ProductDTO() {
    }

    public ProductDTO(Integer id, String nameProduct, String priceProduct) {
        this.id = id;
        this.nameProduct = nameProduct;
        this.priceProduct = priceProduct;
    }

    //Unión entre ProductDTO y Product
    public ProductDTO(Product product){
        this.id = product.getId();
        this.nameProduct = product.getNameProduct();
        this.priceProduct = product.getPriceProduct();
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

    public String getName() {
        return nameProduct;
    }

    public void setName(String nameProduct) {
        this.nameProduct = nameProduct;
    }
}
