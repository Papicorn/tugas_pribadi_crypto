package com.example.tugaspribadi.model

import android.provider.ContactsContract.CommonDataKinds.Photo
import org.w3c.dom.Text

data class ModelSemuaKoin(
    val id: Int,
    val name: String,
    val secName: String,
    val priceNow: String,
    val kapPasar: String,
    val percent: String,
    val fdv: String,
    val mkt: String,
    val suplaiTotal: String,
    val photo: Int,
    val desc: String
)