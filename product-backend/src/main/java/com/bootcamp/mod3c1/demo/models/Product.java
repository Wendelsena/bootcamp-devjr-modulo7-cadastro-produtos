package com.bootcamp.mod3c1.demo.models;

public class Product {
    
    private Integer id;
    private String name;
    private String description;
    private Integer idCategory;
    private Boolean promotion;
    private Boolean newProduct;
    private Double price;

    public Product() {}

    public Product(Integer id, String name, String description, Integer idCategory, Boolean promotion,
            Boolean newProduct, Double price) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.idCategory = idCategory;
        this.promotion = promotion;
        this.newProduct = newProduct;
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(Integer idCategory) {
        this.idCategory = idCategory;
    }

    public Boolean getPromotion() {
        return promotion;
    }

    public void setPromotion(Boolean promotion) {
        this.promotion = promotion;
    }

    public Boolean getNewProduct() {
        return newProduct;
    }

    public void setNewProduct(Boolean newProduct) {
        this.newProduct = newProduct;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

   
}
