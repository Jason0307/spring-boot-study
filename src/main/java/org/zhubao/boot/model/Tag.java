package org.zhubao.boot.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@EqualsAndHashCode(of = {"id"})
@ToString(exclude = "users")
@Entity
@Table(name = "tag")
public class Tag implements Serializable{
    @Transient
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue
    private int id;
    @Column(length = 255, nullable = false)
    private String title;
    @ManyToMany(mappedBy = "tags", fetch = FetchType.EAGER)
    private Set<User> users = new HashSet<User>();
}
