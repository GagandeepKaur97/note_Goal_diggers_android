package com.example.note_goal_diggers_android;

public class notes{
    private String id;
    private String title;
    private String content;
    private String date;
    private String time;
    private String subjectname;
    private double userlat;
    private double userlong;



    public notes(String id, String title, String content, String date, String time, String subjectname,double userlat,double userlong) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.date = date;
        this.time = time;
        this.subjectname = subjectname;
        this.userlat = userlat;
        this.userlong = userlong;
    }

    public notes() {
    }

    public notes(String title, String content, String date, String time) {
        this.title = title;
        this.content = content;
        this.date = date;
        this.time = time;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getSubjectname() {
        return subjectname;
    }

    public void setSubjectname(String subjectname) {
        this.subjectname = subjectname;
    }

    public double getUserlat() {
        return userlat;
    }

    public void setUserlat(double userlat) {
        this.userlat = userlat;
    }

    public double getUserlong() {
        return userlong;
    }

    public void setUserlong(double userlong) {
        this.userlong = userlong;
    }
}
