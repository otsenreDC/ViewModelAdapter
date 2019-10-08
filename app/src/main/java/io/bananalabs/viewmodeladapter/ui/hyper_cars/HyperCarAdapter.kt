package io.bananalabs.viewmodeladapter.ui.hyper_cars

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import io.bananalabs.viewmodeladapter.R
import io.bananalabs.viewmodeladapter.databinding.ItemHyperCarBinding
import io.bananalabs.viewmodeladapter.models.HyperCar

class HyperCarAdapter :
    RecyclerView.Adapter<HyperCarAdapter.ViewHolder>() {

    private val items = ArrayList<HyperCar>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val dataBinding: ItemHyperCarBinding = DataBindingUtil.inflate(
            LayoutInflater.from(parent.context),
            R.layout.item_hyper_car,
            parent,
            false
        )
        return ViewHolder(dataBinding)
    }

    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindView(items[position])
    }

    fun addAll(hyperCars: List<HyperCar>) = hyperCars.forEach(::add)

    private fun add(hyperCar: HyperCar) {
        items.add(hyperCar)
    }

    class ViewHolder(private val dataBinding: ItemHyperCarBinding) :
        RecyclerView.ViewHolder(dataBinding.root) {

        val hyperCarViewModel = HyperCarViewModel()

        init {
            dataBinding.viewModel = hyperCarViewModel
        }

        fun bindView(hyperCar: HyperCar) {
            hyperCarViewModel.hyperCar = hyperCar

            if (hyperCar.thumbnail.isNotBlank())
                Picasso
                    .get()
                    .load(hyperCar.thumbnail)
                    .placeholder(R.drawable.piston_128)
                    .into(dataBinding.thumbnail)
            else
                dataBinding
                    .thumbnail
                    .setImageDrawable(itemView.context.getDrawable(R.drawable.piston_128))
        }

    }
}