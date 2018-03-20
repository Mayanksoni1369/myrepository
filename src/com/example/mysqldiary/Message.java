package com.example.mysqldiary;




import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Message extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_message);
		
		
		final EditText edittextSmsNumber = (EditText)findViewById(R.id.smsnumber);
	       final EditText edittextSmsText = (EditText)findViewById(R.id.smstext);
	      
	       Button buttonSendSms_intent = (Button)findViewById(R.id.sendsms_intent);
		      
	       //By SmsManager API
	       
		 
		      
		   //By Intent Action
		   
		   buttonSendSms_intent.setOnClickListener(new Button.OnClickListener(){

		   @Override
		   public void onClick(View arg0) {
		    // TODO Auto-generated method stub

		    String smsNumber = edittextSmsNumber.getText().toString();
		    String smsText = edittextSmsText.getText().toString();
		    
		    Uri uri = Uri.parse("smsto:" + smsNumber);
		    Intent intent = new Intent(Intent.ACTION_SENDTO, uri);
		    intent.putExtra("sms_body", smsText);  
		    startActivity(intent);
		   }});
		
	}

	
	

}
