package com.example.anipal.new_ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class first_aid extends AppCompatActivity implements View.OnClickListener {
    private CardView drown,elec,open,burns;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_aid);
        drown = (CardView)findViewById(R.id.Drowning);
        elec = (CardView)findViewById(R.id.elec);
        open = (CardView)findViewById(R.id.open_wounds);
        burns = (CardView)findViewById(R.id.Burns);
        drown.setOnClickListener(this);
        elec.setOnClickListener(this);
        open.setOnClickListener(this);
        burns.setOnClickListener(this);
    }
    @Override
    public void onClick(View v)
    {
        Intent i;
        switch (v.getId()) {
            case R.id.Drowning:i = (new Intent(this,drown.class));startActivity(i);break;
            case R.id.elec:i = (new Intent(this,elec.class));startActivity(i);break;
            case R.id.open_wounds:i = (new Intent(this,open.class));startActivity(i);break;
            case R.id.Burns:i = (new Intent(this,burns.class));startActivity(i);break;
            default:break;



        }
    }
}
