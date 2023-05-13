package com.example.photowerewolfandroid.standardGame.screen.subScreen

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.photowerewolfandroid.ui.theme.PhotoWerewolfAndroidTheme

@Composable
fun ConversationScreen() {
    Text(text ="話し合い画面")
}

@Preview(showBackground = true)
@Composable
fun ConversationScreenPreview() {
    PhotoWerewolfAndroidTheme {
        ConversationScreen()
    }
}