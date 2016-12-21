package com.example.domain;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

/**
 * Created by gatomulesei on 12/14/2016.
 */

@Entity
public class Breach extends BaseEntity {

    private static final long serialVersionUID = 1L;

    private Type type;
    
	@ManyToOne
	private Exclusion exclusion;

	public  Exclusion getExclusion() {
		return exclusion;
	}

	public void setExclusion(Exclusion exclusion) {
		this.exclusion = exclusion;
	}

	public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public enum Type{
        GAMBLED,
        ENTERED;
    }

}