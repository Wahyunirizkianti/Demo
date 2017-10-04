package kiky.extrabundle.android.com.kikyapps;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    ImageView img;
    TextView nameTxt,posTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Intent i = getIntent();

        final String name = i.getExtras().getString("Name");
        final String pos = i.getExtras().getString("Position");
        final int image = i.getExtras().getInt("Image");




        //REFERENCE VIEWS FROM XML
        img = (ImageView) findViewById(R.id.playerImage);
        nameTxt = (TextView) findViewById(R.id.nameTxt);
        posTxt = (TextView) findViewById(R.id.posTxt);

        //ASSIGN DATA TO THOSE VIEWS
        img.setImageResource(image);
        nameTxt.setText(name);
        posTxt.setText(pos);


        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);


        }


    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (item.getItemId() == android.R.id.home);
        finish();
        return super.onOptionsItemSelected(item);

    }

}
