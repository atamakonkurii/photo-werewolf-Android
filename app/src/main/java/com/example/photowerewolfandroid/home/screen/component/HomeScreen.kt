package com.example.photowerewolfandroid.home.screen.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.photowerewolfandroid.R
import com.example.photowerewolfandroid.ui.theme.PhotoWerewolfAndroidTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen() {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = "写真人狼")

        Image(
            painter = painterResource(R.drawable.photo_werewolf_icon),
            contentDescription = "写真人狼のアイコン",
            modifier = Modifier.size(128.dp),
        )

        Text(text = "コードを入力して部屋に入る")

        TextField(value = "" , onValueChange = {})

        Text(text = "もしくは")
        Button(onClick = { /*TODO*/ }) {
            Text(text = "部屋を作る")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    PhotoWerewolfAndroidTheme {
        HomeScreen()
    }
}