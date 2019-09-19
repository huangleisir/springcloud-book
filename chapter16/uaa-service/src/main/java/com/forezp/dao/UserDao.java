package com.forezp.dao;


import com.forezp.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 读取用户
 * @return
 */
public interface UserDao extends JpaRepository<User, Long> {
	/**
	 * 根据用户名查找用户
	 * @param username
	 * @return
	 */
	User findByUsername(String username);
}
