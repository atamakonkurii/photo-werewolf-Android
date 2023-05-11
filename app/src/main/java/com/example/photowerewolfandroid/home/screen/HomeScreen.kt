package com.example.photowerewolfandroid.home.screen.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.photowerewolfandroid.R
import com.example.photowerewolfandroid.ui.theme.PhotoWerewolfAndroidTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(navController: NavController) {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Text(
            text = "写真人狼",
            fontSize = 80.sp,
            modifier = Modifier
                .padding(top = 100.dp, bottom = 60.dp)
        )

        Image(
            painter = painterResource(R.drawable.photo_werewolf_icon),
            contentDescription = "写真人狼のアイコン",
            modifier = Modifier
                .size(160.dp)
        )

        Text(
            text = "コードを入力して部屋に入る",
            modifier = Modifier
                .padding(top = 30.dp, bottom = 20.dp)
        )

        TextField(value = "", onValueChange = {})

        Text(
            text = "もしくは",
            modifier = Modifier
                .padding(top = 30.dp, bottom = 20.dp)
        )

        Button(
            onClick = { navController.navigate("standardGame") },
            modifier = Modifier.size(200.dp, 70.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFFF58220),
                contentColor = Color.White
            )
        ) {
            Text(text = "部屋を作る", fontSize = 30.sp)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    PhotoWerewolfAndroidTheme {
        HomeScreen(navController = NavController(LocalContext.current))
    }
}