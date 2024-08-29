package ${package}.user;

import ${package}.TestsBase;
import ${package}.dao.jpa.UserRepository;
import ${package}.dao.mybatis.UserMapper;
import ${package}.model.entity.UserEntity;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserTest extends TestsBase {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private UserMapper userMapper;

    @Before
    public void before() {
        this.userRepository.deleteAll();
        UserEntity userEntity = new UserEntity();
        userEntity.setNickName("glmapper");
        this.userRepository.save(userEntity);
    }

    @After
    public void after() {
        this.userRepository.deleteAll();
    }

    @Test
    public void test() {
        List<UserEntity> glmapper = this.userMapper.findByNickName("glmapper");
        Assert.assertTrue(glmapper.size() == 1);
    }
}

