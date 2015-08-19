package org.zhubao.boot.model;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.NamedAttributeNode;
import javax.persistence.NamedEntityGraph;
import javax.persistence.Table;
import javax.persistence.Transient;

import lombok.Data;
import lombok.EqualsAndHashCode;

import org.zhubao.boot.model.decorate.BgColor;
import org.zhubao.boot.model.decorate.Gender;
import org.zhubao.boot.model.decorate.UserStatus;

@Data
@EqualsAndHashCode(of = {"userId", "username", "emailAddress"})
@Entity
@Table(name = "user")
@NamedEntityGraph(name = "User.tags", attributeNodes = @NamedAttributeNode("tags"))
public class User implements Serializable {
    @Transient
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue
    private int userId;
    @Column(length = 32, nullable = false, unique = true)
    private String username;
    @Column(length = 32, nullable = false, unique = true)
    private String emailAddress;
    @Column(length = 32, nullable = false)
    private String password;
    @Column(length = 128, nullable = false)
    private String avatar;
    @Column(nullable = false)
    private int age;
    @Column(length = 32, nullable = false)
    private String address;
    @Column(length = 1000, nullable = false)
    private String introduce;
    @Enumerated(EnumType.STRING)
    @Column(length = 10, nullable = false)
    private Gender gender;
    @Enumerated(EnumType.STRING)
    @Column(length = 10, nullable = false)
    private UserStatus status;
    @Enumerated(EnumType.STRING)
    @Column(length = 10, nullable = false)
    private BgColor introduceBgColor;
    @Column(nullable = false)
    private Date dateCreated;
    private Date dateUpdated;
    private Date dateLastLogin;
    
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "user_tag", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "tag_id"))
    private Set<Tag> tags = new HashSet<Tag>();
}
