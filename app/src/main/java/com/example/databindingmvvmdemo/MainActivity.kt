package com.example.databindingmvvmdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.databindingmvvmdemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var moBinding: ActivityMainBinding
    private lateinit var mainModel: MainViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        moBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        mainModel = ViewModelProvider(this).get(MainViewModel::class.java)

        /*
         ->when we set livedata using data binding not need to write below code.

                mainModel.quoteLiveData.observe(this, Observer {
                    moBinding.quoteText.text = it
                  })
        -> we just set lifecycleOwner instead of observer and set value in xml file in text property.
        */

        moBinding.lifecycleOwner = this


        /*moBinding.btnUpdate.setOnClickListener{
            mainModel.updateQuotes()
        }*/
        // replace above code using dataBinding and also set in xml file in onClick.

        moBinding.mainModel = mainModel
    }
}