package com.example.Temp;

import com.example.Temp.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class TempConvert extends Activity {
	private EditText text;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        text=(EditText) findViewById(R.id.temp);
    }
    
    public void myClickHandler(View view)
    {
    	RadioButton celsiusButton;
    	RadioButton fahrenheitButton;
    	switch(view.getId())
    	{
    	case R.id.button1:
    		fahrenheitButton=(RadioButton) findViewById(R.id.radio1);
    		celsiusButton=(RadioButton) findViewById(R.id.radio0);
    		if(text.getText().length()==0)
    		{
    			Toast.makeText(this,"Please enter a number",Toast.LENGTH_LONG).show();
    			return;
    		}
    	float temperature=Float.parseFloat((text.getText().toString()));
    	if(celsiusButton.isChecked())
    		text.setText(String.valueOf(FtoC(temperature)));
    	else
    		text.setText(String.valueOf(CtoF(temperature)));
    	}
    	
    }
    public float CtoF(float num)
    {
    	return (float) (num*(9.0/5.0)+32);
    }
    public float FtoC(float num)
    {
    	return (float) ((num-32)*(5.0/9.0));
    }
}