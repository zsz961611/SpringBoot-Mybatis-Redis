package com.zsz.controller;

import com.zsz.pojo.Problem;
import com.zsz.service.ProblemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class DocumentController {

    @Autowired
    private ProblemService problemService;

    /**
     * 使用templates模板引擎
     * 获取所有问题清单数据
     * @param model
     * @return
     */
    @GetMapping("/index")
    public String query(Model model){
        List<Problem> problemList = problemService.findAllProblem();
        model.addAttribute("problemList",problemList);
        return "index";
    }

    /**
     * 通过ajax请求将添加的问题信息持久化数据库
     * @param problem  bean实体对象
     * @return
     */
    @PostMapping("/add")
    @ResponseBody
    public String problemInsert(Problem problem){
        String result="";
        int num=problemService.addProblem(problem);
        if(num!=0){
            result="success";//插入成功
        }else{
            result="error";//插入失败
        }
        return result;
    }

    /**
     * 根据问题ID 删除某个问题
     */
    @GetMapping("/wtdel")
    public String wtDelete(@RequestParam("id") int id){
        problemService.delProblem(id);
        return "redirect:/index";
    }



}
