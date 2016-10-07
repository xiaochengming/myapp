package com.example.administrator.myapplication.entity;

import java.sql.Timestamp;

/**
 * Created by Administrator on 2016/9/21.
 */
public class Evaluate {
    private int evaluate_id;
    private Order order;
    private String evaluate;//评价
    private int grade;//几星评价
    private Timestamp time;
    private int evaluateTo;
    private int hasNext;

    public Evaluate() {
    }

    public Evaluate(Order order, int grade, String evaluate, Timestamp time, int evaluateTo, int hasNext) {
        this.order = order;
        this.grade = grade;
        this.evaluate = evaluate;
        this.time = time;
        this.evaluateTo = evaluateTo;
        this.hasNext = hasNext;
    }

    public Evaluate(int evaluate_id, Order order, String evaluate, int grade, Timestamp time, int evaluateTo, int hasNext) {
        this.evaluate_id = evaluate_id;
        this.order = order;
        this.evaluate = evaluate;
        this.grade = grade;
        this.time = time;
        this.evaluateTo = evaluateTo;
        this.hasNext = hasNext;
    }

    @Override

    public String toString() {
        return "Evaluate{" +
                "evaluate_id=" + evaluate_id +
                ", order=" + order +
                ", evaluate='" + evaluate + '\'' +
                ", grade=" + grade +
                ", time=" + time +
                ", evaluateTo=" + evaluateTo +
                ", hasNext=" + hasNext +
                '}';
    }

    public int getEvaluate_id() {
        return evaluate_id;
    }

    public void setEvaluate_id(int evaluate_id) {
        this.evaluate_id = evaluate_id;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Timestamp getTime() {
        return time;
    }

    public void setTime(Timestamp time) {
        this.time = time;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getEvaluate() {
        return evaluate;
    }

    public void setEvaluate(String evaluate) {
        this.evaluate = evaluate;
    }

    public int getEvaluateTo() {
        return evaluateTo;
    }

    public void setEvaluateTo(int evaluateTo) {
        this.evaluateTo = evaluateTo;
    }

    public int getHasNext() {
        return hasNext;
    }

    public void setHasNext(int hasNext) {
        this.hasNext = hasNext;
    }
}
