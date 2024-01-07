package com.guilhermelimasapplication.app.modules.fichatreinolivre.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.guilhermelimasapplication.app.R
import com.guilhermelimasapplication.app.appcomponents.base.BaseActivity
import com.guilhermelimasapplication.app.databinding.ActivityFichaTreinoLivreBinding
import com.guilhermelimasapplication.app.modules.fichatreinolivre.`data`.viewmodel.FichaTreinoLivreVM
import com.guilhermelimasapplication.app.modules.home.ui.HomeActivity
import kotlin.String
import kotlin.Unit

class FichaTreinoLivreActivity :
    BaseActivity<ActivityFichaTreinoLivreBinding>(R.layout.activity_ficha_treino_livre) {
  private val viewModel: FichaTreinoLivreVM by viewModels<FichaTreinoLivreVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.fichaTreinoLivreVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnVoltar.setOnClickListener {
      val destIntent = HomeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "FICHA_TREINO_LIVRE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, FichaTreinoLivreActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
