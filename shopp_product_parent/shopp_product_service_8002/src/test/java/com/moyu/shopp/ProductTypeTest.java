package com.moyu.shopp;

import com.moyu.shopp.domain.ProductType;
import com.moyu.shopp.mapper.ProductTypeMapper;
import com.moyu.shopp.service.impl.ProductTypeServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductTypeTest {
    @Autowired
    private ProductTypeServiceImpl productTypeService;
    @Test
    public void test(){

        List<ProductType> productTypes = productTypeService.treeData();
        for (ProductType productType : productTypes) {
            System.out.println(productType);
        }
    }

}
