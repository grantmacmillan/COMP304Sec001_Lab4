package com.example.grantmacmillan_bencoombes_comp304sec001_lab4_ex1;

import androidx.room.ColumnInfo;
import androidx.room.PrimaryKey;

public class Examiner {
    @PrimaryKey
    int examinerId;
    @ColumnInfo(name = "firstNameColumn")
    String firstName;
    @ColumnInfo(name = "lastNameColumn")
    String lastName;
    @ColumnInfo(name = "testCenterColumn")
    String testCenter;
    @ColumnInfo(name = "passwordColumn")
    String password;

    public Examiner(int examinerId, String firstName, String lastName, String testCenter, String password) {
        this.examinerId = examinerId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.testCenter = testCenter;
        this.password = password;
    }

    public int getExaminerId() {
        return examinerId;
    }

    public void setExaminerId(int examinerId) {
        this.examinerId = examinerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getTestCenter() {
        return testCenter;
    }

    public void setTestCenter(String testCenter) {
        this.testCenter = testCenter;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
