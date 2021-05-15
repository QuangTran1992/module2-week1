package com.student.model;

public class Student {
    String name;
    int id;
    float score1;
    float score2;
    float score3;
    float score4;

    public Student() {
    }

    public Student(String name, int id, float score1, float score2, float score3, float score4) {
        this.name = name;
        this.id = id;
        this.score1 = score1;
        this.score2 = score2;
        this.score3 = score3;
        this.score4 = score4;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getScore1() {
        return score1;
    }

    public void setScore1(float score1) {
        this.score1 = score1;
    }

    public float getScore2() {
        return score2;
    }

    public void setScore2(float score2) {
        this.score2 = score2;
    }

    public float getScore3() {
        return score3;
    }

    public void setScore3(float score3) {
        this.score3 = score3;
    }

    public float getScore4() {
        return score4;
    }

    public void setScore4(float score4) {
        this.score4 = score4;
    }

    public float mediumScore(){
        float medScrore1 ;
       return medScrore1 = ((this.score1 + this.score2) + this.score3 * 2 + this.score4 * 3) / 7 ;
    }

    @Override
    public String toString() {
        return name + "," + id + "," + score1 + "," + score2 + "," + score3 + "," + score4 + "," + mediumScore() +"\n" ;
    }


}
