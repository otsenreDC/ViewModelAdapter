package io.bananalabs.viewmodeladapter.ui.hyper_cars

import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import io.bananalabs.viewmodeladapter.BR
import io.bananalabs.viewmodeladapter.models.HyperCar

class HyperCarViewModel : BaseObservable() {

    @get:Bindable
    var hyperCar: HyperCar = HyperCar("", "")
        set(value) {
            field = value
            notifyPropertyChanged(BR.viewModel)
        }

}