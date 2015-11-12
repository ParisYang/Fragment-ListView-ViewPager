package com.example.fragment_listview;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends FragmentActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		List<Fragment> fragments=new ArrayList<Fragment>();  
        fragments.add(new Fragment1());  
        fragments.add(new Fragment2());  
        fragments.add(new Fragment3());   
        FragAdapter adapter = new FragAdapter(getSupportFragmentManager(), fragments);
        
        ViewPager vp = (ViewPager)findViewById(R.id.myviewpager);  
        vp.setAdapter(adapter);  
	}

	
}
