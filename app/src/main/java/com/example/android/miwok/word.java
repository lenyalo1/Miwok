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

        private String MiwokTranslation;

        public  word(String DefaultTranslation,String miwokTranslation){
            MiwokTranslation=miwokTranslation;
             mDefaultTranslation=DefaultTranslation;
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
            return MiwokTranslation;
        }
     }
