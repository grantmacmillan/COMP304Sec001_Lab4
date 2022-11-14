package com.example.grantmacmillan_bencoombes_comp304sec001_lab4_ex1;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface AppDao {

    @Insert
    void insertApplicant(Applicant applicant);
    @Insert
    void insertTest(Test test);
    @Insert
    void insertExaminer(Examiner examiner);

    @Query("SELECT * FROM APPLICANT")
    public List<Applicant> getApplicants();
    @Query("SELECT * FROM TEST")
    public List<Test> getTests();
    @Query("SELECT * FROM EXAMINER")
    public List<Examiner> getExaminers();

    @Update(entity = Applicant.class)
    public void updateApplicant(Applicant applicant);
}
