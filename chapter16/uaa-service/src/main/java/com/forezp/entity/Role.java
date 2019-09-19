package com.forezp.entity;

import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;

/**
 *
 * @author fangzhipeng
 * @date 2017/5/27
 */
@Entity
public class Role implements GrantedAuthority {

	private static final long serialVersionUID = 7457970087709121712L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false)
	private String name;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public String getAuthority() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}
}
