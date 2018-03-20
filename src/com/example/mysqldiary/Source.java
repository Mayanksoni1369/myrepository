package com.example.mysqldiary;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.MultiAutoCompleteTextView;

public class Source extends Activity {
	  AutoCompleteTextView multi,multi2;
	  Button bt1,bt2;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_source);
		
		bt1=(Button)findViewById(R.id.button1);
		bt2=(Button)findViewById(R.id.button2);
		String[] texts = {"Rajasthan Universiy","Kukas","Rajapark","jahawarlal circle","Badi chopar","choti chopar","Railway station","sindhi camp","world trade park","triton mall","jhotwara","amer fort","city pulse","ajmeri gate","Rambagh circle","Albert hall","Nhahargarh zoological park","rajputana hotel","polpvictory","vishal mega mart","india gate","laalkhoti","thonk phatak","Big bazzar","chaksu","haldi ghati gate","zoo","achrol","chandpole"};
        multi = (AutoCompleteTextView) findViewById(R.id.multiAutoCompleteTextView1);
        multi2 = (AutoCompleteTextView) findViewById(R.id.multiAutoCompleteTextView2);
        ArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,texts);
         multi.setAdapter(adapter);
      //   multi.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());
         multi.setThreshold(1);
         multi2.setAdapter(adapter);
        // multi2.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());
         multi2.setThreshold(1);
	}

	public void tat(View v)
	{
		Intent i=new Intent(Source.this,Ride.class);
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
