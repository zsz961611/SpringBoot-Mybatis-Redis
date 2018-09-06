package com.zsz.service;

import com.zsz.pojo.Problem;


import java.util.List;
public interface ProblemService {

    /**
     * 查询所有问题列表数据
     * @return
     */
    List<Problem> findAllProblem();

    /**
     * 添加问题
     * @param problem  问题bean
     */
    int addProblem(Problem problem);

    /**
     * 根据问题ID删除
     * @param id
     * @return
     */
    void delProblem(int id);

}
