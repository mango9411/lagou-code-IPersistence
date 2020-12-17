package com.lagou.sqlSession;

import com.lagou.pojo.Configuration;
import com.lagou.pojo.MappedStatement;

import java.util.List;

public interface Executor {

    public <E> List<E> query(Configuration configuration, MappedStatement mappedStatement, Object... params) throws Exception;

    /**
     * 增删改
     *
     * @param configuration
     * @param mappedStatement
     * @param params
     */
    boolean execute(Configuration configuration, MappedStatement mappedStatement, Object... params) throws Exception;
}
