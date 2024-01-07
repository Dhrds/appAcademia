package com.guilhermelimasapplication.app.modules.fichanaruto.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.guilhermelimasapplication.app.R
import com.guilhermelimasapplication.app.appcomponents.base.BaseActivity
import com.guilhermelimasapplication.app.databinding.ActivityFichaNarutoBinding
import com.guilhermelimasapplication.app.modules.fichanaruto.data.viewmodel.FichaNarutoVM
import com.guilhermelimasapplication.app.modules.home.ui.HomeActivity
import kotlin.String
import kotlin.Unit

class FichaNarutoActivity : BaseActivity<ActivityFichaNarutoBinding>(R.layout.activity_ficha_naruto)
    {
  private val viewModel: FichaNarutoVM by viewModels<FichaNarutoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.fichaNarutoVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnVoltar.setOnClickListener {
      val destIntent = HomeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "FICHA_NARUTO_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, FichaNarutoActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
