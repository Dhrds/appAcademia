package com.guilhermelimasapplication.app.modules.fichakratos.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.guilhermelimasapplication.app.modules.fichakratos.`data`.model.FichaKratosModel
import org.koin.core.KoinComponent

class FichaKratosVM : ViewModel(), KoinComponent {
  val fichaKratosModel: MutableLiveData<FichaKratosModel> = MutableLiveData(FichaKratosModel())

  var navArguments: Bundle? = null
}
