package com.example.ListViewEx;

import java.util.ArrayList;

import com.example.androidex2.R;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
 
import android.widget.TextView;


public class ItemListBaseAdapter extends BaseAdapter   
{
private static ArrayList<ItemDetails> itemDetailsrrayList;

  
private LayoutInflater l_Inflater;

public ItemListBaseAdapter(Context context, ArrayList<ItemDetails> results) {
 itemDetailsrrayList = results;
 
 l_Inflater = LayoutInflater.from(context);
 
  
}

public int getCount() {
 return itemDetailsrrayList.size();
}

public Object getItem(int position) {
 return itemDetailsrrayList.get(position);
}

public long getItemId(int position) {
 return position;
}

public View getView(final int position, View convertView, ViewGroup parent) {
 ViewHolder holder;
 if (convertView == null) {
  convertView = l_Inflater.inflate(R.layout.item_select, null);
  holder = new ViewHolder();
  holder.txt_itemName = (TextView) convertView.findViewById(R.id.name);
  holder.btdDone = (Button)convertView.findViewById(R.id.btnDone);
  convertView.setTag(holder);
  
 } else {
  holder = (ViewHolder) convertView.getTag();
 }
  
 holder.txt_itemName.setText(itemDetailsrrayList.get(position).getItemDescription());
 

 	holder.btdDone.setOnClickListener(new OnClickListener() {
 		
 		
        public void onClick(View v) {
           
        	itemDetailsrrayList.remove(position);
        	 notifyDataSetChanged();
        }
    });
 		
 		
 	 
 
 
 
 
 
 return convertView;
}

static class ViewHolder {
 TextView txt_itemName;
 Button btdDone;
}
}
