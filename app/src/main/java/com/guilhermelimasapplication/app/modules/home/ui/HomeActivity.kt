package com.guilhermelimasapplication.app.modules.home.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.guilhermelimasapplication.app.R
import com.guilhermelimasapplication.app.appcomponents.base.BaseActivity
import com.guilhermelimasapplication.app.databinding.ActivityHomeBinding
import com.guilhermelimasapplication.app.modules.fichagoku.ui.FichaGokuActivity
import com.guilhermelimasapplication.app.modules.fichakratos.ui.FichaKratosActivity
import com.guilhermelimasapplication.app.modules.fichanaruto.ui.FichaNarutoActivity
import com.guilhermelimasapplication.app.modules.fichatreinolivre.ui.FichaTreinoLivreActivity
import com.guilhermelimasapplication.app.modules.home.data.viewmodel.HomeVM
import kotlin.String
import kotlin.Unit

class HomeActivity : BaseActivity<ActivityHomeBinding>(R.layout.activity_home) {
  private val viewModel: HomeVM by viewModels<HomeVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.homeVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearColumnnaruto1381.setOnClickListener {
      val destIntent = FichaGokuActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearColumnLivre.setOnClickListener {
      val destIntent = FichaTreinoLivreActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearColumnGoku.setOnClickListener {
      val destIntent = FichaNarutoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearColumnlanguageOne.setOnClickListener {
      val destIntent = FichaKratosActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "HOME_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, HomeActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
