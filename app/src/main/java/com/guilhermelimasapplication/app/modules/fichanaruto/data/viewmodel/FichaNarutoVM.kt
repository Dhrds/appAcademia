package com.guilhermelimasapplication.app.modules.fichanaruto.data.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.guilhermelimasapplication.app.modules.fichanaruto.data.model.FichaNarutoModel
import org.koin.core.KoinComponent

class FichaNarutoVM : ViewModel(), KoinComponent {
  val fichaNarutoModel: MutableLiveData<FichaNarutoModel> = MutableLiveData(FichaNarutoModel())

  var navArguments: Bundle? = null
}
