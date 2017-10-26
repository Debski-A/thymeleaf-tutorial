package com.debski.services;

import java.util.List;

import com.debski.domain.Product;

/**
 * Created by jt on 1/26/16.
 */
public interface ProductService {

    Product getProduct(Integer id);

    List<Product> listProducts();
}