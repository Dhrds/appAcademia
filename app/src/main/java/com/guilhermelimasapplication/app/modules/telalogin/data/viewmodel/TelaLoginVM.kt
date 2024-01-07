package com.guilhermelimasapplication.app.modules.telalogin.data.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.guilhermelimasapplication.app.modules.telalogin.data.model.TelaLoginModel
import org.koin.core.KoinComponent

class TelaLoginVM : ViewModel(), KoinComponent {
  val telaLoginModel: MutableLiveData<TelaLoginModel> = MutableLiveData(TelaLoginModel())

  var navArguments: Bundle? = null
}
