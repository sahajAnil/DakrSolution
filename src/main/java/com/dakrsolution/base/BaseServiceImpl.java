package com.dakrsolution.base;

import org.hibernate.Criteria;

public class BaseServiceImpl implements  BaseService{

    @Override
    public <T> T paginationResponse(Integer offset, Integer pageSize, boolean isPaginationFormatRequired,
                                    Criteria criteria, Criteria countCriteria) {
        PaginationResponseEntity paginationResponseEntity = new PaginationResponseEntity();
        if (isPaginationFormatRequired) {
            if (pageSize != null && pageSize != 0 && offset != null && offset != 0) {
                criteria.setMaxResults(pageSize);
                paginationResponseEntity.setPageSize(pageSize);
                offset = offset - 1;
                criteria.setFirstResult(offset * pageSize);
                offset = offset + 1;
                paginationResponseEntity.setOffset(offset);
                paginationResponseEntity.setTotalRecords(((Long) countCriteria.uniqueResult()).intValue());
            } else {
                paginationResponseEntity.setPageSize(0);
                paginationResponseEntity.setOffset(0);
            }
            paginationResponseEntity.setResults(criteria.list());
            return (T) paginationResponseEntity;
        } else {
            return (T) criteria.list();
        }
    }
}
