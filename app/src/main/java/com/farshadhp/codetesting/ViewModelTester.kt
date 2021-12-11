package com.farshadhp.codetesting

import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelStoreOwner

class ViewModelTester (private var view : ViewModelStoreOwner){
    private var viewModel : MyViewModel = ViewModelProvider(view).get(MyViewModel::class.java)

    

}