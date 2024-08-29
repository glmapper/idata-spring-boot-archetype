package ${package}.dao.mybatis;

import ${package}.model.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * <p>
 * todo desc
 * </p>
 *
 * @author mailto:glmapper_2018@163.com glmapper
 * @date 2023/3/15 10:55 上午
 * @since 1.0
 */
@Mapper
public interface UserMapper {
    // 自定义添加通过用户名称模糊查找用户信息
    List<UserEntity> findByNickName(String nickName);
}
