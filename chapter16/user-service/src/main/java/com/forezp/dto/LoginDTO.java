package com.forezp.dto;

import com.forezp.entity.User;

/**
 *
 * @author fangzhipeng
 * @date 2017/7/10
 */
public class LoginDTO {
    private User user;
    private String token;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @Override
    public String toString() {
        return "LoginDTO{" +
                "user=" + user +
                ", token='" + token + '\'' +
                '}';
    }
}
