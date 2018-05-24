package team5.moco.forumnavi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startMapActivity(View view){
        Intent intent = new Intent(this, MapActivity.class);
        startActivity(intent);
    }

    public void startShopActivity(View view){
        Intent intent = new Intent(this, ShopActivity.class);
        startActivity(intent);
    }

    public void startEventActivity(View view){
        Intent intent = new Intent(this, EventActivity.class);
        startActivity(intent);
    }
    //#neuland
}
