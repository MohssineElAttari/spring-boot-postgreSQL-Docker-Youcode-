package com.example.docker.springbootbostgresdocker.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Comment;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = {"created_at,update_at"} ,allowGetters = true)
public class EmployeeAudit {


    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created_at" ,nullable = false,updatable = false)
    @CreatedDate
    private Date createdAt;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "update_at",nullable = false)
    @LastModifiedDate
    private Date updateAt;

    @Column(name = "created_by",nullable = false)
    @CreatedBy
    private String createdBy;

    @Column(name="update_by",nullable = false)
    @LastModifiedBy
    private String updateBy;
}
