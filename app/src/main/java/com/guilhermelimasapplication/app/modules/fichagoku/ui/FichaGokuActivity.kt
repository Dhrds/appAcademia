package com.guilhermelimasapplication.app.modules.fichagoku.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.guilhermelimasapplication.app.R
import com.guilhermelimasapplication.app.appcomponents.base.BaseActivity
import com.guilhermelimasapplication.app.databinding.ActivityFichaGokuBinding
import com.guilhermelimasapplication.app.modules.fichagoku.`data`.viewmodel.FichaGokuVM
import com.guilhermelimasapplication.app.modules.home.ui.HomeActivity
import kotlin.String
import kotlin.Unit

class FichaGokuActivity : BaseActivity<ActivityFichaGokuBinding>(R.layout.activity_ficha_goku) {
  private val viewModel: FichaGokuVM by viewModels<FichaGokuVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.fichaGokuVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnVoltar.setOnClickListener {
      val destIntent = HomeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "FICHA_GOKU_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, FichaGokuActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
