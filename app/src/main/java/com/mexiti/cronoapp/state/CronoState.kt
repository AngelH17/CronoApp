package com.mexiti.cronoapp.state

data class CronoState(
    val cronometroActivo: Boolean = false,
    val showSaveButton: Boolean = false,
    val showShowTextField: Boolean = false,
    val titlle: String = "",
)
