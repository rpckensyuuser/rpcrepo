package com.kensyu.service;

public interface EmployeeService {

    /**
     * idを受け取り名前を返す。
     * @param id
     * @return 名前
     */
    String getName(long id);

    /**
     * idを受け取り性別を返す。
     * @param id
     * @return 性別
     */
    String getGendrr(long id);

}
