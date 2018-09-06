package com.zsz.service.impl;

import com.zsz.dao.ProblemMapper;
import com.zsz.pojo.Problem;
import com.zsz.service.ProblemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ProblemServiceImpl implements ProblemService {

    @Autowired
    private ProblemMapper problemMapper;

    @Override
    public List<Problem> findAllProblem() {

        return problemMapper.findAllProblem();
    }

    @Override
    public int addProblem(Problem problem) {

        return problemMapper.addProblem(problem);
    }

    @Override
    public void delProblem(int id) {
        problemMapper.delProblem(id);
    }
}
