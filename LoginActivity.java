package com.vale.mozart.vale;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


/**
 * A login screen that offers login via email/password.
 */
public class LoginActivity extends AppCompatActivity {

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        EditText mat = (EditText) findViewById(R.id.matricula);
        EditText senha = (EditText) findViewById((R.id.senha));


        Button button = (Button) findViewById(R.id.bt_login);

        //button.setOnClickListener(LoginBotao);

    }
    
    public void BotaoLogin(View v){
            Toast.makeText(LoginActivity.this, "Funcionou",
                    Toast.LENGTH_LONG).show();
    }   
    
    private View.OnClickListener LoginBotao = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Toast.makeText(LoginActivity.this, "Hello World",
                    Toast.LENGTH_LONG).show();

            Intent it = new Intent(LoginActivity.this, PrincipalActivity.class);
            startActivity(it);
        }
    };


}


/**button.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View v) {
Intent it = new Intent(LoginActivity.this, PrincipalActivity.class);
startActivity(it);
}
});
 */

