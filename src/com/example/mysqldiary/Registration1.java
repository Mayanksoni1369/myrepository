package com.example.mysqldiary;



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class Registration1 extends Activity {
ImageButton ib1,ib2;
private int LENGTH_LONG;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_registration1);
		ImageButton ib1=(ImageButton)findViewById(R.id.imageButton1);
		ImageButton ib2=(ImageButton)findViewById(R.id.imageButton2);
		
	}

	public void Submit11(View v)
	{
		Toast.makeText(Registration1.this, "Registration confirmed successfully",LENGTH_LONG).show();
		Intent i=new Intent(Registration1.this,Signup.class);
		startActivity(i);
		
	}
	public void faq1(View v)
	{
		//Toast.makeText(Registration1.this, "Registration confirmed successfully",LENGTH_LONG).show();
		Intent i=new Intent(Registration1.this,Faq.class);
		startActivity(i);
		
	}

}
