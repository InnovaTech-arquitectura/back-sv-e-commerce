package com.innovatech.e_commerce.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/carrito")

public class ShoppingCartController {

    public class shoppingCartItem {
    
        private int id;
        private String name;
        private float price;
        private String description;
        private String image;
        private int quantity;
        
        public shoppingCartItem(int id, String name, float price, String description, String image, int quantity) {
            this.id = id;
            this.name = name;
            this.price = price;
            this.description = description;
            this.image = image;
            this.quantity = quantity;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public float getPrice() {
            return price;
        }

        public String getDescription() {
            return description;
        }

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }

        public int getQuantity() {
            return quantity;
        }

        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }

    }

    private String[] imageUrls = {
        "https://i.pinimg.com/736x/3c/aa/11/3caa115554f44216154adaed787e1610.jpg",
        "https://i.pinimg.com/736x/3c/aa/11/3caa115554f44216154adaed787e1610.jpg",
        "https://i.pinimg.com/736x/3c/aa/11/3caa115554f44216154adaed787e1610.jpg",
        "https://i.pinimg.com/736x/3c/aa/11/3caa115554f44216154adaed787e1610.jpg",
        "https://i.pinimg.com/736x/3c/aa/11/3caa115554f44216154adaed787e1610.jpg", 
        "https://i.pinimg.com/736x/3c/aa/11/3caa115554f44216154adaed787e1610.jpg",
        "https://i.pinimg.com/736x/3c/aa/11/3caa115554f44216154adaed787e1610.jpg",
        "https://i.pinimg.com/736x/3c/aa/11/3caa115554f44216154adaed787e1610.jpg",
        "https://i.pinimg.com/736x/3c/aa/11/3caa115554f44216154adaed787e1610.jpg",
        "https://i.pinimg.com/736x/3c/aa/11/3caa115554f44216154adaed787e1610.jpg",    
        "https://i.pinimg.com/736x/3c/aa/11/3caa115554f44216154adaed787e1610.jpg", 
        "https://i.pinimg.com/736x/3c/aa/11/3caa115554f44216154adaed787e1610.jpg" 
    };

    private List<shoppingCartItem> productos = new ArrayList<>();
    private List<shoppingCartItem> servicios = new ArrayList<>();

    public ShoppingCartController() {
        for (int i = 0; i < 12; i++) {
            String image = imageUrls[i];
            productos.add(new shoppingCartItem(i, "Producto " + i, i * 100.0f, "Descripción del producto " + i, image, 1));
        }

        for (int i = 0; i < 12; i++) {
            String image = imageUrls[i];
            servicios.add(new shoppingCartItem(i, "Servicio " + i, i * 100.0f, "Descripción del servicio " + i, image, 1));
        }
    }



    
    
    @GetMapping("/shoppingCart")    
    public ResponseEntity<List<shoppingCartItem>> obtenerItems() {
        List<shoppingCartItem> productos = new ArrayList<>();

        for (shoppingCartItem item : this.productos) {
            productos.add(item);
        }
        return ResponseEntity.ok(productos);
    }
    
}
