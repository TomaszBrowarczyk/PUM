package browarczyk.tomasz.android.app4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editText_login;
    EditText editText_password;
    Button button_submit;
    TextView textView_mes;

    String [] listaLoginow = { "ada", "ela", "olo"};
    String [] listaHasel = { "ada1", "ela1", "olo1"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText_login = (EditText) findViewById( R.id.editText_login);
        editText_password = (EditText) findViewById( R.id.editText_password);
        textView_mes = (TextView) findViewById( R.id.textView_mes);
        button_submit = (Button) findViewById( R.id.button_submit);
    }

    public void onButtonSubmitClick(View v){
        String giveLogin = editText_login.getText().toString();
        String givePassword = editText_password.getText().toString();

        textView_mes.setText( " ");

        boolean isLoginCorrect = false;
        for (int n=0; n<listaLoginow.length; n++){
            if(giveLogin.equals( listaLoginow[n])){
                isLoginCorrect = true;
                if ( givePassword.equals( listaHasel[n])){
                 //   textView_mes.setText( "OK");
                    Intent intent = new Intent( getApplicationContext(), Activity2.class);
                    //intent.putExtra( "browarczyk.tomasz.android.app4.MESSAGE", "Hello");
                    intent.putExtra( "browarczyk.tomasz.android.app4.MESSAGE", giveLogin);
                    startActivity( intent);


                }

                else {
                    textView_mes.setText("nieprawidłowe hasło.");
                //    break;

                }
            }
        }

        if ( ! isLoginCorrect) {
            textView_mes.setText("nie ma takiego hasła.");
        }
    }
}
