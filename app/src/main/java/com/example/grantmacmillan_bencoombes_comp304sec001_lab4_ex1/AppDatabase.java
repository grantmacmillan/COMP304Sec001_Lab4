package com.example.grantmacmillan_bencoombes_comp304sec001_lab4_ex1;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database( entities = {Applicant.class, Test.class, Examiner.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract AppDao appDao();
}
