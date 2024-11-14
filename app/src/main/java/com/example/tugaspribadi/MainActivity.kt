package com.example.tugaspribadi

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.tugaspribadi.navigation.MainScreen
import com.example.tugaspribadi.partials.BottomNavBar
import com.example.tugaspribadi.ui.theme.TugasPribadiTheme
import com.example.tugaspribadi.partials.HeaderMain
import com.example.tugaspribadi.view.HalamanAbout
import com.example.tugaspribadi.view.HalamanDetail
import com.example.tugaspribadi.view.HalamanList
import com.example.tugaspribadi.view.HalamanUtama

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TugasPribadiTheme {
                MainScreen()
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    TugasPribadiTheme {
        MainScreen()
    }
}