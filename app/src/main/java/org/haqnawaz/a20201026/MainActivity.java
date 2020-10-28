package org.haqnawaz.a20201026;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> friendArrayList;
    ArrayAdapter<String> arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.myListView);

        friendArrayList = new ArrayList<String>();

        friendArrayList.add("Abdullah");
        friendArrayList.add("Azhar");
        friendArrayList.add("Babar");
        friendArrayList.add("Mushtaq");
        friendArrayList.add("Musa");
        friendArrayList.add("Salman");
        friendArrayList.add("Zahid");

        arrayAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,friendArrayList );

        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Log.i("You clicked the name of", friendArrayList.get(i));

            }
        });


    }

    public void addName(View view) {
        EditText nameElement = findViewById(R.id.personName);
        String name = nameElement.getText().toString();

        if (!name.equals(""))
            arrayAdapter.add(name);
        nameElement.setText("");
    }
}
