package com.example.swarupa.assignment44;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    GridView gridView;
    String [] web = {
            "GingerBread",
            "HoneyComb",
            "IceCream",
            "JellyBean",
            "KitKat",
            "Lollipop"
    };
    int[] imageId ={R.drawable.pic,
                    R.drawable.pic1,
                    R.drawable.pic5,
                    R.drawable.pic2,
                    R.drawable.pic4,
                    R.drawable.pic3};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CustomeGrid adapter = new CustomeGrid(MainActivity.this, web,imageId);
        gridView = (GridView)findViewById(R.id.grid);
        gridView.setAdapter(adapter);

    }
}
