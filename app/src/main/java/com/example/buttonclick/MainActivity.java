package com.example.buttonclick;

import android.os.Bundle;
import android.view.View;
//import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //ボタン
//        Button button = findViewById(R.id.button);
//        ButtonClickListener listener = new ButtonClickListener();
//        button.setOnClickListener(listener);

        //画像ボタン
        ImageButton imageButton = findViewById(R.id.imageButton);
        ButtonClickListener listener = new ButtonClickListener();
        imageButton.setOnClickListener(listener);

    }

    //ボタンが押されたときの処理
    //OnClickListenerを実装
    public class ButtonClickListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {

            //１～６の数値をランダムで
            Random random = new Random();
            int randomNum = random.nextInt(7);
            String strNum = String.valueOf(randomNum);

            //画像配置
            ImageView outputImg = (ImageView) findViewById(R.id.imageView);
            //数値を出力
            //TextView output = findViewById(R.id.textView);
            DiceTextView output = findViewById(R.id.textView);

            //数値で分岐
            switch (strNum) {
                case "0":
                    output.setText(strNum);
                    outputImg.setImageResource(R.drawable.number_kanji18_rei);
                    break;
                case "1":
                    output.setText(strNum);
                    outputImg.setImageResource(R.drawable.number_kanji01);
                    break;
                case "2":
                    output.setText(strNum);
                    outputImg.setImageResource(R.drawable.number_kanji02);
                    break;
                case "3":
                    output.setText(strNum);
                    outputImg.setImageResource(R.drawable.number_kanji03);
                    break;
                case "4":
                    output.setText(strNum);
                    outputImg.setImageResource(R.drawable.number_kanji04);
                    break;
                case "5":
                    output.setText(strNum);
                    outputImg.setImageResource(R.drawable.number_kanji05);
                    break;
                case "6":
                    output.setText(strNum);
                    outputImg.setImageResource(R.drawable.number_kanji06);
                    break;
            }
        }
    }
}
