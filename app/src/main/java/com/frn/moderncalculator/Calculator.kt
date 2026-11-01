package com.frn.moderncalculator

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.frn.moderncalculator.ui.theme.ModernCalculatorTheme


private val viewModel = CalculatorViewModel()

@Composable
fun Calculator(modifier: Modifier = Modifier) {

    val state = viewModel.state.value

    Column(
        modifier = modifier.fillMaxSize(), verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .clip(RoundedCornerShape(bottomStart = 40.dp, bottomEnd = 40.dp))
                .background(MaterialTheme.colorScheme.primaryContainer)
                .weight(1f)
                .fillMaxWidth()
                .padding(end = 40.dp, bottom = 16.dp, start = 40.dp),
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.End
        ) {
            Text(
                text = state.expression,
                modifier = Modifier.fillMaxWidth(),
                fontWeight = FontWeight.SemiBold,
                fontSize = 36.sp,
                textAlign = TextAlign.End,
                color = MaterialTheme.colorScheme.onPrimaryContainer
            )
            Text(
                text = state.result,
                modifier = Modifier.fillMaxWidth(),
                fontWeight = FontWeight.SemiBold,
                fontSize = 17.sp,
                textAlign = TextAlign.End,
                color = MaterialTheme.colorScheme.onPrimaryContainer
            )

        }

        Column(
            modifier = modifier.padding(start = 16.dp, end = 15.dp, bottom = 16.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {

            Row(
                modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceAround
            ) {
                TextButton(
                    text = "√",
                    onClick = {
                        viewModel.processCommand(CalculatorCommand.Input(Symbol.SQRT))
                    }
                )
                TextButton(
                    text = "π",
                    onClick = {
                        viewModel.processCommand(CalculatorCommand.Input(Symbol.PI))
                    }
                )
                TextButton(
                    text = "^",
                    onClick = {
                        viewModel.processCommand(CalculatorCommand.Input(Symbol.POWER))
                    }
                )
                TextButton(
                    text = "!",
                    onClick = {
                        viewModel.processCommand(CalculatorCommand.Input(Symbol.FACTORIAL))
                    }
                )
            }

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                CircleButton(
                    modifier = Modifier
                        .weight(1f)
                        .aspectRatio(1f),
                    text = "AC",
                    containerColor = MaterialTheme.colorScheme.secondary,
                    onClick = {
                        viewModel.processCommand(CalculatorCommand.Clear)
                    }
                )
                CircleButton(
                    modifier = Modifier
                        .weight(1f)
                        .aspectRatio(1f),
                    text = "( )",
                    containerColor = MaterialTheme.colorScheme.tertiary,
                    onClick = {
                        viewModel.processCommand(CalculatorCommand.Input(Symbol.PARENTHESIS))
                    }
                )
                CircleButton(
                    modifier = Modifier
                        .weight(1f)
                        .aspectRatio(1f),
                    text = "%",
                    containerColor = MaterialTheme.colorScheme.tertiary,
                    onClick = {
                        viewModel.processCommand(CalculatorCommand.Input(Symbol.PERCENT))
                    }
                )
                CircleButton(
                    modifier = Modifier
                        .weight(1f)
                        .aspectRatio(1f),
                    text = "÷",
                    containerColor = MaterialTheme.colorScheme.tertiary,
                    onClick = {
                        viewModel.processCommand(CalculatorCommand.Input(Symbol.DIVIDE))
                    }
                )
            }

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                CircleButton(
                    modifier = Modifier
                        .weight(1f)
                        .aspectRatio(1f), text = "7",
                    onClick = {
                        viewModel.processCommand(CalculatorCommand.Input(Symbol.DIGIT_7))
                    }
                )
                CircleButton(
                    modifier = Modifier
                        .weight(1f)
                        .aspectRatio(1f), text = "8",
                    onClick = {
                        viewModel.processCommand(CalculatorCommand.Input(Symbol.DIGIT_8))
                    }
                )
                CircleButton(
                    modifier = Modifier
                        .weight(1f)
                        .aspectRatio(1f), text = "9",
                    onClick = {
                        viewModel.processCommand(CalculatorCommand.Input(Symbol.DIGIT_9))
                    }
                )
                CircleButton(
                    modifier = Modifier
                        .weight(1f)
                        .aspectRatio(1f),
                    text = "X",
                    containerColor = MaterialTheme.colorScheme.tertiary,
                    onClick = {
                        viewModel.processCommand(CalculatorCommand.Input(Symbol.MULTIPLY))
                    }
                )
            }

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {

                CircleButton(
                    modifier = Modifier
                        .weight(1f)
                        .aspectRatio(1f), text = "4",
                    onClick = {
                        viewModel.processCommand(CalculatorCommand.Input(Symbol.DIGIT_4))
                    }
                )
                CircleButton(
                    modifier = Modifier
                        .weight(1f)
                        .aspectRatio(1f), text = "5",
                    onClick = {
                        viewModel.processCommand(CalculatorCommand.Input(Symbol.DIGIT_5))
                    }
                )
                CircleButton(
                    modifier = Modifier
                        .weight(1f)
                        .aspectRatio(1f), text = "6",
                    onClick = {
                        viewModel.processCommand(CalculatorCommand.Input(Symbol.DIGIT_6))
                    }
                )
                CircleButton(
                    modifier = Modifier
                        .weight(1f)
                        .aspectRatio(1f),
                    text = "-",
                    containerColor = MaterialTheme.colorScheme.tertiary,
                    onClick = {
                        viewModel.processCommand(CalculatorCommand.Input(Symbol.SUBTRACT))
                    }
                )


            }

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {

                CircleButton(
                    modifier = Modifier
                        .weight(1f)
                        .aspectRatio(1f), text = "1",
                    onClick = {
                        viewModel.processCommand(CalculatorCommand.Input(Symbol.DIGIT_1))
                    }
                )
                CircleButton(
                    modifier = Modifier
                        .weight(1f)
                        .aspectRatio(1f), text = "2",
                    onClick = {
                        viewModel.processCommand(CalculatorCommand.Input(Symbol.DIGIT_2))
                    }
                )
                CircleButton(
                    modifier = Modifier
                        .weight(1f)
                        .aspectRatio(1f), text = "3",
                    onClick = {
                        viewModel.processCommand(CalculatorCommand.Input(Symbol.DIGIT_3))
                    }
                )
                CircleButton(
                    modifier = Modifier
                        .weight(1f)
                        .aspectRatio(1f),
                    text = "+",
                    containerColor = MaterialTheme.colorScheme.tertiary,
                    onClick = {
                        viewModel.processCommand(CalculatorCommand.Input(Symbol.ADD))
                    }
                )


            }

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {

                CircleButton(
                    modifier = Modifier
                        .weight(2f)
                        .aspectRatio(2f), text = "0",
                    onClick = {
                        viewModel.processCommand(CalculatorCommand.Input(Symbol.DIGIT_0))
                    }
                )
                CircleButton(
                    modifier = Modifier
                        .weight(1f)
                        .aspectRatio(1f), text = ",",
                    onClick = {
                        viewModel.processCommand(CalculatorCommand.Input(Symbol.DOT))
                    }
                )
                CircleButton(
                    modifier = Modifier
                        .weight(1f)
                        .aspectRatio(1f),
                    text = "=",
                    containerColor = MaterialTheme.colorScheme.tertiary,
                    onClick = {
                        viewModel.processCommand(CalculatorCommand.Evaluate)
                    }
                )


            }

        }


    }
}

@Preview(showBackground = true)
@Composable
private fun CalculatorPreview() {
    ModernCalculatorTheme {
        Calculator()
    }
}

@Composable
fun TextButton(
    modifier: Modifier = Modifier,
    onClick: () -> Unit,
    size: Dp = 38.dp,
    text: String,
    textColor: Color = MaterialTheme.colorScheme.onBackground
) {
    Box(
        modifier = modifier
            .size(size)
            .clip(CircleShape)
            .clickable {
                onClick()
            },
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = text,
            fontWeight = FontWeight.Normal,
            fontSize = 34.sp,
            color = textColor,
            textAlign = TextAlign.Center
        )

    }
}

@Composable
fun CircleButton(
    modifier: Modifier = Modifier,
    containerColor: Color = MaterialTheme.colorScheme.primary,
    textColor: Color = MaterialTheme.colorScheme.onBackground,
    text: String,
    onClick: () -> Unit
) {
    Box(
        modifier = modifier
            .clip(CircleShape)
            .clickable {
                onClick()
            }
            .background(containerColor),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = text, fontWeight = FontWeight.Normal, fontSize = 40.sp, color = textColor
        )

    }
}