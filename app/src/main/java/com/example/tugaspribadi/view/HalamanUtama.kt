package com.example.tugaspribadi.view

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.tugaspribadi.data.KoinLainnyaData
import com.example.tugaspribadi.data.TrendingData

@Composable
fun HalamanUtama(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(start = 17.dp, end = 17.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 10.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = "Trending",
                fontWeight = FontWeight.ExtraBold,
                fontSize = 17.sp,
                color = Color.Black.copy(alpha = 0.6f)
            )
            Text(
                text = "Lihat Lainnya",
                fontSize = 13.sp,
                color = Color(0xff978ef4),
                fontWeight = FontWeight.Medium,
                modifier = Modifier.clickable { navController.navigate("List") }
            )
        }
        Box {
            TrendingData(navController)
        }
        Spacer(modifier = Modifier.padding(top = 25.dp))
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 10.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "Koin Lainnya",
                fontWeight = FontWeight.ExtraBold,
                fontSize = 17.sp,
                color = Color.Black.copy(alpha = 0.6f)
            )
        }
        Box {
            KoinLainnyaData(navController)
        }
    }

}