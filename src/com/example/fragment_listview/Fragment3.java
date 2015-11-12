package com.example.fragment_listview;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class Fragment3 extends Fragment implements 
	OnItemSelectedListener, OnItemClickListener, OnItemLongClickListener{
	
	private ListView listView;
	private Activity activity;
	private ArrayList<String> mArrayList = new ArrayList<String>();
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.layout3, container,false);
		listView = (ListView) view.findViewById(R.id.listview);
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_expandable_list_item_1,getData());
		listView.setAdapter(adapter);
		listView.setOnItemClickListener(this);
		return view;
	}
	
	private ArrayList<String> getData() {
		mArrayList.add("测试数据1");
		mArrayList.add("测试数据2");
		mArrayList.add("测试数据3");
		mArrayList.add("测试数据3");
		return mArrayList;
	}

	@Override
	public void onAttach(Activity activity) {
		this.activity = activity;
		super.onAttach(activity);
	}
	
	@Override
	public boolean onItemLongClick(AdapterView<?> parent, View view,
			int position, long id) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public void onItemClick(AdapterView<?> parent, View view, int position,
			long id) {
		Toast.makeText(getActivity(), "你点击了" + position + "列", Toast.LENGTH_SHORT).show();
		
	}
	@Override
	public void onItemSelected(AdapterView<?> parent, View view, int position,
			long id) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void onNothingSelected(AdapterView<?> parent) {
		// TODO Auto-generated method stub
		
	}
}
