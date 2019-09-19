package com.forezp.dto;

import com.forezp.entity.Blog;
import com.forezp.entity.User;

/**
 *
 * @author fangzhipeng
 * @date 2017/7/10
 */
public class BlogDetailDTO {
    @Override
    public String toString() {
        return "BlogDetailDTO{" +
                "blog=" + blog +
                ", user=" + user +
                '}';
    }

    private Blog blog;
    private User user;

    public Blog getBlog() {
        return blog;
    }

    public void setBlog(Blog blog) {
        this.blog = blog;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
