package demo01;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;


import java.io.IOException;
import java.io.InputStream;
import java.util.List;

//简单的查询表中的信息
public class TestDemo {
    @Test
    public void test01() throws IOException {
        InputStream is = Resources.getResourceAsStream("mybatis_config01.xml");
        SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(is);
        SqlSession session = ssf.openSession();
        List<User> userList = session.selectList("demo01.TestDemo.findAll");
        System.out.println(userList);

    }
}
