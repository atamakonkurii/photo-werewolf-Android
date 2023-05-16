package com.example.photowerewolfandroid.standardGame.viewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.photowerewolfandroid.standardGame.utils.StandardGameRoomStatus
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class StandardGameViewModel @Inject constructor() : ViewModel() {
    private val _roomStatus = MutableStateFlow(StandardGameRoomStatus.Waiting)
    val roomStatus: StateFlow<StandardGameRoomStatus> = _roomStatus

    init {
        viewModelScope.launch {
            _roomStatus.value = StandardGameRoomStatus.Waiting
        }
    }
}