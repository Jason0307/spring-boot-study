package org.zhubao.boot.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedAttributeNode;
import javax.persistence.NamedEntityGraph;
import javax.persistence.Table;
import javax.persistence.Transient;

import lombok.Data;

@Data
@Entity
@Table(name = "article")
@NamedEntityGraph(name = "Article.user", attributeNodes = @NamedAttributeNode("user"))
public class Article implements Serializable {

    @Transient
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue
    private int id;
    @Column(length = 128, nullable = false)
    private String title;
    @Column(length = 10000, nullable = false)
    private String content;
    @ManyToOne(fetch = FetchType.LAZY, targetEntity = User.class)
    @JoinColumn(name = "user_id")
    private User user;
    @Column(nullable = false)
    private Date dateCreated;
    private Date dateUpdated;

}
