package com.example.tugaspribadi.partials

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.outlined.Menu
import androidx.compose.material.icons.sharp.Person
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState

@SuppressLint("RestrictedApi")
@Composable
fun BottomNavBar(navController: NavController) {
    val navBackStackEntry = navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry.value?.destination?.route

    NavigationBar(
        containerColor = Color.White,
        modifier = Modifier.fillMaxWidth().shadow(elevation = 4.dp)
    ) {
        NavigationBarItem(
            icon = { Icon(Icons.Filled.Home, contentDescription = "Halaman Utama") },
            label = { Text("Halaman Utama") },
            selected = currentRoute == "Halaman Utama",
            colors = NavigationBarItemDefaults.colors(
                indicatorColor = Color.Transparent,
                selectedIconColor = Color(0xff978ef4),
                selectedTextColor = Color(0xff978ef4)
            ),
            onClick = { navController.navigate("Halaman Utama") }
        )
        NavigationBarItem(
            icon = { Icon(Icons.Outlined.Menu, contentDescription = "List") },
            label = { Text("List") },
            selected = currentRoute == "List",
            colors = NavigationBarItemDefaults.colors(
                indicatorColor = Color.Transparent,
                selectedIconColor = Color(0xff978ef4),
                selectedTextColor = Color(0xff978ef4)
            ),
            onClick = { navController.navigate("List") }
        )
        NavigationBarItem(
            icon = { Icon(Icons.Sharp.Person, contentDescription = "About") },
            label = { Text("About") },
            selected = currentRoute == "About",
            colors = NavigationBarItemDefaults.colors(
                indicatorColor = Color.Transparent,
                selectedIconColor = Color(0xff978ef4),
                selectedTextColor = Color(0xff978ef4)
            ),
            onClick = { navController.navigate("About") }
        )
    }
}
