package com.example.appbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("SM | Action Bar");

        actionBar.setSubtitle("An Application project for creating AppBar");

        actionBar.setIcon(R.drawable.ic_app);

        actionBar.setDisplayUseLogoEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main,menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

       switch (item.getItemId()){

           case R.id.search:
               Toast.makeText(this, "Search Selected ", Toast.LENGTH_SHORT).show();
           case R.id.refresh:
               Toast.makeText(this, "Refresh Selected ", Toast.LENGTH_SHORT).show();
           case R.id.copy:
               Toast.makeText(this, "Copy Selected ", Toast.LENGTH_SHORT).show();
       }
        return super.onOptionsItemSelected(item);
    }
}

