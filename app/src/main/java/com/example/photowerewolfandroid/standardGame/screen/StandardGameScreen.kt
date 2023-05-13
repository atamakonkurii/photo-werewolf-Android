package com.example.photowerewolfandroid.standardGame.screen

import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import com.example.photowerewolfandroid.standardGame.screen.subScreen.CheckRoleScreen
import com.example.photowerewolfandroid.standardGame.screen.subScreen.ConversationScreen
import com.example.photowerewolfandroid.standardGame.screen.subScreen.PhotoSelectScreen
import com.example.photowerewolfandroid.standardGame.screen.subScreen.ResultScreen
import com.example.photowerewolfandroid.standardGame.screen.subScreen.VoteScreen
import com.example.photowerewolfandroid.standardGame.screen.subScreen.WaitingRoomScreen
import com.example.photowerewolfandroid.standardGame.utils.StandardGameRoomStatus
import com.example.photowerewolfandroid.ui.theme.PhotoWerewolfAndroidTheme

@Composable
fun StandardGameScreen(
    navController: NavController,
    roomStatus: StandardGameRoomStatus = StandardGameRoomStatus.Waiting
) {
     /// ステータスによって画面を切り替える
     when (roomStatus) {
         StandardGameRoomStatus.Waiting -> WaitingRoomScreen()
         StandardGameRoomStatus.PhotoSelect-> PhotoSelectScreen()
         StandardGameRoomStatus.CheckRole -> CheckRoleScreen()
         StandardGameRoomStatus.Conversation -> ConversationScreen()
         StandardGameRoomStatus.Vote -> VoteScreen()
         StandardGameRoomStatus.Result -> ResultScreen()
     }
}

@Preview(showBackground = true)
@Composable
fun StandardGameWaitingScreenPreview() {
    PhotoWerewolfAndroidTheme {
        StandardGameScreen(
            navController = NavController(LocalContext.current),
            roomStatus = StandardGameRoomStatus.Waiting)
    }
}

@Preview(showBackground = true)
@Composable
fun StandardGamePhotoSelectScreenPreview() {
    PhotoWerewolfAndroidTheme {
        StandardGameScreen(
            navController = NavController(LocalContext.current),
            roomStatus = StandardGameRoomStatus.PhotoSelect)
    }
}

@Preview(showBackground = true)
@Composable
fun StandardGameCheckRoleScreenPreview() {
    PhotoWerewolfAndroidTheme {
        StandardGameScreen(
            navController = NavController(LocalContext.current),
            roomStatus = StandardGameRoomStatus.CheckRole)
    }
}

@Preview(showBackground = true)
@Composable
fun StandardGameConversationScreenPreview() {
    PhotoWerewolfAndroidTheme {
        StandardGameScreen(
            navController = NavController(LocalContext.current),
            roomStatus = StandardGameRoomStatus.Conversation)
    }
}

@Preview(showBackground = true)
@Composable
fun StandardGameVoteScreenPreview() {
    PhotoWerewolfAndroidTheme {
        StandardGameScreen(
            navController = NavController(LocalContext.current),
            roomStatus = StandardGameRoomStatus.Vote)
    }
}

@Preview(showBackground = true)
@Composable
fun StandardGameResultScreenPreview() {
    PhotoWerewolfAndroidTheme {
        StandardGameScreen(
            navController = NavController(LocalContext.current),
            roomStatus = StandardGameRoomStatus.Result)
    }
}