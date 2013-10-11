package com.example.tp_hw1_android;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {
	
	EditText editText1;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	public void SecondAct(View view)
	{
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        EditText mainEdit  = (EditText)findViewById(R.id.DialogEditText);
		String sText = mainEdit.getText().toString();
        intent.putExtra("text", sText);
        startActivity(intent);
	}
	
	public void ThirdAct(View view)
	{
        Intent intent = new Intent(MainActivity.this, ThirdActivity.class);
        startActivity(intent);
	}
	
	public void FourthAct(View view)
	{
        Intent intent = new Intent(MainActivity.this, FourthActivity.class);
        startActivity(intent);
	}
	
	public void Dialog(View view){
		editText1 = (EditText) findViewById(R.id.DialogEditText);
		final EditText input = new EditText(this);
		new AlertDialog.Builder(this)
	                   .setTitle("Enter some text")
	                   .setView(input)
	                   .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
	                       public void onClick(DialogInterface dialog, int whichButton) {
	                           Editable value = input.getText();
	                           editText1.setText(value);
	                       }
	                   })
	                   .setNegativeButton("Cancel", null)
	                   .show();
	}

}
