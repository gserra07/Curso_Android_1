package com.example.guillers.cursoandroid1;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText et1, et2;
    private TextView result_tv;
    private Button suma,resta,multi,divid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = findViewById(R.id.Number_1);
        et2 = findViewById(R.id.Number_2);
        suma = findViewById(R.id.btn_sum);
        resta = findViewById(R.id.btn_res);
        multi = findViewById(R.id.btn_mul);
        divid = findViewById(R.id.btn_div);
        result_tv= findViewById(R.id.tv_result);
    }

    public void sumar(View v){
        Integer uno= Integer.parseInt(et1.getText().toString());
        Integer dos = Integer.parseInt(et2.getText().toString());

        result_tv.setText(String.valueOf(uno+dos));
        keyboard();
    }

    public void restar(View v){
        Integer uno= Integer.parseInt(et1.getText().toString());
        Integer dos = Integer.parseInt(et2.getText().toString());

        result_tv.setText(String.valueOf(uno-dos));
        keyboard();
    }

    public void multiplicar(View v){
        Integer uno= Integer.parseInt(et1.getText().toString());
        Integer dos = Integer.parseInt(et2.getText().toString());

        result_tv.setText(String.valueOf(uno*dos));
        keyboard();
    }

    public void dividir(View v){
        Integer uno= Integer.parseInt(et1.getText().toString());
        Integer dos = Integer.parseInt(et2.getText().toString());

        result_tv.setText(String.valueOf(uno/dos));
        keyboard();
    }

    private void keyboard(){
        View view = this.getCurrentFocus();
        assert view != null;
        view.clearFocus();
        InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
        assert imm != null;
        imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
    }
}
