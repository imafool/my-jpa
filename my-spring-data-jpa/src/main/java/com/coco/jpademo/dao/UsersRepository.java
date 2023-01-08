package com.coco.jpademo.dao;

import com.coco.jpademo.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * JpaRepository<Users, Integer>
 * @Param1：Users，对象实体（与数据库表对应）
 * @Param2：Interger，实体ID的类型
 *
 * 用法：直接注入到使用的地方
 */
@Repository
public interface UsersRepository extends JpaRepository<Users, Integer> {
}
