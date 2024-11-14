package com.example.tugaspribadi.view

import android.graphics.Paint.Align
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Info
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.tugaspribadi.R

@Composable
fun HalamanAbout(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(start = 17.dp, end = 17.dp)
    ) {
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight(),
            colors = CardDefaults.cardColors(
                containerColor = Color.White
            ),
            shape = MaterialTheme.shapes.large,
            border = BorderStroke(1.dp, Color(0xff978ef4))
        ) {
           Box(
               modifier = Modifier
                   .padding(start = 14.dp, end = 14.dp, top = 17.dp, bottom = 17.dp)
           ) {
               Column {
                   Row(
                       modifier = Modifier
                           .fillMaxWidth(),
                       verticalAlignment = Alignment.CenterVertically,
                       horizontalArrangement = Arrangement.SpaceBetween
                   ) {
                       Image(
                           painter = painterResource(id = R.drawable.profile),
                           contentDescription = "Profile",
                           modifier = Modifier
                               .size(70.dp)
                               .clip(RoundedCornerShape(100.dp)),
                       )
                       Column(
                           horizontalAlignment = Alignment.End
                       ) {
                           Text(
                               text = "Muhammad Afif Alfawwaz",
                               fontWeight = FontWeight.ExtraBold,
                               fontSize = 18.sp
                           )
                           Text(
                               text = "Politeknik Negeri Batam",
                               fontSize = 14.sp,
                               color = Color.Black.copy(alpha = 0.5f)
                           )
                       }
                   }
                   Spacer(modifier = Modifier.padding(top = 15.dp))
                   Row(
                       modifier = Modifier
                           .fillMaxWidth(),
                       horizontalArrangement = Arrangement.Center,
                       verticalAlignment = Alignment.CenterVertically
                   ) {
                       Box(
                           modifier = Modifier
                               .width(60.dp)
                               .height(0.7.dp)
                               .background(color = Color.Black.copy(alpha = 0.5f))
                       )
                       Text(
                           text = "Info lengkap",
                           fontSize = 15.sp,
                           color = Color.Black.copy(alpha = 0.5f),
                           modifier = Modifier.padding(start = 8.dp, end = 8.dp)
                       )
                       Box(
                           modifier = Modifier
                               .width(60.dp)
                               .height(0.7.dp)
                               .background(color = Color.Black.copy(alpha = 0.5f))
                       )
                   }
                   Spacer(modifier = Modifier.padding(top = 8.dp))
                   LazyVerticalGrid(
                       columns = GridCells.Fixed(2),
                       horizontalArrangement = Arrangement.spacedBy(25.dp),
                       verticalArrangement = Arrangement.spacedBy(5.dp)
                   ) {
                       item {
                           Column {
                               Row(
                                   modifier = Modifier
                                       .fillMaxWidth(),
                                   horizontalArrangement = Arrangement.SpaceBetween
                               ) {
                                   Text(
                                       text = "Email :",
                                       fontSize = 14.sp,
                                       color = Color.Black.copy(alpha = 0.5f)
                                   )
                                   Text(
                                       text = "pip@gmail.com",
                                       fontSize = 14.sp,
                                       modifier = Modifier
                                           .padding(start = 5.dp)
                                   )
                               }

                           }
                       }

                       item {
                           Column {
                               Row(
                                   modifier = Modifier
                                       .fillMaxWidth(),
                                   horizontalArrangement = Arrangement.SpaceBetween
                               ) {
                                   Text(
                                       text = "Jurusan :",
                                       fontSize = 14.sp,
                                       color = Color.Black.copy(alpha = 0.5f)
                                   )
                                   Text(
                                       text = "TRPL",
                                       fontSize = 14.sp,
                                       modifier = Modifier
                                           .padding(start = 5.dp)
                                   )
                               }

                           }
                       }
                       item {
                           Column {
                               Row(
                                   modifier = Modifier
                                       .fillMaxWidth(),
                                   horizontalArrangement = Arrangement.SpaceBetween
                               ) {
                                   Text(
                                       text = "No.HP :",
                                       fontSize = 14.sp,
                                       color = Color.Black.copy(alpha = 0.5f)
                                   )
                                   Text(
                                       text = "082163041381",
                                       fontSize = 14.sp,
                                       modifier = Modifier
                                           .padding(start = 5.dp)
                                   )
                               }

                           }
                       }

                       item {
                           Column {
                               Row(
                                   modifier = Modifier
                                       .fillMaxWidth(),
                                   horizontalArrangement = Arrangement.SpaceBetween
                               ) {
                                   Text(
                                       text = "Semester :",
                                       fontSize = 14.sp,
                                       color = Color.Black.copy(alpha = 0.5f)
                                   )
                                   Text(
                                       text = "3",
                                       fontSize = 14.sp,
                                       modifier = Modifier
                                           .padding(start = 5.dp)
                                   )
                               }

                           }
                       }
                   }
               }
           }
        }
        Spacer(modifier = Modifier.padding(top = 25.dp))
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight()
                .clickable { navController.navigate("Halaman Utama") },
            colors = CardDefaults.cardColors(
                containerColor = Color(0xFF978ef4)
            ),
            shape = MaterialTheme.shapes.large
        ) {
            Box(
                modifier = Modifier
                    .padding(top = 10.dp, bottom = 10.dp),
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center
                ) {
                    Icon(
                        imageVector = Icons.Filled.Email,
                        contentDescription = "Icon Mail",
                        tint = Color.White
                    )
                    Spacer(modifier = Modifier.padding(start = 6.dp))
                    Text(
                        text = "Jelajahi Crypto Sekarang!",
                        fontWeight = FontWeight.ExtraBold,
                        color = Color.White
                    )
                }
            }
        }
    }
}