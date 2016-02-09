package com.example.prasadtumma.libraryprojecteight;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import me.james.biuedittext.BiuEditText;

public class MainActivity extends AppCompatActivity {

    private BiuEditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = (BiuEditText) findViewById(R.id.animated_edittext);

       /* new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                ((AnimatedTextView) findViewById(R.id.text)).setAnimatedText("Thanks for Watching. . . . .!");
            }
        }, 5000);*/
    }
}
