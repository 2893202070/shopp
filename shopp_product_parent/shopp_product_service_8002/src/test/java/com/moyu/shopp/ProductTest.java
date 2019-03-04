package com.moyu.shopp;

import com.moyu.shopp.domain.Product;
import com.moyu.shopp.service.IProductService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductTest {
    @Autowired
    private IProductService productService;

    @Test
    public void test(){
        List<Product> products = productService.selectList(null);
        for (Product product : products) {
            System.out.println(product);
        }
    }
}
