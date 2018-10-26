package com.example.a45570.helloworld;

        import android.graphics.Bitmap;
        import android.graphics.BitmapFactory;
        import android.support.v4.graphics.drawable.RoundedBitmapDrawable;
        import android.support.v4.graphics.drawable.RoundedBitmapDrawableFactory;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.widget.ArrayAdapter;
        import android.widget.ImageView;
        import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private String[] data = {
            "Apple",
            "Banana","Orange","Watermelon",
            "Pear","Grape","Pineapple",
            "Strawberry","Cherry","Mango"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.chowkp_square250);

        RoundedBitmapDrawable circleDrawable = RoundedBitmapDrawableFactory.create(getResources(), BitmapFactory.decodeResource(getResources(), R.drawable.chowkp_square250));
        circleDrawable.getPaint().setAntiAlias(true);
        circleDrawable.setCornerRadius(Math.max(bitmap.getWidth(), bitmap.getHeight()));
        ImageView image3 = (ImageView) findViewById(R.id.chowkp);
        image3.setImageDrawable(circleDrawable);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                MainActivity.this,   // Context上下文
                android.R.layout.simple_list_item_1,  // 子项布局id
                data);                                // 数据
        ListView listView = (ListView) findViewById(R.id.list_view);
        listView.setAdapter(adapter);

    }
}
