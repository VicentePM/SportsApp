package com.example.trabajo2t.Contacto

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.example.trabajo2t.R
import com.example.trabajo2t.databinding.FragmentContactoBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [ContactoFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ContactoFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    private lateinit var binding: FragmentContactoBinding

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
        binding = FragmentContactoBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.correo.setOnClickListener {
            val address = "info@escuelaestech.es"
            val subject = "Asunto"
            val text = "Texto"
            val uri = Uri.parse("mailto:$address?subject=$subject&body=$text")
            val intent = Intent(Intent.ACTION_SENDTO, uri)
            startActivity(intent)

        }

        binding.telefono.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL)
            intent.data = Uri.parse("tel:953 636 000")
            startActivity(intent)
        }

        binding.ubicacion.setOnClickListener {
            val uri =
                "https://goo.gl/maps/vwiTGaykc3yU547P6" // Enlace de Google Maps de la ubicación
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(uri))
            intent.setPackage("com.google.android.apps.maps")
            startActivity(intent)
        }

        binding.whatsapp.setOnClickListener {
            val telefono = "+34 697 24 60 08" // Número de teléfono en formato internacional
            val uri = "https://wa.me/$telefono"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(uri))
            startActivity(intent)
        }

        binding.enviar.setOnClickListener {
            val nombre = binding.name.text.toString()
            val correo = binding.email.text.toString()
            val telefono = binding.phone.text.toString()
            val mensaje = binding.mensaje.text.toString()

            fun isValidEmail(email: String): Boolean {
                val emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+"
                return email.matches(emailPattern.toRegex())
            }

            if (nombre.isBlank() || correo.isBlank() || telefono.isBlank() || mensaje.isBlank()) {
                Toast.makeText(
                    requireContext(), "Por favor, rellena todos los campos", Toast.LENGTH_SHORT
                ).show()
            } else if (!isValidEmail(correo)) {
                Toast.makeText(
                    requireContext(),
                    "Por favor, introduce un correo electrónico válido.",
                    Toast.LENGTH_SHORT
                ).show()
            } else {
                val confirmDialog = AlertDialog.Builder(requireContext()).setTitle("Confirmación")
                    .setMessage("¿Estás seguro de que quieres enviar este mensaje?")
                    .setPositiveButton("Sí") { _, _ ->
                        val destinatarios =
                            arrayOf("info@escuelaestech.es", "secretaria@escuelaestech.es")
                        val intent = Intent(Intent.ACTION_SENDTO)
                        intent.data = Uri.parse("mailto:")
                        intent.putExtra(Intent.EXTRA_EMAIL, destinatarios)
                        intent.putExtra(Intent.EXTRA_SUBJECT, telefono)
                        intent.putExtra(Intent.EXTRA_TEXT, mensaje)
                        startActivity(Intent.createChooser(intent, "Enviar correo"))
                    }.setNegativeButton("No", null).create()

                confirmDialog.show()
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
         * @return A new instance of fragment ContactoFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) = ContactoFragment().apply {
            arguments = Bundle().apply {
                putString(ARG_PARAM1, param1)
                putString(ARG_PARAM2, param2)
            }
        }
    }
}