package com.example.sqliteapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.os.Bundle;
import android.preference.EditTextPreference;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button insert,update,delete,view;
    EditText name,contact,dob;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = findViewById(R.id.editText1);
        contact =findViewById(R.id.editText2);
        dob = findViewById(R.id.editText3);
        insert = findViewById(R.id.btninsert);
        update = findViewById(R.id.btnupdate);
        delete = findViewById(R.id.btndelete);
        view = findViewById(R.id.btnview);

        DBHelper DB = new DBHelper(this);

        insert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String nameTXT = name.getText().toString();
                String contactTXT = contact.getText().toString();
                String dobTXT = dob.getText().toString();

                Boolean checkinsertdata = DB.insertuserdata(nameTXT,contactTXT,dobTXT);
                if (checkinsertdata ==true)
                    Toast.makeText(MainActivity.this, "New Entry Inserted ", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(MainActivity.this, "New Entry Not Inserted", Toast.LENGTH_SHORT).show();

            }
        });


        update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                String nameTXT = name.getText().toString();
                String contactTXT = contact.getText().toString();
                String dobTXT = dob.getText().toString();

                Boolean checkupdatedata = DB.updateuserdata(nameTXT,contactTXT,dobTXT);
                if (checkupdatedata ==true)
                    Toast.makeText(MainActivity.this, "Entry Updated", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(MainActivity.this, "Entry Not Updated", Toast.LENGTH_SHORT).show();


            }
        });


        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String nameTXT = name.getText().toString();
                Boolean checkdeletedata = DB.deleteuserdata(nameTXT);
                if (checkdeletedata ==true)
                    Toast.makeText(MainActivity.this, "Entry Deleted", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(MainActivity.this, "Entry Not Deleted", Toast.LENGTH_SHORT).show();

            }
        });

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Cursor res = DB.getdata();
                if (res.getCount() == 0){
                    Toast.makeText(MainActivity.this, "No Entry Exists", Toast.LENGTH_SHORT).show();
                    return;
                }

                StringBuffer buffer = new StringBuffer();
                while(res.moveToNext()){
                    buffer.append("Name :"+res.getString(0)+"\n");
                    buffer.append("Contact :"+res.getString(1)+"\n");
                    buffer.append("Date of Brith : "+res.getString(2)+"\n\n");

                }

                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setCancelable(true);
                builder.setTitle("User Entries");
                builder.setMessage(buffer.toString());
                builder.show();

            }
        });

    }
}