package id.ac.novan.project2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class regist extends AppCompatActivity {
Button login1,regista;
EditText ETuser,ETpass,ETe;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regist);
        regista=findViewById(R.id.regist);
        ETuser= findViewById(R.id.name);
        ETpass= findViewById(R.id.pass);
        ETe= findViewById(R.id.email);
        regista.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nama=ETuser.getText().toString();
                Intent intent = new Intent(regist.this,menu2.class);
                intent.putExtra("NAME",nama);
                startActivity(intent);
                finish();
            }
        });


      ETuser.addTextChangedListener(login);
        ETpass.addTextChangedListener(login);


    }
    private TextWatcher login =new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence charSequence, int start, int count, int after) {
        }

        @Override
        public void onTextChanged(CharSequence charSequence, int start, int count, int after) {
            String username = ETuser.getText().toString().trim();
            String passi = ETpass.getText().toString().trim();
            regista.setEnabled(!username.isEmpty()&& !passi.isEmpty());





        }

        @Override
        public void afterTextChanged(Editable s) {

        }




    };


    }
