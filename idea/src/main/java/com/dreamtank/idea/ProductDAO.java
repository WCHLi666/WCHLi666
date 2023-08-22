package com.dreamtank.idea;

public class ProductDAO {
    public List<Product> findAll(){
        Queryrun runner=new QueryRunner(JdbcUtils.getDataSource());
        runner.query("select * from product", new BeanListHandler<Product>(Product.class));
    }
}
