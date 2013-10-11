package com.example.tp_hw1_android;
	
import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends Activity {

	TextView left, right;
	String text;
	
	    @Override
	    protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.second_activity);
	        left = (TextView) findViewById(R.id.leftTextBlock);
	        right = (TextView) findViewById(R.id.rightTextBlock);
	        text = getIntent().getStringExtra("text");
	        if(text.isEmpty()) {
	        	text="Нет текста";
	        	left.setText(text);
		        right.setText(text);
	        } else {
	        	int mid = Math.round(text.length() / 2);
	        	left.setText(text.substring(0, mid));
	        	right.setText(text.substring(mid));
	        }
	    }
}
