package edu.temple.helloworld;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
//import android.widget.Toast;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button;

        button =(Button)findViewById(R.id.btnYouHaveClicked);

        final TextView txtView = (TextView)findViewById(R.id.helloWorld);

        View.OnClickListener onClickListener = new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                //Toast.makeText(MainActivity.this,"You have clicked the button.", Toast.LENGTH_LONG).show();
                txtView.setText("YoOU have cLiCkeDD the buttoNN. Hullooo..");

            }
        };

        button.setOnClickListener(onClickListener);

    }
}
