package org.purdue.acm.sigapp.mortarboard;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.Toast;

public class Main extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        ImageView main = (ImageView) findViewById(R.id.icon);
        main.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Toast toast = Toast.makeText(getApplicationContext(), "Blah", Toast.LENGTH_SHORT);
				toast.show();
			}});
    }
}