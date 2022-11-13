package com.example.grantmacmillan_bencoombes_comp304sec001_lab4_ex1;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Applicant {
    @PrimaryKey
    int applicantId;
    @ColumnInfo(name = "firstNameColumn")
    String firstName;
    @ColumnInfo(name = "lastNameColumn")
    String lastName;
    @ColumnInfo(name = "testCenterColumn")
    String testCenter;
    @ColumnInfo(name = "examinerIdColumn")
    int examinerId;

    public Applicant(int applicantId, String firstName, String lastName, String testCenter, int examinerId) {
        this.applicantId = applicantId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.testCenter = testCenter;
        this.examinerId = examinerId;
    }

    public int getApplicantId() {
        return applicantId;
    }

    public void setApplicantId(int applicantId) {
        this.applicantId = applicantId;
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

    public int getExaminerId() {
        return examinerId;
    }

    public void setExaminerId(int examinerId) {
        this.examinerId = examinerId;
    }
}
