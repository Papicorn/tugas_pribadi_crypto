package com.example.tugaspribadi.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tugaspribadi.data.DataSemuaKoin
import com.example.tugaspribadi.data.Profit
import com.example.tugaspribadi.model.ModelSemuaKoin

@Composable
fun HalamanDetail(coinID: Int) {
    val koin = DataSemuaKoin.semuaKoin.find { it.id == coinID }
    if (koin != null) {
        Column(
            modifier = Modifier
                .padding(start = 17.dp, end = 17.dp)
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentHeight()
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth(),
                    verticalAlignment = Alignment.Top
                ) {
                    Image(
                        painter = painterResource(id = koin.photo),
                        contentDescription = koin.name,
                        modifier = Modifier
                            .size(90.dp)
                    )
                    Column(
                        modifier = Modifier
                            .padding(start = 13.dp)
                    ) {
                        Text(
                            text = koin.name,
                            fontSize = 22.sp,
                            fontWeight = FontWeight.ExtraBold
                        )
                        Text(
                            text = koin.secName + "/IDR",
                            fontSize = 15.sp,
                            color = Color.Black.copy(alpha = 0.5f)
                        )
                        Text(
                            text = koin.priceNow,
                            fontWeight = FontWeight.Bold,
                            fontSize = 23.sp
                        )
                    }
                }
            }
            Spacer(modifier = Modifier.padding(top = 20.dp))
            LazyVerticalGrid(
                columns = GridCells.Fixed(2),
                horizontalArrangement = Arrangement.spacedBy(10.dp),
                verticalArrangement = Arrangement.spacedBy(10.dp)
            ) {
                item {
                    Card(
                        modifier = Modifier
                            .fillMaxWidth()
                            .wrapContentHeight(),
                        colors = CardDefaults.cardColors(
                            containerColor = Color.Gray.copy(alpha = 0.1f)
                        ),
                        shape = MaterialTheme.shapes.small
                    ) {
                        Box(
                            modifier = Modifier
                                .padding(start = 10.dp, end = 10.dp, top = 12.dp, bottom = 12.dp)
                        ) {
                            Column(
                                modifier = Modifier
                                    .fillMaxWidth(),
                                horizontalAlignment = Alignment.CenterHorizontally,
                                verticalArrangement = Arrangement.Center
                            ) {
                                Text(
                                    text = "Kap pasar",
                                    fontWeight = FontWeight.Bold,
                                    color = Color.Black.copy(alpha = 0.5f)
                                )
                                Spacer(modifier = Modifier.padding(top = 9.dp))
                                Row {
                                    Text(
                                        text = "Rp ${koin.kapPasar}",
                                        fontWeight = FontWeight.Bold,
                                        fontSize = 18.sp
                                    )
                                    Text(
                                        text = "${koin.percent}%",
                                        color = Profit,
                                        fontSize = 13.sp,
                                        modifier = Modifier
                                            .padding(start = 5.dp)
                                    )
                                }
                            }
                        }
                    }
                }
                item {
                    Card(
                        modifier = Modifier
                            .fillMaxWidth()
                            .wrapContentHeight(),
                        colors = CardDefaults.cardColors(
                            containerColor = Color.Gray.copy(alpha = 0.1f)
                        ),
                        shape = MaterialTheme.shapes.small
                    ) {
                        Box(
                            modifier = Modifier
                                .padding(start = 10.dp, end = 10.dp, top = 12.dp, bottom = 12.dp)
                        ) {
                            Column(
                                modifier = Modifier
                                    .fillMaxWidth(),
                                horizontalAlignment = Alignment.CenterHorizontally,
                                verticalArrangement = Arrangement.Center
                            ) {
                                Text(
                                    text = "FDV",
                                    fontWeight = FontWeight.Bold,
                                    color = Color.Black.copy(alpha = 0.5f)
                                )
                                Spacer(modifier = Modifier.padding(top = 9.dp))
                                Row {
                                    Text(
                                        text = "Rp ${koin.fdv}",
                                        fontWeight = FontWeight.Bold,
                                        fontSize = 18.sp
                                    )
                                }
                            }
                        }
                    }
                }
                item {
                    Card(
                        modifier = Modifier
                            .fillMaxWidth()
                            .wrapContentHeight(),
                        colors = CardDefaults.cardColors(
                            containerColor = Color.Gray.copy(alpha = 0.1f)
                        ),
                        shape = MaterialTheme.shapes.small
                    ) {
                        Box(
                            modifier = Modifier
                                .padding(start = 10.dp, end = 10.dp, top = 12.dp, bottom = 12.dp)
                        ) {
                            Column(
                                modifier = Modifier
                                    .fillMaxWidth(),
                                horizontalAlignment = Alignment.CenterHorizontally,
                                verticalArrangement = Arrangement.Center
                            ) {
                                Text(
                                    text = "Vol/Mkt Cap (24h)",
                                    fontWeight = FontWeight.Bold,
                                    color = Color.Black.copy(alpha = 0.5f)
                                )
                                Spacer(modifier = Modifier.padding(top = 9.dp))
                                Row {
                                    Text(
                                        text = "${koin.mkt}%",
                                        fontWeight = FontWeight.Bold,
                                        fontSize = 18.sp
                                    )
                                }
                            }
                        }
                    }
                }
                item {
                    Card(
                        modifier = Modifier
                            .fillMaxWidth()
                            .wrapContentHeight(),
                        colors = CardDefaults.cardColors(
                            containerColor = Color.Gray.copy(alpha = 0.1f)
                        ),
                        shape = MaterialTheme.shapes.small
                    ) {
                        Box(
                            modifier = Modifier
                                .padding(start = 10.dp, end = 10.dp, top = 12.dp, bottom = 12.dp)
                        ) {
                            Column(
                                modifier = Modifier
                                    .fillMaxWidth(),
                                horizontalAlignment = Alignment.CenterHorizontally,
                                verticalArrangement = Arrangement.Center
                            ) {
                                Text(
                                    text = "Suplai total",
                                    fontWeight = FontWeight.Bold,
                                    color = Color.Black.copy(alpha = 0.5f)
                                )
                                Spacer(modifier = Modifier.padding(top = 9.dp))
                                Row {
                                    Text(
                                        text = "${koin.suplaiTotal} ${koin.secName}",
                                        fontWeight = FontWeight.Bold,
                                        fontSize = 18.sp
                                    )
                                }
                            }
                        }
                    }
                }
            }
            Spacer(modifier = Modifier.padding(top = 30.dp))
            Box {
                Column(

                ) {
                    Text(
                        text = "Apa itu ${koin.name}?",
                        fontWeight = FontWeight.ExtraBold,
                        fontSize = 17.sp,
                        color = Color.Black.copy(alpha = 0.6f)
                    )
                    Spacer(modifier = Modifier.padding(top = 9.dp))
                    LazyColumn {
                        item {
                            Text(
                                text = koin.desc,
                                fontSize = 13.sp,
                                color = Color.Black.copy(alpha = 0.5f)
                            )
                        }
                    }
                }
            }
        }
    }
}