package com.guilhermelimasapplication.app.modules.fichakratos.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.guilhermelimasapplication.app.R
import com.guilhermelimasapplication.app.appcomponents.base.BaseActivity
import com.guilhermelimasapplication.app.databinding.ActivityFichaKratosBinding
import com.guilhermelimasapplication.app.modules.fichakratos.`data`.viewmodel.FichaKratosVM
import com.guilhermelimasapplication.app.modules.home.ui.HomeActivity
import kotlin.String
import kotlin.Unit

class FichaKratosActivity : BaseActivity<ActivityFichaKratosBinding>(R.layout.activity_ficha_kratos)
    {
  private val viewModel: FichaKratosVM by viewModels<FichaKratosVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.fichaKratosVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnVoltar.setOnClickListener {
      val destIntent = HomeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "FICHA_KRATOS_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, FichaKratosActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
