package demo03;

import demo03.mapper.UserMapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

//使用注解
public class TestDemo03 {
    @Test
    public void test03() throws IOException {
        InputStream is = Resources.getResourceAsStream("mybatis_config01.xml");
        SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(is);
        SqlSession session = ssf.openSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        List<User> users = mapper.findAll();
        System.out.println(users);

    }

}
