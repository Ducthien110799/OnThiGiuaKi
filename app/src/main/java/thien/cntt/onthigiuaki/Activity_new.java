package thien.cntt.onthigiuaki;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Activity_new extends AppCompatActivity {
    private TextView tvName;
    private TextView tvInfo;
    private TextView tvPrice;
    private ImageView imgV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);

        Intent intent= getIntent();
        Bundle bundle= getIntent().getExtras();

        String name =intent.getStringExtra("name");
        String shop =intent.getStringExtra("info");
        String price =intent.getStringExtra("price");
        int img = bundle.getInt("img");

        tvName= findViewById(R.id.tvNameInfo);
        tvInfo= findViewById(R.id.tvShopInfo);
        tvPrice=findViewById(R.id.tvPriceInfo);
        imgV=findViewById(R.id.imageView);


        tvName.setText(name);
        tvInfo.setText(shop);
        tvPrice.setText(price);
        imgV.setImageResource(img);

    }
}