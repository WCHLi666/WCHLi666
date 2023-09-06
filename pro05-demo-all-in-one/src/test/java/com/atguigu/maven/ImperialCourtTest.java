package com.atguigu.maven;


import com.atguigu.imperial.court.dao.BaseDao;
import org.junit.Test;

public class ImperialCourtTest {
    private BaseDao<Emp> baseDao = new BaseDao<Emp>();

    @Test
    public void testGetSingleBean(){
        String sql = "";
        baseDao.getSingleBean()
    }

    @Test
    public void testGetConnection(){

    }
}
