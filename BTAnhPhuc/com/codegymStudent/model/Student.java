package com.codegymStudent.model;

public class Student {
    private String name;
    private int id;
    private float score1;
    private float score2;
    private float score3;
    private float score4;
    private float mediumScore;

    public Student() {
    }

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public Student(String name, int id, float score1, float score2, float score3, float score4, float mediumScore) {
        this.name = name;
        this.id = id;
        this.score1 = score1;
        this.score2 = score2;
        this.score3 = score3;
        this.score4 = score4;
        this.mediumScore = mediumScore;
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

    public float getMediumScore() {

        return this.calc();
    }
    public float calc() {
        return (this.getScore1() + this.getScore2() + (this.getScore3() * 2) + (this.getScore4() * 3)) / 7;
    }

    @Override
    public String toString() {
        return name + ","+ id +"," + score1 + "," + score2 + "," + score3 +"," + score4 +","+ this.getMediumScore() +"\n";

    }
    public String toStringCSV() {
        return name + ","+ id +"," + score1 + "," + score2 + "," + score3 +"," + score4 +","+ mediumScore +"\n";

    }
    public String toStringSv() {
        return name + ","+ id +"\n";

    }
}
