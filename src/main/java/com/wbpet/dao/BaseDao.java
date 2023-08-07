package com.wbpet.dao;

import com.wbpet.entity.BaseEntity;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;

@EnableJpaRepositories
public interface BaseDao<B extends BaseEntity> extends CrudRepository<B, String>{
}
