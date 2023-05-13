package com.example.photowerewolfandroid.standardGame.screen.subScreen

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.photowerewolfandroid.ui.theme.PhotoWerewolfAndroidTheme

@Composable
fun CheckRoleScreen() {
    Text(text ="役職確認画面")
}

@Preview(showBackground = true)
@Composable
fun CheckRoleScreenPreview() {
    PhotoWerewolfAndroidTheme {
        CheckRoleScreen()
    }
}