package ${package}.model.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * UserEntity for test
 * </p>
 *
 * @author mailto:glmapper_2018@163.com glmapper
 * @date 2023/3/15 10:41 上午
 * @since 1.0
 */
@Entity
@Table(name = "t_user")
@Data
public class UserEntity implements Serializable {

    /**
     * 用户id
     */
    private Long id;

    private Date createTime = new Date();
    private Date updateTime = new Date();
    private String nickName;
    private String password;

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    public Long getId() {
        return id;
    }
}
