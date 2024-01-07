package com.guilhermelimasapplication.app.modules.fichatreinolivre.data.model

import com.guilhermelimasapplication.app.R
import com.guilhermelimasapplication.app.appcomponents.di.MyApp
import kotlin.String

data class FichaTreinoLivreModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.lbl_seja_um_heroi)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNome: String? = MyApp.getInstance().resources.getString(R.string.lbl_nome)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtIdade: String? = MyApp.getInstance().resources.getString(R.string.lbl_idade)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtALTURA: String? = MyApp.getInstance().resources.getString(R.string.lbl_altura)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPeso: String? = MyApp.getInstance().resources.getString(R.string.lbl_peso)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtIMC: String? = MyApp.getInstance().resources.getString(R.string.lbl_imc)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOne: String? = MyApp.getInstance().resources.getString(R.string.lbl)

)
