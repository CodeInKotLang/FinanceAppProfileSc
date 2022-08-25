package com.synac.financeappprofile

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.synac.financeappprofile.ui.theme.CustomDarkGray
import com.synac.financeappprofile.ui.theme.CustomLightGreen
import com.synac.financeappprofile.ui.theme.CustomOrange

@Composable
fun ProfileScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(
                brush = Brush.verticalGradient(
                    listOf(CustomDarkGray, CustomLightGreen)
                )
            )
            .padding(25.dp),
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            IconButton(onClick = { /*TODO*/ }) {
                Icon(
                    painter = painterResource(R.drawable.more),
                    contentDescription = "More",
                    tint = Color.White,
                    modifier = Modifier.size(30.dp)
                )
            }
            Box(
                modifier = Modifier
                    .size(50.dp)
                    .border(
                        width = 1.dp,
                        color = CustomOrange,
                        shape = RoundedCornerShape(20f)
                    ),
                contentAlignment = Alignment.Center
            ) {
                Image(
                    painter = painterResource(R.drawable.david),
                    contentDescription = "Profile",
                    modifier = Modifier
                        .size(40.dp)
                        .clip(RoundedCornerShape(5.dp))
                )
            }
        }
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            IconButton(onClick = { /*TODO*/ }) {
                Icon(
                    painter = painterResource(R.drawable.home),
                    contentDescription = "Home",
                    tint = Color.White,
                    modifier = Modifier.size(30.dp)
                )
            }
            IconButton(onClick = { /*TODO*/ }) {
                Icon(
                    painter = painterResource(R.drawable.wallet),
                    contentDescription = "Wallet",
                    tint = Color.White,
                    modifier = Modifier.size(30.dp)
                )
            }
            IconButton(onClick = { /*TODO*/ }) {
                Icon(
                    painter = painterResource(R.drawable.finance),
                    contentDescription = "Finance",
                    tint = Color.White,
                    modifier = Modifier.size(30.dp)
                )
            }
            IconButton(onClick = { /*TODO*/ }) {
                Icon(
                    painter = painterResource(R.drawable.user),
                    contentDescription = "User",
                    tint = Color.White,
                    modifier = Modifier.size(30.dp)
                )
            }
        }
    }
}


@Preview
@Composable
fun Prev() {
    ProfileScreen()
}