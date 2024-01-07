package com.guilhermelimasapplication.app.modules.home.`data`.model

import com.guilhermelimasapplication.app.R
import com.guilhermelimasapplication.app.appcomponents.di.MyApp
import kotlin.String

data class HomeModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_fichas_de_tre)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_kratos)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNaruto: String? = MyApp.getInstance().resources.getString(R.string.lbl_naruto)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGoku: String? = MyApp.getInstance().resources.getString(R.string.lbl_goku)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTreinolivre: String? = MyApp.getInstance().resources.getString(R.string.lbl_treino_livre)

)
