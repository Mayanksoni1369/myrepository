package com.example.mysqldiary;




import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class Whatsnew  extends Activity {
	CheckBox accept;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_whatsnew);
		accept=(CheckBox)findViewById(R.id.checkBox1);
		
		accept.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View view) {
				int totalamount=0;
				StringBuilder result=new StringBuilder();
				result.append("Selected Items:");
				if(accept.isChecked()){
					Intent i=new Intent(Whatsnew.this,Signin.class);
				startActivity(i);	
				}
				
			
			}});
			
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
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
