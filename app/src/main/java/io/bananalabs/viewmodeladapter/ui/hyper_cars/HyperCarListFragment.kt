package io.bananalabs.viewmodeladapter.ui.hyper_cars

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import io.bananalabs.viewmodeladapter.repositories.CarsRepository
import io.bananalabs.viewmodeladapter.R
import io.bananalabs.viewmodeladapter.databinding.FragmentHyperCarListBinding

class HyperCarListFragment : Fragment() {

    private lateinit var dataBinding: FragmentHyperCarListBinding
    private lateinit var hyperCarAdapter: HyperCarAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        dataBinding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_hyper_car_list,
            container,
            false
        )

        return dataBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        hyperCarAdapter = HyperCarAdapter()
        hyperCarAdapter.addAll(
            CarsRepository.fetchHyperCars()
        )

        dataBinding.hyperCarList.adapter = hyperCarAdapter
        dataBinding.lifecycleOwner = this
    }

}