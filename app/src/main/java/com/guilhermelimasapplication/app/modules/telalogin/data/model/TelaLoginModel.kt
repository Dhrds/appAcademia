package com.guilhermelimasapplication.app.modules.telalogin.data.model

import com.guilhermelimasapplication.app.R
import com.guilhermelimasapplication.app.appcomponents.di.MyApp
import kotlin.String

data class TelaLoginModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtMYHERO: String? = MyApp.getInstance().resources.getString(R.string.lbl_my_hero)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAcademia: String? = MyApp.getInstance().resources.getString(R.string.lbl_academia)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEsqueceuasenh: String? =
      MyApp.getInstance().resources.getString(R.string.msg_esqueceu_a_senh)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCriarconta: String? = MyApp.getInstance().resources.getString(R.string.msg_n_o_tem_cadastr)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etInputLoginValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etInputSenhaValue: String? = null
)
