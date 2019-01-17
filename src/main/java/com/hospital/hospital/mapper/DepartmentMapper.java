package com.hospital.hospital.mapper;

import com.hospital.hospital.domain.Department;
import com.hospital.hospital.domain.DepartmentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DepartmentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table department
     *
     * @mbggenerated Wed Jan 16 18:35:15 CST 2019
     */
    int countByExample(DepartmentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table department
     *
     * @mbggenerated Wed Jan 16 18:35:15 CST 2019
     */
    int deleteByExample(DepartmentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table department
     *
     * @mbggenerated Wed Jan 16 18:35:15 CST 2019
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table department
     *
     * @mbggenerated Wed Jan 16 18:35:15 CST 2019
     */
    int insert(Department record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table department
     *
     * @mbggenerated Wed Jan 16 18:35:15 CST 2019
     */
    int insertSelective(Department record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table department
     *
     * @mbggenerated Wed Jan 16 18:35:15 CST 2019
     */
    List<Department> selectByExample(DepartmentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table department
     *
     * @mbggenerated Wed Jan 16 18:35:15 CST 2019
     */
    Department selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table department
     *
     * @mbggenerated Wed Jan 16 18:35:15 CST 2019
     */
    int updateByExampleSelective(@Param("record") Department record, @Param("example") DepartmentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table department
     *
     * @mbggenerated Wed Jan 16 18:35:15 CST 2019
     */
    int updateByExample(@Param("record") Department record, @Param("example") DepartmentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table department
     *
     * @mbggenerated Wed Jan 16 18:35:15 CST 2019
     */
    int updateByPrimaryKeySelective(Department record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table department
     *
     * @mbggenerated Wed Jan 16 18:35:15 CST 2019
     */
    int updateByPrimaryKey(Department record);
}