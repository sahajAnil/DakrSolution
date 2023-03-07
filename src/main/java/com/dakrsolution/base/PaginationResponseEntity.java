package com.dakrsolution.base;

import lombok.Data;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

@Data
public class PaginationResponseEntity<T> implements Serializable {

    private static final long serialVersionUID = -6428553510083645512L;
    private int totalRecords;
    private List<T> results;
    private Map<String, Object> mapResults;
    private int offset;
    private int pageSize;
    private List<Map<String, Object>> listMapResult;
}
