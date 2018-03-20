package com.example.mysqldiary;




import android.app.TabActivity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;


@SuppressWarnings("deprecation")
public class MainActivity extends TabActivity {
	Resources ressources;
	TabHost tabHost;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ressources = getResources(); 
		tabHost = getTabHost(); 
		// Signup tab
				Intent intentSignup = new Intent().setClass(this,Signup.class);
				TabSpec tabSpecSignup = tabHost
					.newTabSpec("Signup")
					.setIndicator("Sign Up")
					.setContent(intentSignup);
				
		//Sign tab		
				Intent intentSignin = new Intent().setClass(this,Signin.class);
				TabSpec tabSpecSignin = tabHost
					.newTabSpec("Signin")
					.setIndicator("Sign In")
					.setContent(intentSignin);
				
				

				// add all tabs 
				tabHost.addTab(tabSpecSignup);
				tabHost.addTab(tabSpecSignin);
				//set Windows tab as default (zero based)
				tabHost.setCurrentTab(0);
       
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
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
