package browarczyk.tomasz.android.app4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    TextView textView_mes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        textView_mes = (TextView) findViewById( R.id.textView_mes);

        Intent intent = getIntent();
        if ( intent.hasExtra( "browarczyk.tomasz.android.app4.MESSAGE")){
            String str = intent.getStringExtra( "browarczyk.tomasz.android.app4.MESSAGE");
            textView_mes.setText( str);
        }
    }


    public void onCardViewClick(View v){
        Intent intent = new Intent( this, MainActivity.class);
        startActivity( intent);
    }

}
