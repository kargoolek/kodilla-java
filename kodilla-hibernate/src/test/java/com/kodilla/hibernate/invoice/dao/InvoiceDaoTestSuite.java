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

@SpringBootTest
@RunWith(SpringRunner.class)
public class InvoiceDaoTestSuite {
    @Autowired
    InvoiceDao invoiceDao;
    @Autowired
    ProductDao productDao;
    @Autowired
    ItemDao itemDao;

    @Test
    public void testInvoiceDaoSave() {
        //Given
        final String INVOICE_NUMBER = "212/2018";
        Invoice invoice = new Invoice(INVOICE_NUMBER);
        invoiceDao.save(invoice);

        Product p1 = new Product("Product #1");
        Product p2 = new Product("Product #2");
        Product p3 = new Product("Product #3");
        Product p4 = new Product("Product #4");
        productDao.save(p1);
        productDao.save(p2);
        productDao.save(p3);
        productDao.save(p4);

        Item item1 = new Item(new BigDecimal(12.50),2,new BigDecimal(25.00));
        Item item2 = new Item(new BigDecimal(10.00),2,new BigDecimal(20.00));
        Item item3 = new Item(new BigDecimal(5.00),3,new BigDecimal(15.00));
        Item item4 = new Item(new BigDecimal(25.00),4,new BigDecimal(100.00));
        item1.setProduct(p4);
        item2.setProduct(p3);
        item3.setProduct(p2);
        item4.setProduct(p1);
        item1.setInvoice(invoice);
        item2.setInvoice(invoice);
        item3.setInvoice(invoice);
        item4.setInvoice(invoice);
        itemDao.save(item1);
        itemDao.save(item2);
        itemDao.save(item3);
        itemDao.save(item4);

        //When
        int id = invoice.getId();
        String invoiceNumber = invoiceDao.findOne(id).getNumber();

        //Then
        Assert.assertNotEquals(0, id);
        Assert.assertEquals(invoiceNumber, INVOICE_NUMBER);

        //CleanUp
        itemDao.deleteAll();
        productDao.deleteAll();
        invoiceDao.deleteAll();
    }

}
