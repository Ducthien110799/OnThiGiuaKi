package thien.cntt.onthigiuaki;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    private RecyclerView recyclerView;
    private DonusListAdapter donusListAdapter;
    private ArrayList<Donut> donutArrayList;
    private Button btnSearch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=findViewById(R.id.rcvDonus);
        btnSearch=findViewById(R.id.btnSearch);

        donutArrayList= new ArrayList<>();
        donutArrayList.add(new Donut("BÁNH MOUSSE ĐÀO","Một sự sáng tạo mới mẻ","29,000"+"VNĐ", R.drawable.b1));
        donutArrayList.add(new Donut("BÁNH PHÔ MAI CÀ PHÊ","Ngon khó cưỡng","29,000"+"VNĐ", R.drawable.b5));
        donutArrayList.add(new Donut("BÁNH CARAMEL PHÔ MAI","Bánh phô mai thơm béo","29,000"+"VNĐ", R.drawable.b1));
        donutArrayList.add(new Donut("BÁNH PHÔ MAI CHANH DÂY","caramel ngọt ngào","29,000"+"VNĐ", R.drawable.b5));
        donutArrayList.add(new Donut("BÁNH PHÔ MAI TRÀ XANH","được phủ thêm một lớp sô cô la mỏng","29,000"+"VNĐ", R.drawable.b5));
        donusListAdapter = new DonusListAdapter(this, donutArrayList);
        recyclerView.setAdapter(donusListAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}