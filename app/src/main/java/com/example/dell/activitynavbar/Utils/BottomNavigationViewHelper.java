package com.example.dell.activitynavbar.Utils;


import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.util.Log;
import android.view.MenuItem;

import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;
import com.example.dell.activitynavbar.FavoritActivity;
import com.example.dell.activitynavbar.ActivitiesActivity;
import com.example.dell.activitynavbar.MainActivity;
import com.example.dell.activitynavbar.PrayTimeActivity;
import com.example.dell.activitynavbar.MoreActivity;
import com.example.dell.activitynavbar.R;


public class BottomNavigationViewHelper {

    private static final String TAG = "BottomNavigationViewHel";

    public static void setupBottomNavigationView(BottomNavigationViewEx bottomNavigationViewEx){
        Log.d(TAG, "setupBottomNavigationView: Setting up BottomNavigationView");
       // bottomNavigationViewEx.enableAnimation(false);
        bottomNavigationViewEx.enableItemShiftingMode(false);
        bottomNavigationViewEx.enableShiftingMode(false);

    }


    public static void enableNavigation(final Context context, BottomNavigationViewEx view){
        view.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){


                    case R.id.ic_more:
                        Intent intent5 = new Intent(context, MoreActivity.class);//ACTIVITY_NUM = 0
                        context.startActivity(intent5);
                        break;

                    case R.id.ic_praytime:
                        Intent intent4 = new Intent(context, PrayTimeActivity.class);//ACTIVITY_NUM = 1
                        context.startActivity(intent4);
                        break;

                    case R.id.ic_masijed:
                        Intent intent3 = new Intent(context, MainActivity.class);//ACTIVITY_NUM = 2
                        context.startActivity(intent3);
                        break;

                    case R.id.ic_activities:
                        Intent intent2  = new Intent(context, ActivitiesActivity.class);//ACTIVITY_NUM = 3
                        context.startActivity(intent2);
                        break;

                    case R.id.ic_favorit:
                        Intent intent1 = new Intent(context, FavoritActivity.class);//ACTIVITY_NUM = 4
                        context.startActivity(intent1);
                        break;








                }


                return false;
            }
        });
    }


}
