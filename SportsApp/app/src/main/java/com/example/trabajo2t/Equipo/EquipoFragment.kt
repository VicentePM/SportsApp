package com.example.trabajo2t.Equipo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.trabajo2t.R
import com.example.trabajo2t.databinding.FragmentEquipoBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [EquipoFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class EquipoFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    private lateinit var binding: FragmentEquipoBinding

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

        binding = FragmentEquipoBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val listaEquipo = ArrayList<Jugador>()
        listaEquipo.add(Jugador(
            1,
            "Clua",
            "David Clua Pumar",
            "Portero",
            "07/01/1995",
            "Vigo",
            1.99,
            85,
            "Burgos CF",
            "",
            "https://pbs.twimg.com/media/FLqUG2zXIAIGICS?format=jpg&name=small",
            1,
            "escuelaestech"
        ))
        listaEquipo.add(Jugador(
            2,
            "Lacroux",
            "Jany Lacroux",
            "Lateral derecho",
            "26/02/1996",
            "Bree (Bélgica)",
            1.82,
            79,
            "Genk Sub'19",
            "Lateral derecho que también se desenvuelve bien como central. Internacional en categorías inferiores con Bélgica",
            "https://pbs.twimg.com/media/FLGVFofXoAMMysN?format=jpg&name=small",
            2,
            ""
        ))
        listaEquipo.add(Jugador(
            3,
            "Ginés",
            "Ánge Ginés Alcalá",
            "Lateral izquierdo",
            "19/06/1994",
            "Peralada (Girona)",
            1.73,
            70,
            "Girona FC",
            "Ha disputado más de 100 partidos en segunda",
            "https://pbs.twimg.com/media/FHZTm9xXIAAHYW0?format=jpg&name=small",
            2,
            "escuelaestech"
        ))
        listaEquipo.add(Jugador(
            4,
            "Guraya",
            "Raúl Guraya Gómez",
            "Defensa central",
            "14/05/1988",
            "Madrid",
            1.83,
            81,
            "Granada B",
            "Defensa central con gran experiencia en la categoría",
            "https://pbs.twimg.com/media/FGmE7UJWQAsm21C?format=jpg&name=small",
            2,
            ""
        ))
        listaEquipo.add(Jugador(
            5,
            "Monjonell",
            "Alba Monjonell Vila",
            "Defensa central",
            "06/06/1984",
            "Villar del Arzobispo (Valencia)",
            1.85,
            80,
            "Guadalajara",
            "Trayectoria: Valencia C - Valencia B - Barcelona B- - Gimnástic Tarragona - C.D. Guadalajara",
            "https://pbs.twimg.com/media/E6r_jBgWEAsGb1F?format=jpg&name=small",
            2,
            ""
        ))
        listaEquipo.add(Jugador(
            6,
            "Mene",
            "Enzo Meneghello Peláez",
            "Mediapunta",
            "23/03/1989",
            "Santander",
            1.84,
            74,
            "Racing Santander B",
            "Centrocampista ofensivo con buena zurda",
            "https://pbs.twimg.com/media/E6rsruuWQAALwT0?format=jpg&name=small",
            3,
            "escuelaestech"
        ))
        listaEquipo.add(Jugador(
            7,
            "Cimbrón",
            "Manuel Cimbrón Ortiz",
            "Mediocentro",
            "11/12/1984",
            "Albacete",
            1.77,
            74,
            "Valencia Mestalla",
            "Mediocentro de gran clase y muy técnico, que ayuda a sacar el balón jugado desde atrás",
            "https://pbs.twimg.com/media/E3n3rHxXwAchTUs?format=jpg&name=small",
            3,
            ""
        ))
        listaEquipo.add(Jugador(
            8,
            "Akeda",
            "Abdoulaye Akeda Opono",
            "Interior derecho",
            "04/07/1992",
            "Camerún",
            1.75,
            73,
            "Almería B",
            "Jugador muy rápido y de desborde. Suele irse de sus rivales por velocidad.",
            "https://pbs.twimg.com/media/E2tboRgXMAAvRQH?format=jpg&name=small",
            3,
            ""
        ))
        listaEquipo.add(Jugador(
            9,
            "Guillamas",
            "Sergio Guillamas Urquijo",
            "Interior izquierdo",
            "16/01/1992",
            "Vitoria-Gazteiz",
            1.89,
            73,
            "Mallorca B",
            "A pesar de su altura, posee gran velocidad y regate en carrera. Jugador muy habilidoso, también útil en el juego aéreo",
            "https://pbs.twimg.com/media/E2j3ZpoXoAQVL7_?format=jpg&name=small",
            3,
            "escuelaestech"
        ))
        listaEquipo.add(Jugador(
            10,
            "Pozo",
            "Víctor Pozo López",
            "Delantero",
            "14/11/1992",
            "Córdoba",
            1.83,
            78,
            "Córdoba CF",
            "Delantero con gran olfato de gol, la pasada temporada marcó 20 goles en la categoría de plata.",
            "https://pbs.twimg.com/media/EoLc10hXcAECXNq?format=jpg&name=small",
            4,
            ""
        ))
        listaEquipo.add(Jugador(
            11,
            "Ari",
            "Arístides Martínez López",
            "Segundo delantero",
            "24/10/1985",
            "Granada",
            1.76,
            70,
            "CF Motril",
            "Delantero habilidoso y de gran técnica. Bueno en el último pase.",
            "https://pbs.twimg.com/media/EdodsQXXsAAxIJA?format=jpg&name=small",
            4,
            ""
        ))
        listaEquipo.add(Jugador(
            12,
            "José Sierra",
            "José Sierra Urquijo",
            "Entrenador",
            "24/19/1965",
            "Las Palmas (Gran Canaria)",
            1.81,
            85,
            "CD Mensajero",
            "- Como jugador: Málaga (88-92), Marbella (92-93), Mérida (93-94), Espanyol (94-97), Mérida (97-99), Las Palmas (99-05)\n - Como entrenador: 2º entrenador Algeciras (05-06), Mérida (06-07), Ojeador Numancia (07-08), Los Barrios (08-11), Vecindario (11-15)",
            "",
            0,
            ""
        ))

        val layoutManager = GridLayoutManager(requireContext(), 2, RecyclerView.VERTICAL, false)
        binding.recyclerEquipo.layoutManager = layoutManager

        val adapter = EquipoAdapter()
        binding.recyclerEquipo.adapter = adapter

        adapter.llenarLista(listaEquipo)

    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment EquipoFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            EquipoFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}