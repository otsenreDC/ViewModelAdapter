package io.bananalabs.viewmodeladapter.databinding

import android.widget.TextView
import androidx.databinding.BindingAdapter
import io.bananalabs.viewmodeladapter.models.HyperCar

object BindingAdapter {

    @JvmStatic
    @BindingAdapter("hc:carName")
    fun carName(view: TextView, hyperCar: HyperCar?) {
        view.text = hyperCar?.carName
    }
}