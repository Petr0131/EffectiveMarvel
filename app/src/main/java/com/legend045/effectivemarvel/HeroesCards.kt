package com.legend045.effectivemarvel

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun HeroesCards(Hero: HeroesRowModel) {
    Box(
        contentAlignment = Alignment.BottomStart,
        modifier = Modifier
            .padding(12.dp)
            .size(width = 385.dp, height = 420.dp),
    ){

        Image(
            painter = painterResource(id = Hero.imageId),
            contentDescription = "Heroes image",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .clip(RoundedCornerShape(20.dp))
        )

        Text(
            text = Hero.heroesName,
            fontSize = 25.sp,
            letterSpacing= 0.005.sp,
            fontWeight= FontWeight.Bold,
            color= Color.White,
            textAlign = TextAlign.Left,
            modifier = Modifier
                .padding(10.dp)
                .fillMaxWidth(1f),
        )
    }
}