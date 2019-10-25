package com.example.snackbar;

import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView imageView;
    CoordinatorLayout coordinatorLayout;
    int i=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        coordinatorLayout = (CoordinatorLayout)findViewById(R.id.cLayout);
        imageView = (ImageView)findViewById(R.id.imageView);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar snackbar = Snackbar.make(v,"hello",Snackbar.LENGTH_LONG);
                snackbar.setAction("Change",new snackbarListener());
                snackbar.show();

            }
        });
    }
    public class snackbarListener implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            if(i==0){
                imageView.setImageResource(R.drawable.khanapic);
                i=1;
            }
            else if(i==1){
                imageView.setImageResource(R.drawable.b2);
                i=0;
            }

        }
    }
}
