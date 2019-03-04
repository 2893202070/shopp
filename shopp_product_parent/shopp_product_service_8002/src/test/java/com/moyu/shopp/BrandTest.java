package com.moyu.shopp;


import com.moyu.shopp.domain.Brand;
import com.moyu.shopp.mapper.BrandMapper;
import com.moyu.shopp.query.BrandQuery;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BrandTest {
    @Autowired
    private BrandMapper brandMapper;
    @Test
    public void test(){
        BrandQuery brandQuery = new BrandQuery();
        brandQuery.setKeyword("a");
        long l = brandMapper.queryPageCount(brandQuery);

        System.out.println(l);
        List<Brand> brands = brandMapper.queryPage(new BrandQuery());
       for (Brand brand : brands) {
            System.out.println(brand);
        }
    }
    @Test
    public void test2(){
        List<Brand> tt = brandMapper.tt(new BrandQuery());
        for (Brand brand : tt) {
            System.out.println(brand);
        }

    }
}
