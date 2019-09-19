package com.forezp.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 *
 * @author fangzhipeng
 * @date 2017/5/27
 */

@Entity
public class User implements Serializable {
	private static final long serialVersionUID = -3761091214853637437L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false,  unique = true)
	private String username;

	@Column
	private String password;
	public User() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
