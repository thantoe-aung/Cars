package com.example.cars;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.cars.Adapters.CarAdapter;
import com.example.cars.Delegates.CardItemClick;
import com.example.cars.Pojos.Car;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView carRecyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        carRecyclerView=findViewById(R.id.carRecyclerView);
        carRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        List<Car> carList=new ArrayList<>();
        Car car1=new Car("Chevorolet Spark","36","Economy","4","1","4",
                "chervolet","Apr 3, 12pm","Apr 6, 12pm","Non Airport");
        Car car2=new Car("Hyuandai Acent","40","Economy","5","1","2",
                "hyuandai","Apr 3, 12pm","Apr 6, 12pm","In Terminal");

        Car car3=new Car("Chevorolet Spark","36","Economy","4","1","4",
                "chervolet","Apr 3, 12pm","Apr 6, 12pm","Non Airport");

        carList.add(car1);
        carList.add(car2);
        carList.add(car3);

        CarAdapter adapter=new CarAdapter(getApplicationContext(), carList, new CardItemClick() {
            @Override
            public void onItemClick() {
                startActivity(new Intent(MainActivity.this,DetailActivity.class));
            }
        });
        carRecyclerView.setAdapter(adapter);
    }
}
