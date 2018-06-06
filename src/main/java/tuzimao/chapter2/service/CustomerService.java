package tuzimao.chapter2.service;

import tuzimao.chapter2.helper.DatabaseHelper;
import tuzimao.chapter2.model.Customer;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/*
* 提供客户数据服务
* */
public class CustomerService {
    private static final Logger LOGGER = LoggerFactory.getLogger(CustomerService.class);


    /*
    * 获取客户列表
    * */
    public List<Customer> getCustomerList()
    {
        String sql = "SELECT * FROM customer";

        return DatabaseHelper.queryEntityList(Customer.class, sql);
    }

    /*
     * 获取客户列表
     * */
    public List<Customer> getCustomerList(String keyword)
    {
        // TODO

        return null;
    }
    /*
    * 获取客户
    * */
    public Customer getCustomer(long id)
    {
        // TODO
        return null;
    }

    /*
    * 创建客户
    * */
    public boolean createCustomer(Map<String, Object> fieldMap)
    {
        // TODO
        return false;
    }
    /*
    * 更新客户
    * */
    public boolean updateCustomer(long id, Map<String, Object> fieldMap)
    {
        // TODO
        return false;
    }
    /*
     * 删除客户
     * */
    public boolean deleteCustomer(long id)
    {
        // TODO
        return false;
    }
}
