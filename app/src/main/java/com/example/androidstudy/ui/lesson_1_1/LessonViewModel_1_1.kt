package com.example.androidstudy.ui.lesson_1_1

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class LessonViewModel_1_1 : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is lesson 1-1 Fragment"
    }
    val text: LiveData<String> = _text
}