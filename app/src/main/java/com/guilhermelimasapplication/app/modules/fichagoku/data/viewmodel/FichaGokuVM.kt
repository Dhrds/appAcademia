package com.guilhermelimasapplication.app.modules.fichagoku.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.guilhermelimasapplication.app.modules.fichagoku.`data`.model.FichaGokuModel
import org.koin.core.KoinComponent

class FichaGokuVM : ViewModel(), KoinComponent {
  val fichaGokuModel: MutableLiveData<FichaGokuModel> = MutableLiveData(FichaGokuModel())

  var navArguments: Bundle? = null
}
