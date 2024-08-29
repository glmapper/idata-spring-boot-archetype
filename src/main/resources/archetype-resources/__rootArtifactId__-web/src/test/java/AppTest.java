package ${package};

import ${package}.dao.jpa.UserRepository;
import ${package}.dao.mybatis.UserMapper;
import ${package}.model.entity.UserEntity;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.platform.commons.function.Try;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT, classes = Application.class)
@RunWith(SpringRunner.class)
public class TestsBase {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private UserMapper userMapper;

    @Before
    public void after() {
        this.userRepository.deleteAll();

        UserEntity userEntity = new UserEntity();
        userEntity.setName("glmapper");
        userEntity.setEmail("123@qq.com");
        this.userRepository.save(userEntity);
    }

    @Test
    public void test() {
        List<UserEntity> glmapper = this.userMapper.findByName("glmapper");
        Assert.assertTrue(glmapper.size() == 1);

    }
}

