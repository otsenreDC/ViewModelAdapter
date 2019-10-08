package io.bananalabs.viewmodeladapter.repositories

import io.bananalabs.viewmodeladapter.models.HyperCar

object CarsRepository {

    fun fetchHyperCars(): List<HyperCar> = arrayListOf(
        HyperCar("Aston Martin", "Vulcan"),
        HyperCar("Aston Martin", "Valkyrie"),
        HyperCar("Bugatti", "Vyron"),
        HyperCar("Bugatti", "Chirion"),
        HyperCar(
            "Ferrari",
            "LaFerrari",
            "https://rukminim1.flixcart.com/image/832/832/vehicle-pull-along/q/m/t/hot-wheels-ferrari-laferrari-f70-hybrid-elite-original-imaejbgnd73dyfyp.jpeg?q=70"
        ),
        HyperCar("Hennessey", "Venom"),
        HyperCar("Koenigsegg", "Agera"),
        HyperCar("Koenigsegg", "One:1"),
        HyperCar("Koenigsegg", "Regera"),
        HyperCar("Lamborghini", "Sesto Elemento"),
        HyperCar("Lamborghini", "Terso Millennio"),
        HyperCar("McLaren", "Senna"),
        HyperCar("McLaren", "P1"),
        HyperCar("McLaren", "SpeedTail"),
        HyperCar("Mercedes", "AMG Project One"),
        HyperCar("Porshe", "Carrera 918"),
        HyperCar("Porshe", "Carrera 911 GT2 RS"),
        HyperCar(
            "Rimac",
            "C Two",
            "https://lh3.googleusercontent.com/A4vIT4QyAFdKSym5bxtd3NQF5UpCfrYTp2UZ2oUrbzhacl6O63Wvl13UVcmDc97O5KbGiy5Fzw=w128-h128-e365"
        ),
        HyperCar("Rimac", "Concept S"),
        HyperCar("Rimac", "Concept One"),
        HyperCar("Tesla", "Roadster")
    )
}