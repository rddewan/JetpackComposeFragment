package com.example.jetpackcomposefragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material.CircularProgressIndicator

import androidx.compose.material.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.fragment.app.Fragment


class ComposeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        /*val view =  layoutInflater.inflate(R.layout.fragment_compose,container,false)
        return view*/

        /*val view = ComposeView(requireContext())
        view.apply {
            setContent {
                Text(text = "Fragment View",
                color = Color.Red,
                fontSize = 18.sp)
            }
        }
        return view*/

        /*return ComposeView(requireContext()).apply {
            setContent {
                Column(
                    modifier = Modifier
                        .padding(8.dp)
                        .fillMaxWidth()
                        .border(border = BorderStroke(width = 1.dp,Color.Blue))
                ) {
                    Text(
                        text = "Compose Fragment",
                        modifier = Modifier.align(Alignment.CenterHorizontally)
                    )
                }
            }
        }*/

        val view  = inflater.inflate(R.layout.fragment_compose,container,false)
        view.findViewById<ComposeView>(R.id.compose_view).setContent {
            Column(modifier = Modifier
                .padding(8.dp)
                .border(border = BorderStroke(2.dp,Color.Blue))) {
                Text(text = "This is Fragment Container",
                    style = TextStyle(color = Color.Red,fontSize = 18.sp),
                modifier = Modifier.align(Alignment.CenterHorizontally))

                Spacer(modifier = Modifier.padding(16.dp))

                CircularProgressIndicator(modifier = Modifier
                    .align(Alignment.CenterHorizontally),color = Color(0xFF_F44336))

                Spacer(modifier = Modifier.padding(16.dp))


            }
        }

        return view
    }
}