package com.example.livedata_databinding

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.livedata_databinding.databinding.ActivityMainBinding
import com.example.livedata_databinding.domain.CustomDataClass
import com.example.livedata_databinding.observers.MainActObserver
import com.example.livedata_databinding.viewmodels.MAinViewModelFactory
import com.example.livedata_databinding.viewmodels.MainActViewModel

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var mainActViewModel: MainActViewModel
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding= DataBindingUtil.setContentView(this,R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        lifecycle.addObserver(MainActObserver())
//        mainActViewModel= ViewModelProvider(this, MAinViewModelFactory("First String"))[MainActViewModel::class.java]
        mainActViewModel= ViewModelProvider(this, MAinViewModelFactory(CustomDataClass("Dinesh","5")))[MainActViewModel::class.java]
        /*  mainActViewModel.liveDataObj.observe(this, Observer{
            binding.txt.text=it
        })
        binding.btn.setOnClickListener {
            mainActViewModel.update()

        }
*/
        binding.lifecycleOwner=this
        binding.str=mainActViewModel

    }
}