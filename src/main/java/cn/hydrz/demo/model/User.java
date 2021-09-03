package cn.hydrz.demo.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import io.ebean.Model;
import io.ebean.annotation.WhenCreated;
import io.ebean.annotation.WhenModified;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table
@NoArgsConstructor
@Getter
@Setter
@ToString(callSuper = false)
@EqualsAndHashCode(callSuper = false)
public class User extends Model {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;

    @WhenCreated
    @Column(name = "created_at", nullable = false, updatable = false)
    public Date createdAt;

    @WhenModified
    @Column(name = "updated_at", nullable = false)
    public Date updatedAt;

    @Column(name = "deleted_at")
    private Date deletedAt;

    private String openId;
    private String nickName;
    private String avatarUrl;

}
