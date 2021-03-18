package com.example.androidstudy.ui.lesson_1_2

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class LessonViewModel_1_2 : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is lesson 1-2 Fragment"
    }
    val text: LiveData<String> = _text
}