package com.willkernel.app.databinding.model;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

/**
 * Created by willkernel on 2017/1/10.
 * mail:willkerneljc@gmail.com
 */
public class User extends BaseObservable {
    private String firstName;
    private String lastName;
    private int age;

    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public User(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public User() {

    }

    @Bindable
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
        notifyPropertyChanged(com.willkernel.app.databinding.BR.firstName);
    }

    @Bindable
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
        notifyPropertyChanged(com.willkernel.app.databinding.BR.lastName);
    }

    @Bindable
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
        notifyPropertyChanged(com.willkernel.app.databinding.BR.age);
    }

    public boolean isAdult() {
        return age >= 18;
    }

    @Bindable
    public String getFullName() {
        return lastName + "·" + firstName;
    }
}