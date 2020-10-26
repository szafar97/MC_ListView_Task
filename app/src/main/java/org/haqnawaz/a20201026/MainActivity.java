package org.haqnawaz.a20201026;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.myListView);

        final ArrayList<String> friendArrayList = new ArrayList<String>();

        friendArrayList.add("Abdullah");
        friendArrayList.add("Azhar");
        friendArrayList.add("Babar");
        friendArrayList.add("Mushtaq");
        friendArrayList.add("Musa");
        friendArrayList.add("Salman");
        friendArrayList.add("Zahid");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,friendArrayList );

        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Log.i("You clicked the name of", friendArrayList.get(i));

            }
        });


    }
}
