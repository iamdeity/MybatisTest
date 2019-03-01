package test;

import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion;
import mapper.MemberMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import pojo.Member;

import java.io.InputStream;
import java.util.List;

/**
 * Created by wyj on 2019/3/1.
 */
public class Mytest {


    public static List<Member> findll() throws Exception {
        String resource= "SqlMapConfig.xml";
        InputStream input = Resources.getResourceAsStream(resource);
        SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(input);
        SqlSession sqlSession = factory.openSession();
        MemberMapper mapper = sqlSession.getMapper(MemberMapper.class);
        List<Member> list = mapper.findall();
        //List<Member> list = sqlSession.selectList("mapper.MemberMapper.finall");
        //System.out.println(list);
        return  list;
    }
}
