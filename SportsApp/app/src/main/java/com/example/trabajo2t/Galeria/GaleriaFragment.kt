package com.example.trabajo2t.Galeria

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.trabajo2t.R
import com.example.trabajo2t.databinding.FragmentGaleriaBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [GaleriaFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class GaleriaFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    private lateinit var binding: FragmentGaleriaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentGaleriaBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val listaGaleria = ArrayList<Int>()
        listaGaleria.add(R.drawable.galeria_2)
        listaGaleria.add(R.drawable.galeria_3)
        listaGaleria.add(R.drawable.galeria_4)
        listaGaleria.add(R.drawable.galeria_5)
        listaGaleria.add(R.drawable.galeria_6)
        listaGaleria.add(R.drawable.galeria_7)
        listaGaleria.add(R.drawable.galeria_8)
        listaGaleria.add(R.drawable.galeria_9)
        listaGaleria.add(R.drawable.galeria_10)
        listaGaleria.add(R.drawable.galeria_11)
        listaGaleria.add(R.drawable.galeria_12)
        listaGaleria.add(R.drawable.galeria_13)
        listaGaleria.add(R.drawable.galeria_14)
        listaGaleria.add(R.drawable.galeria_15)
        listaGaleria.add(R.drawable.galeria_16)
        listaGaleria.add(R.drawable.galeria_17)
        listaGaleria.add(R.drawable.galeria_18)
        listaGaleria.add(R.drawable.galeria_19)

        val layoutManager = StaggeredGridLayoutManager(3, RecyclerView.HORIZONTAL)
        binding.recycler.layoutManager = layoutManager

        val adapter = GaleriaAdapter()
        binding.recycler.adapter = adapter

        adapter.llenarLista(listaGaleria)
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment GaleriaFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) = GaleriaFragment().apply {
            arguments = Bundle().apply {
                putString(ARG_PARAM1, param1)
                putString(ARG_PARAM2, param2)
            }
        }
    }
}