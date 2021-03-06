package com.example.androidstudy.ui.lesson_1_2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.androidstudy.R

class LessonFragment_1_2 : Fragment() {

    private lateinit var galleryViewModel: LessonViewModel_1_2

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        galleryViewModel =
                ViewModelProvider(this).get(LessonViewModel_1_2::class.java)
        val root = inflater.inflate(R.layout.fragment_lesson_1_2, container, false)
        val textView: TextView = root.findViewById(R.id.lesson_1_2_title)
        galleryViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}