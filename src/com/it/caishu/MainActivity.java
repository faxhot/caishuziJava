package com.it.caishu;

import java.util.Random;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	int rand;

	/**
	 * 开始游戏
	 * 
	 * @param view
	 */
	public void begin(View view) {
		
		EditText num1ET = (EditText) findViewById(R.id.num1_et);
		EditText num2ET = (EditText) findViewById(R.id.num2_et);

		
		
		int num1 = Integer.parseInt(num1ET.getText().toString());
		int num2 = Integer.parseInt(num2ET.getText().toString());

		if ( num2 <= num1) {
			Toast.makeText(this, "第一个数字应该小于第二个数字", 1).show();
		} else {
			rand = new Random().nextInt(num2 - num1) + num1;
			System.out.println(rand);
		}
	}

	/**
	 * 比较大小
	 * 
	 * @param view
	 */
	public void submit(View view) {
		EditText num3ET = (EditText) findViewById(R.id.num3_et);
		int num3 = Integer.parseInt(num3ET.getText().toString());
		if (num3 == rand) {
			Toast.makeText(this, "恭喜你猜对了", 1).show();
		} else if (num3 < rand) {
			Toast.makeText(this, "你猜的小了", 1).show();
		} else {
			Toast.makeText(this, "你猜的大了", 1).show();
		}
	}
}
