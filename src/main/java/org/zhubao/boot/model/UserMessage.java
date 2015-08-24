package org.zhubao.boot.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import org.zhubao.boot.model.decorate.MessageStatus;

@Data
@EqualsAndHashCode(exclude = {"toUser", "fromUser"})
@ToString(exclude = {"toUser", "fromUser"})
@Entity
@Table(name = "user_message")
public class UserMessage implements Serializable{
    @Transient
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue
    private int id;
    @Column(length = 255, nullable = false)
    private String content;
    @ManyToOne(targetEntity = User.class)
    @JoinColumn(name = "to_user_id", nullable = false)
    private User toUser;
    @ManyToOne(targetEntity = User.class)
    @JoinColumn(name = "from_user_id", nullable = false)
    private User fromUser;
    @Enumerated(EnumType.STRING)
    private MessageStatus status;
    @Column( nullable = false)
    private Date dateCreated;
    private Date dateRead;

}
