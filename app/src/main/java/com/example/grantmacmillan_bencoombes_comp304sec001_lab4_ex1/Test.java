package com.example.grantmacmillan_bencoombes_comp304sec001_lab4_ex1;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Test {
    @PrimaryKey
    int testId;
    @ColumnInfo(name = "applicantIdColumn")
    int applicantId;
    @ColumnInfo(name = "examinerIdColumn")
    int examinerId;
    @ColumnInfo(name = "testResultColumn")
    String testResult;
    @ColumnInfo(name = "testDateColumn")
    String testDate;
    @ColumnInfo(name = "testRouteColumn")
    String testRoute;
    @ColumnInfo(name = "testTypeColumn")
    String testType;

    public Test(int testId, int applicantId, int examinerId, String testResult, String testDate, String testRoute, String testType) {
        this.testId = testId;
        this.applicantId = applicantId;
        this.examinerId = examinerId;
        this.testResult = testResult;
        this.testDate = testDate;
        this.testRoute = testRoute;
        this.testType = testType;
    }

    public int getTestId() {
        return testId;
    }

    public void setTestId(int testId) {
        this.testId = testId;
    }

    public int getApplicantId() {
        return applicantId;
    }

    public void setApplicantId(int applicantId) {
        this.applicantId = applicantId;
    }

    public int getExaminerId() {
        return examinerId;
    }

    public void setExaminerId(int examinerId) {
        this.examinerId = examinerId;
    }

    public String getTestResult() {
        return testResult;
    }

    public void setTestResult(String testResult) {
        this.testResult = testResult;
    }

    public String getTestDate() {
        return testDate;
    }

    public void setTestDate(String testDate) {
        this.testDate = testDate;
    }

    public String getTestRoute() {
        return testRoute;
    }

    public void setTestRoute(String testRoute) {
        this.testRoute = testRoute;
    }

    public String getTestType() {
        return testType;
    }

    public void setTestType(String testType) {
        this.testType = testType;
    }
}
