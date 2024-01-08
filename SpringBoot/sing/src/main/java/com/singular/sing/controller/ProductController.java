package com.singular.sing.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.singular.sing.login.LoginProcessor;
import com.singular.sing.model.Product;
import com.singular.sing.service.ProductService;

@Controller
public class ProductController {
  private final ProductService productService;

  public ProductController(ProductService productService) {
    this.productService = productService;
  }

  @GetMapping("/")
  public String loginGet() {
    return "login.html";
  }

  @PostMapping("/")
  public String loginPost(
      @RequestParam String username,
      @RequestParam String password,
      Model model) {

    LoginProcessor loginProcessor = new LoginProcessor();

    loginProcessor.setUsername(username);
    loginProcessor.setPassword(password);

    if (loginProcessor.login()) {
      model.addAttribute("message", "Logado");
      return "redirect:/products";
    } else {
      model.addAttribute("message", "Falha");
      return "login.html";
    }
  }

  @RequestMapping("/products")
  public String viewProducts(Model model) {
    var products = productService.findAll();
    model.addAttribute("products", products);
    return "products.html";
  }

  @PostMapping(path = "/products")
  public String addProduct(
      @RequestParam String name,
      @RequestParam double price,
      Model model) {
    Product p = new Product();
    p.setName(name);
    p.setPrice(price);
    productService.addProducts(p);

    var products = productService.findAll();
    model.addAttribute("products", products);
    return "products.html";
  }
}
