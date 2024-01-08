package com.singular.sing.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import com.singular.sing.model.Product;

@Service
/*
 * As instâncias de bean com escopo de sessão são mantidas para toda a sessão HTTP.
 * Várias solicitações podem compartilhar a instância do bean com escopo de sessão.
 * Os beans com escopo de sessão são uma maneira de compartilhar dados entre solicitações
 * mantendo os dados no lado do servidor.
 */
@SessionScope
public class ProductService {

  private List<Product> products = new ArrayList<Product>();

  public void addProducts(Product p) {
    this.products.add(p);
  }

  public List<Product> findAll() {
    return products;
  }

}
