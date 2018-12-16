package com.example.entities;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import lombok.Data;
import org.hibernate.envers.Audited;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Audited
@Entity
@EntityListeners(AuditingEntityListener.class)
public class Entity0 {

    @Id
    @GeneratedValue
    private Long id;

    @NotNull
    private String name;
    
    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Entity1> getEntities() {
		return entities;
	}

	public void setEntities(List<Entity1> entities) {
		this.entities = entities;
	}

	@OneToMany
    private List<Entity1> entities;
}
