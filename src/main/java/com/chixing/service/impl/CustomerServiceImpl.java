package com.chixing.service.impl;

import com.chixing.dao.CustomerDao;
import com.chixing.entity.Customer;
import com.chixing.entity.CustomerExample;
import com.chixing.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service  //<bean id="" class="">
public class  CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerDao dao;  // 构造器 方式赋值  MapperScannerConfig  dao接口子类.sqlSessionTemplate
    private String name;  // 构造器方法赋值

    public CustomerServiceImpl(){}


    @Override
    public List<Customer> getall() {
        return null;
    }

    @Override
    public boolean save(Customer customer) {
        return false;
    }

    @Override
    public Customer getById(Integer id) {
        Customer customer = dao.selectByPrimaryKey(id);
        return customer;
    }

    @Override
    public Customer getByPhone(Long telno) {

/*      //测试数据
       Customer customer = new Customer();
       customer.setCustName("测试");
       customer.setCustTelno(telno);
       customer.setCustId(1);
        return customer;*/
        CustomerExample example =   new CustomerExample(); //select * from customer where  telno =? and pwd = ?
        example. createCriteria().andCustTelnoEqualTo(telno);
        List<Customer> customerList = dao.selectByExample(example);

        if(customerList ==null || customerList.size()==0){
            return null;
        }else{
            return customerList.get(0);
        }
    }

}
