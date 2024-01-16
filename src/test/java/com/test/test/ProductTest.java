package com.test.test;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProductTest {

    @Test
    public void createProductWithValidId_shouldCreateProductWithCorrectId() {
        // Créez un produit avec un ID valide
        Long id = 1L;
        String name = "Nom du produit";
        String description = "Description du produit";
        BigDecimal price = new BigDecimal(BigInteger.valueOf(12),34);
        Product product = new Product(id, name, description, price);

        // Vérifiez que le produit a l'ID correct
        assertEquals(id, product.getId());
    }

    @Test
    public void getId_shouldReturnCorrectId() {
        // Créez un produit avec un ID valide
        Long id = 1L;
        String name = "Nom du produit";
        String description = "Description du produit";
        BigDecimal price = new BigDecimal(BigInteger.valueOf(12),34);
        Product product = new Product(id, name, description, price);

        // Obtenir l'ID du produit
        Long productId = product.getId();

        // Vérifiez que l'ID du produit est correct
        assertEquals(id, productId);
    }

    @Test
    public void setName_shouldSetNameAndGetSetCorrectName() {
        // Créez un produit avec un ID valide
        Long id = 1L;
        String name = "Nom du produit";
        String description = "Description du produit";
        BigDecimal price = new BigDecimal(BigInteger.valueOf(12),34);
        Product product = new Product(id, name, description, price);

        // Définissez un nouveau nom pour le produit
        String newName = "Nouveau nom du produit";
        product.setName(newName);

        // Obtenez le nom du produit
        String productName = product.getName();

        // Vérifiez que le nom du produit est correct
        assertEquals(newName, productName);
    }
}

