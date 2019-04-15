package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    InvoiceDao invoiceDao;

    @Autowired
    ProductDao productDao;

    @Test
    public void testInvoiceDaoSave(){
        //GIVEN
        Product product1 = new Product("smartphone");
        Product product2 = new Product("lamp");
        Product product3 = new Product("headphones");
        Item item1 = new Item(product1, new BigDecimal(1400), 1, new BigDecimal(1400));
        Item item2 = new Item(product2, new BigDecimal(55), 2, new BigDecimal(110));
        Item item3 = new Item(product3, new BigDecimal(420), 1, new BigDecimal(420));
        Invoice invoice = new Invoice("ABC/XYZ/2019");
        invoice.getItems().add(item1);
        invoice.getItems().add(item2);
        invoice.getItems().add(item3);
        //WHEN
        productDao.save(product1);
        productDao.save(product2);
        productDao.save(product3);
        invoiceDao.save(invoice);
        int id = invoice.getId();
        //THEN
        Assert.assertNotEquals(0, id);
        //CLEAN-UP
        invoiceDao.deleteById(id);

    }
}
