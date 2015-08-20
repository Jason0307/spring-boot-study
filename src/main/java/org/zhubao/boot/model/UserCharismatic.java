package org.zhubao.boot.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import lombok.Data;

@Data
@Entity
@Table(name = "user_charismatic")
public class UserCharismatic implements Serializable{
    @Transient
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    private int id;
    @Column(nullable = false)
    private int charm;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;
    
}
