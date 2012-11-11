package com.example.ListViewEx;

import java.util.ArrayList;

import com.example.androidex2.R;

import android.os.Bundle;
import android.app.ListActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main extends  ListActivity implements View.OnClickListener
 
{
	 ArrayList<ItemDetails> Array_item_details;
	 ItemListBaseAdapter adapter;
	 Button Addbtn;
	 EditText Add_text;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        Array_item_details = GetSearchResults();
        
        Addbtn  = (Button) findViewById(R.id.btnAdd);
        
        Add_text=(EditText)findViewById(R.id.txtItem);
       
        Addbtn.setOnClickListener(this);
       
        adapter=new ItemListBaseAdapter(this, Array_item_details);
        
        setListAdapter(adapter);	 
    }
 

	private ArrayList<ItemDetails> GetSearchResults() {
		
		ArrayList<ItemDetails> results = new ArrayList<ItemDetails>();
		
		ItemDetails item_details = new ItemDetails();
		
		
		item_details = new ItemDetails();
		
		item_details.setItemDescription("Try The Add Button");
		results.add(item_details);
		
		
		item_details = new ItemDetails();
		
		item_details.setItemDescription("Try The Done Button");
		results.add(item_details);
		
		item_details = new ItemDetails();
		
		item_details.setItemDescription("Find A Job");
		results.add(item_details);
		
		item_details = new ItemDetails();
		
		item_details.setItemDescription("Take The Dog Out");
		results.add(item_details);
		
		
		 item_details = new ItemDetails();
		
		 item_details.setItemDescription("Buy Food");
		results.add(item_details);
		
		 item_details = new ItemDetails();
			
		item_details.setItemDescription("Call Amanon");
		results.add(item_details);
		
		 item_details = new ItemDetails();
			
		item_details.setItemDescription("Take a vacation");
		results.add(item_details);
		
		return results;
	 
	}
	
	public void onClick(View view) {
 
		if(Add_text.getText().toString().trim().length() > 0)
		{
			
		String getText = Add_text.getText().toString();
		ItemDetails new_item_details = new ItemDetails();
		new_item_details .setItemDescription(getText);
		Array_item_details.add(new_item_details );
		Add_text.setText("");
		adapter.notifyDataSetChanged();
	 
		}
	}
}
 

 
