package com.example.mysqldiary;


//import your.package3.namespace.SqlCreateTableActivity;
import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;



public class Signin extends Activity  {
	SQLiteDatabase db;
	TextView t1,t2;
	EditText e1,e2;
	String uname,password;
	Button b1;

	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.signin);
		t1=(TextView)findViewById(R.id.textView1);
		t2=(TextView)findViewById(R.id.textView2);
		e1=(EditText)findViewById(R.id.editText1);
		e2=(EditText)findViewById(R.id.editText2);
		
		
		b1=(Button)findViewById(R.id.button1);
		
		b1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				// SQLiteDatabase db;
				uname=e1.getText().toString();
				password=e2.getText().toString();
				
				 DBUserAdapter dbUser = new DBUserAdapter(Signin.this);
				 dbUser.open(); 
				if(dbUser.Login(uname,password))
				{
					Toast.makeText(Signin.this, "login success ", Toast.LENGTH_LONG).show();
					Intent i1=new Intent(Signin.this,Source.class);
					startActivity(i1);
				}
				else
				{
					Toast.makeText(Signin.this, "Login Failed", Toast.LENGTH_LONG).show();
				}
			}
		});
		 
    }	
	
}	

