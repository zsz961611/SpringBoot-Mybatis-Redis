package com.zsz.pojo;

import java.io.Serializable;

/**
 * 问题列表Bean
 */
public class Problem implements Serializable {

    private int id;        //ID/序号
    private String modular;     //模块
    private String content;   //功能内容
    private String describe;   //问题描述
    private String createdate;   //提出时间
    private String man;    //提出人
    private String priority;    //优先级
    private String startdate; //计划开始时间
    private String enddate; //计划结束时间
    private String state;     //状态
    private String jjr;    //解决人
    private String remarks;     //备注

    public Problem(int id, String modular, String content, String describe, String createdate, String man, String priority, String startdate, String enddate, String state, String jjr, String remarks) {
        this.id = id;
        this.modular = modular;
        this.content = content;
        this.describe = describe;
        this.createdate = createdate;
        this.man = man;
        this.priority = priority;
        this.startdate = startdate;
        this.enddate = enddate;
        this.state = state;
        this.jjr = jjr;
        this.remarks = remarks;
    }

    public Problem() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModular() {
        return modular;
    }

    public void setModular(String modular) {
        this.modular = modular;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public String getCreatedate() {
        return createdate;
    }

    public void setCreatedate(String createdate) {
        this.createdate = createdate;
    }

    public String getMan() {
        return man;
    }

    public void setMan(String man) {
        this.man = man;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getStartdate() {
        return startdate;
    }

    public void setStartdate(String startdate) {
        this.startdate = startdate;
    }

    public String getEnddate() {
        return enddate;
    }

    public void setEnddate(String enddate) {
        this.enddate = enddate;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getJjr() {
        return jjr;
    }

    public void setJjr(String jjr) {
        this.jjr = jjr;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}
