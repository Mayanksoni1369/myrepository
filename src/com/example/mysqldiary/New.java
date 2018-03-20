package com.example.mysqldiary;





import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class New extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_new);
		
		
	}
	public void msg(View v)
    {
		    	Intent i= new Intent(New.this,Message.class);
   startActivity(i);
    }
 
 public void mail(View v)
    {
    	Intent i= new Intent(New.this,Feedback.class);
    
		
    	startActivity(i);
    }
 public void makeacall(View v)
    {
    	Intent callintent= new Intent(Intent.ACTION_CALL);
    
		callintent.setData(Uri.parse("tel:8385863717"));
    	startActivity(callintent);
    }


	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.registration1, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		 switch (item.getItemId()) {
         case R.id.item1:
         {	
        	 Intent i=new Intent(New.this,Home.class);
         	startActivity(i); 
         	}
        return true;   
           default:
             return super.onOptionsItemSelected(item);
     }
}
}