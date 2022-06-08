package com.kensyu.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kensyu.dao.EmployeeDao;
import com.kensyu.entity.EmployeeEntity;
import com.kensyu.service.EmployeeService;

/**
 *
 * [DB] 社員情報取得サービス
 *
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeDao employeeDao;

    @Override
    public String getName(long id) {

        //テストデータ取得
        EmployeeEntity result = employeeDao.findById(id);

        // 取得した名前を返却
        return result.getName();
    }

    @Override
    public String getGendrr(long id) {

        //テストデータ取得
        EmployeeEntity result = employeeDao.findById(id);

        // 取得した性別を返却
        return result.getGender();
    }

}
