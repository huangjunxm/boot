package com.shuijing.boot;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

public class DepartmentDaoImpl implements DepartmentDao {
    private final SqlSessionFactory sqlSessionFactory;
    public DepartmentDaoImpl(SqlSessionFactory sqlSessionFactory) {
        this.sqlSessionFactory = sqlSessionFactory;
    }
    @Override
    public List<Department> findAll() {
        try (SqlSession session = sqlSessionFactory.openSession(true)) {
            return session.selectList("departmentMapper.findAll");
        }
    }
    @Override
    public Department findById(String id) {
        try (SqlSession session = sqlSessionFactory.openSession(true)) {
            return session.selectOne("departmentMapper.findById", id);
        }
    }
}
