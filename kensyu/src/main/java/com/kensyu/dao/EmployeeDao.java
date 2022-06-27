package com.kensyu.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.kensyu.entity.EmployeeEntity;

/**
*
* 社員情報Dao
*
*/
@Mapper
public interface EmployeeDao {

    //    /**
    //    * IDから社員名を取得
    //    * ＠param id ID
    //    * @return 社員名
    //    */
    //    @Select("SELECT ID, NAME, gender FROM employee WHERE ID = #{id};")
    //    EmployeeEntity findById(long id);

    /**
    * IDから社員名を取得
    * ＠param id ID
    * @return 社員名
    */
    EmployeeEntity findById(@Param("id") long id);
}
