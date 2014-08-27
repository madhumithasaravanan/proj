package com.example.sampleproject;

import java.util.ArrayList;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.os.Build;

public class SubActivity extends Activity {
TextView t;
EditText ed;
Button b;	
String name;
ArrayList <Employee> e1=new ArrayList <Employee>();
//String emp;
@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_sub);
TextView t=(TextView) findViewById(R.id.textView1);
ed=(EditText) findViewById(R.id.editText1);
b=(Button) findViewById(R.id.button1);
b.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		Intent i=new Intent(SubActivity.this, MainActivity.class);
		startActivity(i);
		
		name=ed.getText().toString();
	
		for(int j=0;j<e1.size();j++)
		{
			ArrayList	<Employee> em=new ArrayList <Employee>();
		Employee emp = em.get(j);
			if(emp.getname()==name)
			{
				emp.getdesignation();
			}
		
		
		
   
}

	}

});
}
}
