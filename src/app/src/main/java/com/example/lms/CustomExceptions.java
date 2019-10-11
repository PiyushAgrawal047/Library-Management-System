package com.example.lms;

import android.widget.EditText;

public class CustomExceptions  {


    public boolean emptyField(String str)
    {

        if (str==null)
            return true;
        return false;
    }
}
