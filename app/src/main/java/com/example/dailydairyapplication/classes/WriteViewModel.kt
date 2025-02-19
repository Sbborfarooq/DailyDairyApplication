package com.example.dailydairyapplication.classes

import android.provider.ContactsContract
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class WriteViewModel:ViewModel() {
    // LiveData for the Title EditText
    val titleText = MutableLiveData<String>("")

    // LiveData for the Content EditText
    val contentText = MutableLiveData<String>("")

    }
