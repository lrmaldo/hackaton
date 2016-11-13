package com.hackaton;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseException;
import com.google.firebase.database.DatabaseReference;
import com.hackaton.modelos.modelo_inicio;

import java.util.ArrayList;

/**
 * Created by Leo on 12/11/2016.
 */

public class FirebaseHelper {
    DatabaseReference db;
    Boolean saved=null;
    ArrayList<modelo_inicio> modelo =new ArrayList<>();

    public FirebaseHelper(DatabaseReference db) {
        this.db = db;
    }
    public Boolean save(modelo_inicio spacecraft)
    {
        if(spacecraft==null)
        {
            saved=false;
        }else
        {
            try
            {
                db.child("principal").push().setValue(spacecraft);
                saved=true;

            }catch (DatabaseException e)
            {
                e.printStackTrace();
                saved=false;
            }
        }

        return saved;
    }
    //IMPLEMENT FETCH DATA AND FILL ARRAYLIST
    private void fetchData(DataSnapshot dataSnapshot)
    {
        modelo.clear();

        for (DataSnapshot ds : dataSnapshot.getChildren())
        {
           modelo_inicio spacecraft=ds.getValue(modelo_inicio.class);
            modelo.add(spacecraft);
        }
    }
    //READ BY HOOKING ONTO DATABASE OPERATION CALLBACKS
    public ArrayList<modelo_inicio> retrieve() {
        db.addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(DataSnapshot dataSnapshot, String s) {
                fetchData(dataSnapshot);
            }

            @Override
            public void onChildChanged(DataSnapshot dataSnapshot, String s) {
                fetchData(dataSnapshot);

            }

            @Override
            public void onChildRemoved(DataSnapshot dataSnapshot) {

            }

            @Override
            public void onChildMoved(DataSnapshot dataSnapshot, String s) {

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        return modelo;
    }
}

