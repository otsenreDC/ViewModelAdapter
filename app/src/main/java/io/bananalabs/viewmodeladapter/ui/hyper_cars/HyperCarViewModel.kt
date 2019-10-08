package io.bananalabs.viewmodeladapter.ui.hyper_cars

import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import androidx.databinding.library.baseAdapters.BR
import io.bananalabs.viewmodeladapter.models.HyperCar

class HyperCarViewModel : BaseObservable() {
    var hyperCar: HyperCar = HyperCar("", "")
        set(value) {
            field = value
            carName = hyperCar.carName
            isFavorite = hyperCar.favorite
        }

    @get:Bindable
    var carName: String = ""
    set(value) {
        field = value
        notifyPropertyChanged(BR.carName)
    }

    @get:Bindable
    var isFavorite: Boolean = false
    set(value) {
        field = value
        hyperCar.favorite = value
        notifyPropertyChanged(BR.favorite)
    }
}