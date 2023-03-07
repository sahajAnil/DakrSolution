package com.dakrsolution.base;

import org.hibernate.Criteria;

public interface BaseService {

    <T> T paginationResponse(Integer offset, Integer pageSize, boolean isPaginationFormatRequired,
                             Criteria criteria, Criteria countCriteria);
}
