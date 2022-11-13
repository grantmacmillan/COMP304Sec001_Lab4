package com.example.grantmacmillan_bencoombes_comp304sec001_lab4_ex1;

import androidx.room.Dao;
import androidx.room.Insert;

@Dao
public interface AppDao {

    @Insert
    void insertApplicant(Applicant applicant);
    @Insert
    void insertTest(Test test);
    @Insert
    void insertExaminer(Examiner examiner);
}
