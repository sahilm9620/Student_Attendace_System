package com.mukesh.ip40;

import android.widget.EditText;
import android.widget.Spinner;


public class Student {
    String sname;
    String sid;
    String classes;
    String spass;

  /*  public Student(String sname, String sid){

    }*/

    public Student(String sname, String sid,String classes,String spass) {
        this.sname = sname;
        this.sid = sid;
        this.classes = classes;
        this.spass = spass;
    }

    public String getSname() { return sname; }

    public String getSid() {
        return sid;
    }
    public String getClasses() {
        return classes;
    }

    public String getspass() { return spass; }
}
