package com.example.photowerewolfandroid.standardGame.screen

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
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
import com.example.photowerewolfandroid.standardGame.viewModel.StandardGameViewModel
import com.example.photowerewolfandroid.ui.theme.PhotoWerewolfAndroidTheme

@Composable
fun StandardGameScreen(
    navController: NavController,
    viewModel: StandardGameViewModel,
) {

    val roomStatus by viewModel.roomStatus.collectAsState()

    /// ステータスによって画面を切り替える
    when (roomStatus) {
        StandardGameRoomStatus.Waiting -> WaitingRoomScreen()
        StandardGameRoomStatus.PhotoSelect -> PhotoSelectScreen()
        StandardGameRoomStatus.CheckRole -> CheckRoleScreen()
        StandardGameRoomStatus.Conversation -> ConversationScreen()
        StandardGameRoomStatus.Vote -> VoteScreen()
        StandardGameRoomStatus.Result -> ResultScreen()
    }
}

@Preview(showBackground = true)
@Composable
fun StandardGameWaitingScreenPreview() {
    val viewModel = StandardGameViewModel()

    PhotoWerewolfAndroidTheme {
        StandardGameScreen(
            navController = NavController(LocalContext.current),
            viewModel = viewModel,
        )
    }
}

@Preview(showBackground = true)
@Composable
fun StandardGamePhotoSelectScreenPreview() {
    val viewModel = StandardGameViewModel()

    PhotoWerewolfAndroidTheme {
        StandardGameScreen(
            navController = NavController(LocalContext.current),
            viewModel = viewModel,
        )
    }
}

@Preview(showBackground = true)
@Composable
fun StandardGameCheckRoleScreenPreview() {
    val viewModel = StandardGameViewModel()

    PhotoWerewolfAndroidTheme {
        StandardGameScreen(
            navController = NavController(LocalContext.current),
            viewModel = viewModel,
        )
    }
}

@Preview(showBackground = true)
@Composable
fun StandardGameConversationScreenPreview() {
    val viewModel = StandardGameViewModel()

    PhotoWerewolfAndroidTheme {
        StandardGameScreen(
            navController = NavController(LocalContext.current),
            viewModel = viewModel,
        )
    }
}

@Preview(showBackground = true)
@Composable
fun StandardGameVoteScreenPreview() {
    val viewModel = StandardGameViewModel()

    PhotoWerewolfAndroidTheme {
        StandardGameScreen(
            navController = NavController(LocalContext.current),
            viewModel = viewModel,
        )
    }
}

@Preview(showBackground = true)
@Composable
fun StandardGameResultScreenPreview() {
    val viewModel = StandardGameViewModel()

    PhotoWerewolfAndroidTheme {
        StandardGameScreen(
            navController = NavController(LocalContext.current),
            viewModel = viewModel,
        )
    }
}