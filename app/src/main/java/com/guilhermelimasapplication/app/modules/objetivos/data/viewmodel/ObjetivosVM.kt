package com.guilhermelimasapplication.app.modules.objetivos.data.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.guilhermelimasapplication.app.modules.objetivos.data.model.ObjetivosModel
import org.koin.core.KoinComponent

class ObjetivosVM : ViewModel(), KoinComponent {
  val objetivosModel: MutableLiveData<ObjetivosModel> = MutableLiveData(ObjetivosModel())

  var navArguments: Bundle? = null
}
