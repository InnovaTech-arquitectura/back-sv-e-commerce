package com.innovatech.e_commerce.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/tienda")
public class eCommerceController {

    public static class ShopItem {
        private int id;
        private String name;
        private float price;
        private String description;
        private String image;

        public ShopItem(int id, String name, float price, String description, String image) {
            this.id = id;
            this.name = name;
            this.price = price;
            this.description = description;
            this.image = image;
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

        public void serImage(String image) {
            this.image = image;
        }
    }

    private String[] imageUrls = {
        "https://lavozdelnorte.com.co/wp-content/uploads/2022/04/WhatsApp-Image-2022-04-22-at-9.29.02-AM.jpeg",
        "https://hips.hearstapps.com/hmg-prod/images/lando-norris-of-the-uk-drives-the-mclaren-f1-team-mcl38-news-photo-1729458821.jpg?crop=1xw:0.84361xh;center,top&resize=1200:*",
        "https://d31f1ehqijlcua.cloudfront.net/n/6/3/d/b/63db2b358f1f32e9d1b3864cf724ac5e2a603253_Chocolates_472442_01.jpg",
        "https://down-co.img.susercontent.com/file/sg-11134201-7rbku-lm5wna9qrev90f",
        "https://i.scdn.co/image/ab67616d0000b273c5649add07ed3720be9d5526", 
        "https://cloudfront-us-east-1.images.arcpublishing.com/metroworldnews/PXEJKKUKCNCARACG3SQ5BVHLWY.jpg",
        "https://img.freepik.com/vector-premium/chica-pelota-baloncesto-deportes-activos-ilustracion-vectorial-fondo-aislado_372860-68.jpg",
        "https://m.media-amazon.com/images/I/81H64S5fb9L._AC_UY1000_.jpg",
        "https://lumiere-a.akamaihd.net/v1/images/darth-vader-main_4560aff7.jpeg?region=0%2C67%2C1280%2C720",
        "https://mundodulcegolosinas.com/wp-content/uploads/2023/06/trululu-snack.png",    
        "https://m.media-amazon.com/images/M/MV5BMGVhZTY1YTctOWJlYS00MjcxLTlkNDgtYTUxZTM5MzMzZjI2XkEyXkFqcGc@._V1_.jpg", 
        "https://i.pinimg.com/enabled_lo/564x/15/9b/8b/159b8b3e939130366067454a3ad4ca6f.jpg" 
    };

    private List<ShopItem> productos = new ArrayList<>();
    private List<ShopItem> servicios = new ArrayList<>();

    public eCommerceController() {
        for (int i = 1; i <= 12; i++) {
            String image = imageUrls[i-1];
            productos.add(new ShopItem(i, "Producto " + i, i * 100.0f, "Descripción del producto " + i, image));
        }

        for (int i = 1; i <= 12; i++) {
            String image = imageUrls[i-1];
            servicios.add(new ShopItem(i, "Servicio " + i, i * 200.0f, "Descripción del servicio " + i,  image));
        }
    }

    @GetMapping("/productos")
    public ResponseEntity<List<ShopItem>> obtenerProductos() {
        List<ShopItem> productsList = new ArrayList<>();

        for (ShopItem producto : productos) {
            productsList.add(producto);
        }
        return ResponseEntity.ok(productsList);
    }

    @GetMapping("/servicios")
    public ResponseEntity<List<ShopItem>> obtenerServicios() {
        List<ShopItem> servicesList = new ArrayList<>();

        for (ShopItem servicio : servicios) {
            servicesList.add(servicio);
        }
        return ResponseEntity.ok(servicesList);
    }

    @GetMapping("/productos/{index}")
    public ResponseEntity<ShopItem> obtenerProductoPorIndice(@PathVariable int index) {
        index = index-1;
        if (index < 0 || index >= productos.size()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(productos.get(index));
    }

    @GetMapping("/servicios/{index}")
    public ResponseEntity<ShopItem> obtenerServicioPorIndice(@PathVariable int index) {
        index= index-1;
        if (index < 0 || index >= servicios.size()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(servicios.get(index));
    }
}
