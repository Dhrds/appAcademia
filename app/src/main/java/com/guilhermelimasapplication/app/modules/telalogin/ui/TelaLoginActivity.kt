package com.guilhermelimasapplication.app.modules.telalogin.ui

import androidx.activity.viewModels
import com.guilhermelimasapplication.app.R
import com.guilhermelimasapplication.app.appcomponents.base.BaseActivity
import com.guilhermelimasapplication.app.databinding.ActivityTelaLoginBinding
import com.guilhermelimasapplication.app.modules.home.ui.HomeActivity
import com.guilhermelimasapplication.app.modules.telalogin.`data`.viewmodel.TelaLoginVM
import kotlin.String
import kotlin.Unit

class TelaLoginActivity : BaseActivity<ActivityTelaLoginBinding>(R.layout.activity_tela_login) {
  private val viewModel: TelaLoginVM by viewModels<TelaLoginVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.telaLoginVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnLogin.setOnClickListener {
      val destIntent = HomeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "TELA_LOGIN_ACTIVITY"

  }
}
