package app.example.icas.integratedconcussionassessmentsystem;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

public class LoginActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    Spinner spinner;
    ArrayAdapter  adapter;
    private dbHelper db;
    private ArrayList<String> users;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_login);

        db = new dbHelper(this);
        users = db.getUsers();

        //Find User Options array from String resources (To be removed when Database is created)
        adapter = ArrayAdapter.createFromResource(this,R.array.User_Options,android.R.layout.simple_spinner_item);

        spinner = (Spinner) findViewById(R.id.spinner);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(LoginActivity.this);

        final ImageButton LoadProfile = (ImageButton) findViewById(R.id.loadprofile);
        LoadProfile.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(LoginActivity.this,Homescreen.class);
                startActivity(intent);
            }
        });

    }

     @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id){
         TextView spinnertext = (TextView) view;

     }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
