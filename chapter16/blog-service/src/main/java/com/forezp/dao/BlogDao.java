package com.forezp.dao;

import com.forezp.entity.Blog;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 *
 * @author fangzhipeng
 * @date 2017/7/10
 */

public interface BlogDao extends JpaRepository<Blog, Long> {
    /** findByUsername */
    List<Blog> findByUsername(String username);

}
