package com.example.trabajo2t.Equipo

import android.content.Intent
import android.net.Uri
import android.os.Build
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.example.trabajo2t.R
import com.example.trabajo2t.databinding.FragmentJugadorBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [JugadorFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class JugadorFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    private lateinit var binding: FragmentJugadorBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentJugadorBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        arguments?.let{bundle ->
            val jugador = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
                bundle.getParcelable("jugador", Jugador::class.java)
            } else {
                bundle.getParcelable("jugador")
            }
            if(jugador != null){
                binding.tvApodo.text = jugador.apodo
                binding.tvNombre.text = jugador.nombre
                binding.tvPuesto.text = jugador.posicion
                binding.tvEdad.text = jugador.fecha
                binding.tvLNacimiento.text = jugador.lugar
                binding.tvAltura.text = jugador.altura.toString()
                binding.tvPeso.text = jugador.peso.toString()
                binding.tvProcedencia.text = jugador.procedencia
                binding.textView5.text = jugador.id.toString()
                binding.tvDescripcion.text = jugador.descripcion
                Glide.with(this).load(jugador.foto).placeholder(com.example.trabajo2t.R.drawable.player).into(binding.imagenJugador)

                binding.floatingActionButton.setOnClickListener {
                    try {
                        val uri = Uri.parse("twitter://user?screen_name=escuelaestech")
                        val intent = Intent(Intent.ACTION_VIEW, uri)
                        startActivity(intent)
                    } catch (e: Exception) {
                        val uri = Uri.parse("https://twitter.com/escuelaestech")
                        val intent = Intent(Intent.ACTION_VIEW, uri)
                        startActivity(intent)
                    }
                }
            }
        }


    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment JugadorFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            JugadorFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}