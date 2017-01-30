package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


    /** represent vocabulary word that the user wants to learn
     *It contains a default translation and a miwok translation for the word.
     */
    public class word {

    /** default translation for the word*/

        private String mDefaultTranslation;

        /** Miwok translation for the word */

        private String mMiwokTranslation;

        /** imageResourceId for the word*/
        private int mImageResourceID =NO_IMAGE_PROVIDED;
        private  static final int NO_IMAGE_PROVIDED =-1;
        private int mAudioResourceID;

        /**
         *
         * @param DefaultTranslation is the word in a language
         * @param miwokTranslation is the word in the miwok language
         *
         */

        public  word(String DefaultTranslation,String miwokTranslation,int audioResourceID){
           mDefaultTranslation=DefaultTranslation;
            mMiwokTranslation=miwokTranslation;
            mAudioResourceID=audioResourceID;

    }
        /**
         *
         * @param DefaultTranslation is the word in a language
         * @param miwokTranslation is the word in the miwok language
         *@param  imageResourceId is the drawable resource Id for the image associated with the word
         *
         */

        public  word(String DefaultTranslation,String miwokTranslation,int imageResourceId, int audioResourceID){
            mDefaultTranslation=DefaultTranslation;
            mMiwokTranslation=miwokTranslation;
            mImageResourceID=imageResourceId;
            mAudioResourceID=audioResourceID;

        }


        /**
         *Get the default translation of the word.
         */
        public  String getmDefaultTranslation(){
            return mDefaultTranslation;
        }
        /**
         * Get the miwok translation of the word
         */
        public String getMiwokTranslation(){
            return mMiwokTranslation;
        }

        /**
         * get the ImageResourceId  of the word
         */
        public   int getImageresourceId (){
           return mImageResourceID;
        }

        /** Return whether or not there is an image for this word.
         */
        public  boolean hasImage(){
            return mImageResourceID!=NO_IMAGE_PROVIDED;


        }
        // Return the audio resource ID of the word
        public int getAudioResourceId()
        {
            return mAudioResourceID;
        }
    }
