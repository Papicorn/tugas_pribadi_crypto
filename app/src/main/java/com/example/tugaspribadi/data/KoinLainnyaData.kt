package com.example.tugaspribadi.data

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun  KoinLainnyaData(navController: NavController) {
    LazyColumn {
        items(DataSemuaKoin.semuaKoin) { koin ->
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(55.dp)
                    .clickable { navController.navigate("Detail/${koin.id}") },
                colors = CardDefaults.cardColors(
                    containerColor = Color.Transparent
                )
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxSize(),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Column {
                            Text(
                                text = koin.name,
                                fontSize = 20.sp,
                                style = TextStyle(lineHeight = 0.sp),
                                modifier = Modifier.padding(bottom = 0.dp)
                            )
                            Text(
                                text = koin.secName + "/IDR",
                                fontSize = 15.sp,
                                style = TextStyle(lineHeight = 0.sp),
                                modifier = Modifier.padding(top = 0.dp),
                                color = Color.Black.copy(alpha = 0.5f)
                            )
                        }
                        Column(
                            horizontalAlignment = Alignment.End
                        ) {
                            Text(
                                text = koin.priceNow,
                                fontSize = 20.sp,
                                style = TextStyle(lineHeight = 0.sp),
                                modifier = Modifier.padding(bottom = 0.dp)
                            )
                            Text(
                                text = koin.percent + "%",
                                fontSize = 15.sp,
                                style = TextStyle(lineHeight = 0.sp),
                                fontWeight = FontWeight.Bold,
                                color = Profit,
                                modifier = Modifier.padding(top = 0.dp)
                            )
                        }
                    }
                }
            }
            Box(
             modifier = Modifier
                 .fillMaxWidth()
                 .height(0.7.dp)
                 .background(Color.Black.copy(alpha = 0.1f))
            )
        }
    }
}