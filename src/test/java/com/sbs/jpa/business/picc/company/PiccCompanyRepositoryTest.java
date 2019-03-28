package com.sbs.jpa.business.picc.company;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.annotation.Resource;

import java.util.List;
import java.util.Optional;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@EnableTransactionManagement
public class PiccCompanyRepositoryTest {


    @Resource
    private PiccCompanyRepository repository;

    @Test
    public void test1(){
        Optional<PiccCompany> obj = repository.findById(118);

        PiccCompany piccCompany = obj.orElse(null);

        if (piccCompany == null){
            System.out.println(" is null");
        }else{
            System.out.println(piccCompany.toString());
        }

    }

    /*@Test
    public void testfindByComnameStartsWith(){
//        List<PiccCompany> list = repository.findByComnameStartsWith("20190124-09");
        List<PiccCompany> list = repository.findByComnameLike("20190124-09");
        if (list==null || list.size()<=0){
            System.out.println(" is null");
        }else{
            for (PiccCompany obj : list){
                System.out.println(obj.toString());
            }
        }
    }*/

    @Test
    public void testSelectByComnameLike(){
        List<PiccCompany> list = repository.selectByCombaneList("20190124-09");
        if (list==null || list.size()<=0){
            System.out.println(" is null");
        }else{
            for (PiccCompany obj : list){
                System.out.println(obj.toString());
            }
        }
    }

    @Test
    public void testfindByComname(){
        List<PiccCompany> list = repository.findByComname("测试修理厂-099");
        System.out.println("list-1->" + (list==null?" is null":list.toString()));

        List<PiccCompany> list2 = repository.findByComnameStartsWith("测试修理厂-09");
        System.out.println("list-2->" + (list2==null?" is null":list2.toString()));
    }

}