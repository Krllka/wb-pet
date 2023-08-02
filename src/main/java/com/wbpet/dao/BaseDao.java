package com.wbpet.dao;

import com.wbpet.entity.User;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
public interface BaseDao {
    User findUser();
}
