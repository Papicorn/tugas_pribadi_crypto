package com.example.tugaspribadi.navigation

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
import androidx.compose.ui.unit.dp
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.tugaspribadi.partials.BottomNavBar
import com.example.tugaspribadi.partials.HeaderMain
import com.example.tugaspribadi.view.HalamanAbout
import com.example.tugaspribadi.view.HalamanDetail
import com.example.tugaspribadi.view.HalamanList
import com.example.tugaspribadi.view.HalamanUtama

@Composable
fun MainScreen() {
    val navController = rememberNavController()
    var title by remember { mutableStateOf("Halaman Utama") }
    var back = "False"

    Scaffold(
        bottomBar = { BottomNavBar(navController) }
    ) { innerPadding ->
        Surface(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding),
            color = Color.White
        ) {
            Column {
                HeaderMain(navController = navController, titleHeaderNya = title, back = back)
                Spacer(modifier = Modifier.padding(top = 17.dp))

                NavHost(navController, startDestination = "Halaman Utama") {
                    composable("Halaman Utama") {
                        back = "False"
                        title = "Halaman Utama"
                        HalamanUtama(navController)
                    }
                    composable("List") {
                        back = "False"
                        title = "List"
                        HalamanList(navController)
                    }
                    composable("About") {
                        back = "False"
                        title = "About"
                        HalamanAbout(navController)
                    }
                    composable("Detail/{coinID}", arguments = listOf(navArgument("coinID") { type = NavType.IntType })
                    ) { backStackEntry ->
                        val coinID = backStackEntry.arguments?.getInt("coinID") ?: -1
                        HalamanDetail(coinID)
                        back = "True"
                        title = "Detail"
                    }
                }
            }
        }
    }
}