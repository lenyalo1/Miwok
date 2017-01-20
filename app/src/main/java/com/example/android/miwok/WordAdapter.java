package com.example.android.miwok;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<word>{

    public WordAdapter(Activity context, ArrayList<word>words){
        super(context,0,words);
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        //check if an existing view is being reused,otherwise inflate the view
        View listItemView=convertView;
        if (listItemView==null){
            listItemView= LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
        }

        //get the link {@link word} object located at this position in the list

        word currentWord =getItem(position);
        //find the textView in the list_item.xml layout with the ID miwok_text_view.
        TextView miwokTextView =(TextView)listItemView.findViewById(R.id.miwok_text_view);
        //Get the miwok Translation from the current object and set this text on the miwok TextView
        miwokTextView.setText(currentWord.getMiwokTranslation());
        //find the TextView in the list_item.xl layout with the ID default_text_view.
        TextView defaultTextView =(TextView)listItemView.findViewById(R.id.default_text_view);
        //Get the default Translation from the current object and set this text on the miwok TextView
        defaultTextView.setText(currentWord.getmDefaultTranslation());
        //return the whole list item layout (containing 2TextViews) so that it can beshown in the listView.

        return listItemView;
    }
}
