package com.wbpet.service;

import com.wbpet.dao.BaseDao;
import com.wbpet.entity.BaseEntity;
import org.springframework.data.repository.core.CrudMethods;

public interface BaseService<B extends BaseEntity> {
    B findById(String id);
}
