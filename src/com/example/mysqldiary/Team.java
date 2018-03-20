package com.example.mysqldiary;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class Team extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_team);
		Button bt1=(Button)findViewById(R.id.button1);
		
		Button bt2=(Button)findViewById(R.id.button2);
		Button bt3=(Button)findViewById(R.id.button3);
		Button bt4=(Button)findViewById(R.id.button4);
	}
public void driver(View v)
{
Intent i=new Intent(Team.this,Registration1.class);	
startActivity(i);

}
public void on(View v)
{
Intent i=new Intent(Team.this,New.class);	
startActivity(i);

}

public void rider(View v)
{
Intent i=new Intent(Team.this,MainActivity.class);	
startActivity(i);

}
public void db(View v)
{
Intent i=new Intent(Team.this,Database.class);	
startActivity(i);

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
