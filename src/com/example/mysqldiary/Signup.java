package com.example.mysqldiary;

//import your.package3.namespace.SqlCreateTableActivity;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Signup extends Activity {
TextView t1,t2,t3;
EditText e1,e2,e3;
Button b;

String uname, pass,repass;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.signup);
		
		t1=(TextView)findViewById(R.id.textView1);
		t2=(TextView)findViewById(R.id.textView2);
		t3=(TextView)findViewById(R.id.textView3);
		
		e1=(EditText)findViewById(R.id.editText1);
		e2=(EditText)findViewById(R.id.editText2);
		e3=(EditText)findViewById(R.id.editText3);
		b=(Button)findViewById(R.id.button1);
		
		 
		 repass = e3.getText().toString();
		
		b.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
		
	//		Toast.makeText(Signup.this, "aaaa ", Toast.LENGTH_LONG).show();
		// SQLiteDatabase db;
		 DBUserAdapter dbUser = new DBUserAdapter(Signup.this);
		 dbUser.open(); 
		 uname = e1.getText().toString();
		 pass = e2.getText().toString();
        long k= dbUser.AddUser(uname,pass);
	
        Toast.makeText(Signup.this, "Record Inserted "+k+ " of "+ uname + ", "+ pass, Toast.LENGTH_LONG).show();
       
        Intent i=new Intent(Signup.this,Whatsnew.class);
        startActivity(i);
	  }
	});
	}



 
   }


