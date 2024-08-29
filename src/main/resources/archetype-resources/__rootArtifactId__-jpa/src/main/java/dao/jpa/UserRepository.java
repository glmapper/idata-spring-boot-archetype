package ${package}.dao.jpa;

import ${package}.model.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author mailto:glmapper_2018@163.com glmapper
 * @date 2023/3/15 10:53 上午
 * @since 1.0
 */
public interface UserRepository extends CrudRepository<UserEntity, Long> {
}
