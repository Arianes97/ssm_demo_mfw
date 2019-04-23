package com.chixing.service;

import com.chixing.dao.CustomerDao;
import com.chixing.entity.Customer;

import java.util.List;


public interface CustomerService {

    public List<Customer> getall();

    //1. 用户添加
    public boolean save(Customer customer) ;

    //2. 用户修改

    //3. 用户查询
    public Customer getById(Integer id) ;

    //3. 用户查询
    public Customer getByPhone(Long telno) ;

}
