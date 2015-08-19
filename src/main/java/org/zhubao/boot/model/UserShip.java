package org.zhubao.boot.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;

import lombok.Data;

import org.zhubao.boot.model.key.UserShipKey;

@Data
@Entity
@Table(name = "user_ship")
public class UserShip implements Serializable {
    @Transient
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    private UserShipKey id;
    @Column(nullable = false)
    private Date dateCreated;
}
