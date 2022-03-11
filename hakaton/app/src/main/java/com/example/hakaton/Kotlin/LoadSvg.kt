package com.example.hakaton.Kotlin

import android.annotation.SuppressLint
import android.widget.ImageView
import coil.ImageLoader
import coil.api.load
import coil.decode.SvgDecoder
import java.util.*

import coil.request.LoadRequest

object LoadSvg {

    @SuppressLint("WrongViewCast")
    fun ImageView.loadSvgOrOthers(myUrl: String?) {

        myUrl?.let {
            if (it.toLowerCase(Locale.ENGLISH).endsWith("svg")) {
                val imageLoader = ImageLoader.Builder(this.context)
                    .componentRegistry {
                        add(SvgDecoder(this@loadSvgOrOthers.context))
                    }
                    .build()
                val request = LoadRequest.Builder(this.context)
                    .data(it)
                    .target(this)
                    .build()
                imageLoader.execute(request)
            } else {
                this.load(myUrl)
            }

        }

    }
    @kotlin.jvm.JvmStatic

    fun getSVG(imageSvg : ImageView,urlSvg : String?){
        imageSvg.loadSvgOrOthers(urlSvg)
    }

}