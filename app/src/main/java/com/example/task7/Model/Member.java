package com.example.task7.Model;

import androidx.annotation.NonNull;

public class Member {
    int profile;
    String name;
    String surname;

    public Member(){

    }
    public Member(int profile, String name, String surname){
        this.profile = profile;
        this.name = name;
        this.surname = surname;
    }

    public int getProfile(){ return profile; }
    public String getName(){
        return name;
    }
    public String getSurname(){
        return surname;
    }

    @NonNull
    public String toString(){
        return profile+" : "+name+" "+surname;

    }

}

