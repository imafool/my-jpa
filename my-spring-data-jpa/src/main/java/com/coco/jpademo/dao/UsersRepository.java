package com.coco.jpademo.dao;

import com.coco.jpademo.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

/**
 * JpaRepository<Users, Integer>
 * @Param1：Users，对象实体（与数据库表对应）
 * @Param2：Interger，实体ID的类型
 *
 * 用法：直接注入到使用的地方
 */
@Repository
public interface UsersRepository extends JpaRepository<Users, Integer> {
    /*
     * 使用方法名拼接
     */
    List<Users> findAllByUsernameLike(String like);

    /*
     * 自定义SQL：
     * 1. 需要在事务环境下运行
     * 2. 需要DML支持
     * 3. 直接对【实体类】进行操作，实体类映射到表
     */
    @Transactional
    @Modifying
    @Query("update Users set password=?2 where id=?1") //对实体类操作，?xx标识形参位置
    int updatePasswordById(Integer id, String password);

}
