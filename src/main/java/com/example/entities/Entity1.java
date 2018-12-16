package com.example.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import org.hibernate.envers.Audited;

import lombok.Data;

@Audited
@Entity
@Data
public class Entity1 {

    @Id
    @GeneratedValue
    Long id;

    private String preferences;

    @ManyToOne
    Entity0 parent;
}
