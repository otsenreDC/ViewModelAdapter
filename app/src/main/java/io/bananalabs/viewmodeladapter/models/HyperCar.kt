package io.bananalabs.viewmodeladapter.models

data class HyperCar(
    var brand: String,
    var model: String,
    var thumbnail: String = "",
    var favorite: Boolean = false
) {
    val carName = "$brand - $model"
}