package com.hospital.hospital.mapper;

import com.hospital.hospital.domain.Registration;
import com.hospital.hospital.domain.RegistrationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RegistrationMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table registration
     *
     * @mbggenerated Mon Jan 21 18:56:09 CST 2019
     */
    int countByExample(RegistrationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table registration
     *
     * @mbggenerated Mon Jan 21 18:56:09 CST 2019
     */
    int deleteByExample(RegistrationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table registration
     *
     * @mbggenerated Mon Jan 21 18:56:09 CST 2019
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table registration
     *
     * @mbggenerated Mon Jan 21 18:56:09 CST 2019
     */
    int insert(Registration record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table registration
     *
     * @mbggenerated Mon Jan 21 18:56:09 CST 2019
     */
    int insertSelective(Registration record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table registration
     *
     * @mbggenerated Mon Jan 21 18:56:09 CST 2019
     */
    List<Registration> selectByExample(RegistrationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table registration
     *
     * @mbggenerated Mon Jan 21 18:56:09 CST 2019
     */
    Registration selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table registration
     *
     * @mbggenerated Mon Jan 21 18:56:09 CST 2019
     */
    int updateByExampleSelective(@Param("record") Registration record, @Param("example") RegistrationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table registration
     *
     * @mbggenerated Mon Jan 21 18:56:09 CST 2019
     */
    int updateByExample(@Param("record") Registration record, @Param("example") RegistrationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table registration
     *
     * @mbggenerated Mon Jan 21 18:56:09 CST 2019
     */
    int updateByPrimaryKeySelective(Registration record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table registration
     *
     * @mbggenerated Mon Jan 21 18:56:09 CST 2019
     */
    int updateByPrimaryKey(Registration record);
}