package com.frn.moderncalculator

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlin.random.Random

class CalculatorViewModel : ViewModel() {

    private val _state: MutableStateFlow<ScreenState> = MutableStateFlow(
        ScreenState.Initial
    )
    val state = _state.asStateFlow()

    fun processCommand(command: CalculatorCommand) {
        when (command) {
            CalculatorCommand.Clear -> {
                _state.value = ScreenState.Initial
            }

            CalculatorCommand.Evaluate -> {
                val isError = Random.nextBoolean()
                _state.value = if (isError) {
                    ScreenState.Error(expression = "100")
                } else {
                    ScreenState.Success(result = "100")
                }
            }

            is CalculatorCommand.Input -> {
                _state.value = ScreenState.Input(expression = command.symbol.name, result = "100")
            }
        }
    }

}

sealed interface ScreenState {
    data object Initial : ScreenState

    data class Error(val expression: String) : ScreenState
    data class Success(val result: String) : ScreenState
    data class Input(val expression: String, val result: String) : ScreenState
}

data class Display(
    val expression: String,
    val result: String
)

sealed interface CalculatorCommand {
    data object Clear : CalculatorCommand
    data object Evaluate : CalculatorCommand
    data class Input(val symbol: Symbol) : CalculatorCommand
}

enum class Symbol {
    DIGIT_0,
    DIGIT_1,
    DIGIT_2,
    DIGIT_3,
    DIGIT_4,
    DIGIT_5,
    DIGIT_6,
    DIGIT_7,
    DIGIT_8,
    DIGIT_9,
    ADD,
    SUBTRACT,
    MULTIPLY,
    DIVIDE,
    PERCENT,
    POWER,
    FACTORIAL,
    SQRT,
    PI,
    DOT,
    PARENTHESIS
}