package com.example.cars.Adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.cars.Delegates.CardItemClick;
import com.example.cars.Pojos.Car;
import com.example.cars.R;
import com.squareup.picasso.Picasso;

import java.util.List;

public class CarAdapter extends  RecyclerView.Adapter<CarAdapter.CarViewHolder> {
    Context context;
    List<Car> carList;
    CardItemClick itemClick;
    public CarAdapter(Context context, List<Car> carList,CardItemClick itemClick) {
        this.context = context;
        this.carList = carList;
        this.itemClick=itemClick;
    }

    @NonNull
    @Override
    public CarViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.car_item_layout,null);
        return new CarViewHolder(view,itemClick);
    }

    @Override
    public void onBindViewHolder(@NonNull CarViewHolder carViewHolder, int i) {
        Car car=carList.get(i);
        carViewHolder.txtPrice.setText("C$"+car.getPrice());
        carViewHolder.txtType.setText(car.getType());
        carViewHolder.txtCarName.setText(car.getName());
        carViewHolder.numOfPeople.setText(car.getNumOfPeople());
        carViewHolder.numOfCard.setText(car.getNumOfCard());
        carViewHolder.numOfWindow.setText(car.getNumOfWindow());
        carViewHolder.pickupDate.setText(car.getPickupDate());
        carViewHolder.dropOffDate.setText(car.getDropOffDate());
        carViewHolder.txtPickup.setText("Pick-up");
        carViewHolder.txtDropOff.setText("Drop-off");
        carViewHolder.txtCondition.setText(car.getCondition());

        Picasso.with(context).load(car.getImageResource(context)).into(carViewHolder.carImage);

    }

    @Override
    public int getItemCount() {
        return carList.size();
    }

    public class CarViewHolder extends RecyclerView.ViewHolder{
        TextView txtPrice,txtType,txtCarName;
        TextView numOfPeople,numOfCard,numOfWindow;
        TextView pickupDate,dropOffDate,txtPickup,txtDropOff,txtCondition;
        ImageView carImage;

        public CarViewHolder(@NonNull View itemView, final CardItemClick itemClick) {
            super(itemView);

            txtPrice=itemView.findViewById(R.id.carPrice);
            txtType=itemView.findViewById(R.id.carType);
            txtCarName=itemView.findViewById(R.id.carName);
            numOfPeople=itemView.findViewById(R.id.numofPeople);
            numOfCard=itemView.findViewById(R.id.numofCard);
            numOfWindow=itemView.findViewById(R.id.numofDoor);

            pickupDate=itemView.findViewById(R.id.pickupDate);
            dropOffDate=itemView.findViewById(R.id.dropOffDate);
            txtPickup=itemView.findViewById(R.id.pickup);
            txtDropOff=itemView.findViewById(R.id.dropoff);
            txtCondition=itemView.findViewById(R.id.txtcondition);

            carImage=itemView.findViewById(R.id.carImageView);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    itemClick.onItemClick();
                }
            });
        }
    }
}
