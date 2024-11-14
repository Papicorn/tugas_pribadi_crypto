package com.example.tugaspribadi.data

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyRow
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

val Profit = Color(0xFF26c277)
val Loss = Color(0xFFc22626)

@Composable
fun TrendingData(navController: NavController) {
    LazyRow(
        horizontalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        items(DataSemuaKoin.semuaKoin) { koin ->
            Card(
                modifier = Modifier
                    .width(210.dp)
                    .wrapContentHeight()
                    .clickable { navController.navigate("Detail/${koin.id}") },
                shape = MaterialTheme.shapes.medium,
                colors = CardDefaults.cardColors(
                    containerColor = Color(0xffb5ffce).copy(alpha = 0.6f)
                )
            ) {
                Box(
                    modifier = Modifier
                        .padding(15.dp)
                ) {
                    Column {
                        Text(
                            text = koin.name,
                            fontWeight = FontWeight.Bold,
                            fontSize = 24.sp,
                            style = TextStyle(lineHeight = 0.sp),
                            modifier = Modifier.padding(bottom = 0.dp)
                        )
                        Text(
                            text = "${koin.secName}/IDR",
                            fontSize = 15.sp,
                            style = TextStyle(lineHeight = 0.sp),
                            modifier = Modifier.padding(top = 0.dp),
                            color = Color.Black.copy(alpha = 0.5f)
                        )
                        Spacer(modifier = Modifier.padding(top = 6.dp))
                        Card(
                            modifier = Modifier
                                .fillMaxWidth(),
                            shape = MaterialTheme.shapes.small,
                            colors = CardDefaults.cardColors(
                                containerColor = Color.Transparent
                            )
                        ) {
                            Box(modifier = Modifier
                                .background(color = Color.White),
                            ) {
                                Row(modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(3.dp),
                                    verticalAlignment = Alignment.CenterVertically,
                                    horizontalArrangement = Arrangement.Center
                                ) {
                                    Text(
                                        text = koin.priceNow
                                    )
                                }
                            }
                        }
                        Spacer(modifier = Modifier.padding(top = 6.dp))
                        Text(
                            text = "${koin.percent}%",
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Bold,
                            color = Profit
                        )
                    }
                }
            }
        }
    }
}