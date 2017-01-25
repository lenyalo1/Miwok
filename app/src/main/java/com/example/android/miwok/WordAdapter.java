package com.example.android.miwok;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<word>{

    /** resource ID for the backround color for this list of words
     *
     */
    private int mColorResourceId;

    public WordAdapter(Activity context, ArrayList<word>words,int ColorResourceId){
        super(context,0,words);
        mColorResourceId=ColorResourceId;
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

        // Find the ImageView in the list_item.xml layout with the ID image.
        ImageView imageView=(ImageView) listItemView.findViewById(R.id.Image);

        if (currentWord.hasImage()){
            //Set the imageView to the iage resource specified in the current word
            imageView.setImageResource(currentWord.getImageresourceId());
            //make sure the set is visible
            imageView.setVisibility(View.VISIBLE);
        }
        else {
            //hides the imageView(set the visibility GONE).
           imageView.setVisibility(View.GONE);
        }
        //Set the theme color for the list item
        View textContainer=listItemView.findViewById(R.id.text_content);
        //find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        //Set the background color of the text container View
        textContainer.setBackgroundColor(color);
        //return the whole list item layout(containing 2 TextViews) so that it can be shown in the listView.
        return listItemView;
    }
}
