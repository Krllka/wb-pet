package com.wbpet.service;

import com.wbpet.dao.BaseDao;
import com.wbpet.entity.BaseEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.persistence.MappedSuperclass;

@Service
@MappedSuperclass
@RequiredArgsConstructor
public class BaseServiceImpl<B extends BaseEntity> implements BaseService<B>{

    private final BaseDao<B> baseDao;
    @Override
    public B findById(String id) {
        return baseDao.findById(id).orElseGet(null);
    }
}
