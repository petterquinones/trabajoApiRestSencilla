package com.example.demo.controller;

import com.example.demo.dto.ProductDTO;
import com.example.demo.service.IProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
public class ProductController {
    private final IProductService iProductService;

    public ProductController(IProductService iProductService) {
        this.iProductService = iProductService;
    }
    @PostMapping
    public  ResponseEntity<?>
    saveProduct(@RequestBody ProductDTO productDTO){
        iProductService.save(productDTO);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @GetMapping
    public ResponseEntity<?>
    getAll(){
        return ResponseEntity.ok().body(this.iProductService.getAll());
    }

}
