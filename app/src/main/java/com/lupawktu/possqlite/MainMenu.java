//package com.lupawktu.possqlite;
//
//import android.content.Intent;
//import android.os.Bundle;
//import androidx.annotation.Nullable;
//import androidx.appcompat.app.AppCompatActivity;
//import android.view.View;
//import android.widget.RelativeLayout;
//
//import com.lupawktu.possqlite.PublicMethod.SetDefaultStore;
//
///**
// * Created by Mind on 6/2/2017.
// */
//public class MainMenu extends AppCompatActivity implements View.OnClickListener {
//
//    RelativeLayout product;
//
//    RelativeLayout order;
//
//    RelativeLayout setting;
//
//    RelativeLayout report;
//
//    RelativeLayout member;
//
//    RelativeLayout other;
//
//    SetDefaultStore setDefaultStore;
//
//    @Override
//    protected void onCreate(@Nullable Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main_menu);
//        setDefaultStore = new SetDefaultStore(this);
//
//        getSupportActionBar().setTitle(setDefaultStore.getDefaultStore().get(SetDefaultStore.KEY_NAME));
//
//        product.setOnClickListener(this);
//        order.setOnClickListener(this);
//        setting.setOnClickListener(this);
//        report.setOnClickListener(this);
//        member.setOnClickListener(this);
//        other.setOnClickListener(this);
//    }
//
//    @Override
//    public void onClick(View view) {
//        switch (view.getId()){
//            case R.id.product :
//                Intent a1 = new Intent(MainMenu.this, ProductCategory.class);
//                startActivity(a1);
//                break;
//            case R.id.order :
//                break;
//            case R.id.setting :
//                break;
//            case R.id.report :
//                break;
//            case R.id.member :
//                break;
//            case R.id.other :
//                Intent a6 = new Intent(MainMenu.this, DisplayStore.class);
//                startActivity(a6);
//                break;
//        }
//    }
//}
