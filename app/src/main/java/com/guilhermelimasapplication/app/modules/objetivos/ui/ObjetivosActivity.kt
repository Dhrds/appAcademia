package com.guilhermelimasapplication.app.modules.objetivos.ui

import androidx.activity.viewModels
import com.guilhermelimasapplication.app.R
import com.guilhermelimasapplication.app.appcomponents.base.BaseActivity
import com.guilhermelimasapplication.app.databinding.ActivityObjetivosBinding
import com.guilhermelimasapplication.app.modules.home.ui.HomeActivity
import com.guilhermelimasapplication.app.modules.objetivos.data.viewmodel.ObjetivosVM
import kotlin.String
import kotlin.Unit

class ObjetivosActivity : BaseActivity<ActivityObjetivosBinding>(R.layout.activity_objetivos) {
  private val viewModel: ObjetivosVM by viewModels<ObjetivosVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.objetivosVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnConfirmar.setOnClickListener {
      val destIntent = HomeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearColumnvoltar.setOnClickListener {
      val destIntent = HomeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "OBJETIVOS_ACTIVITY"

  }
}
