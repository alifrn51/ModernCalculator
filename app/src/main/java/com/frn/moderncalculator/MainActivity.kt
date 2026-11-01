package com.frn.moderncalculator

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.frn.moderncalculator.ui.theme.ModernCalculatorTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ModernCalculatorTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Calculator(
                        modifier = Modifier.padding(bottom = innerPadding.calculateBottomPadding())
                    )
                }
            }
        }
    }
}

@Composable
fun Calculator(modifier: Modifier = Modifier) {
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
                text = "45*8",
                modifier = Modifier.fillMaxWidth(),
                fontWeight = FontWeight.SemiBold,
                fontSize = 36.sp,
                textAlign = TextAlign.End,
                color = MaterialTheme.colorScheme.onPrimaryContainer
            )
            Text(
                text = "360",
                modifier = Modifier.fillMaxWidth(),
                fontWeight = FontWeight.SemiBold,
                fontSize = 17.sp,
                textAlign = TextAlign.End,
                color = MaterialTheme.colorScheme.onPrimaryContainer
            )

        }

        Column(
            modifier = modifier.padding(start = 16.dp, end = 15.dp, bottom = 16.dp), verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {

            Row(
                modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceAround
            ) {
                Text(
                    text = "√",
                    fontSize = 30.sp,
                    color = MaterialTheme.colorScheme.onBackground,
                    fontWeight = FontWeight.SemiBold,
                    textAlign = TextAlign.Center
                )
                Text(
                    text = "π",
                    fontSize = 30.sp,
                    color = MaterialTheme.colorScheme.onBackground,
                    fontWeight = FontWeight.SemiBold,
                    textAlign = TextAlign.Center
                )
                Text(
                    text = "^",
                    fontSize = 30.sp,
                    color = MaterialTheme.colorScheme.onBackground,
                    fontWeight = FontWeight.SemiBold,
                    textAlign = TextAlign.Center
                )
                Text(
                    text = "!",
                    fontSize = 30.sp,
                    color = MaterialTheme.colorScheme.onBackground,
                    fontWeight = FontWeight.SemiBold,
                    textAlign = TextAlign.Center
                )
            }

            Row(
                modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                CircleButton(
                    modifier = Modifier
                        .weight(1f)
                        .aspectRatio(1f),
                    text = "AC",
                    containerColor = MaterialTheme.colorScheme.secondary
                )
                CircleButton(
                    modifier = Modifier
                        .weight(1f)
                        .aspectRatio(1f),
                    text = "( )",
                    containerColor = MaterialTheme.colorScheme.tertiary
                )
                CircleButton(
                    modifier = Modifier
                        .weight(1f)
                        .aspectRatio(1f),
                    text = "%",
                    containerColor = MaterialTheme.colorScheme.tertiary
                )
                CircleButton(
                    modifier = Modifier
                        .weight(1f)
                        .aspectRatio(1f),
                    text = "÷",
                    containerColor = MaterialTheme.colorScheme.tertiary
                )
            }

            Row(
                modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                CircleButton(
                    modifier = Modifier
                        .weight(1f)
                        .aspectRatio(1f), text = "7"
                )
                CircleButton(
                    modifier = Modifier
                        .weight(1f)
                        .aspectRatio(1f), text = "8"
                )
                CircleButton(
                    modifier = Modifier
                        .weight(1f)
                        .aspectRatio(1f), text = "9"
                )
                CircleButton(
                    modifier = Modifier
                        .weight(1f)
                        .aspectRatio(1f),
                    text = "X",
                    containerColor = MaterialTheme.colorScheme.tertiary
                )
            }

            Row(
                modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {

                CircleButton(
                    modifier = Modifier
                        .weight(1f)
                        .aspectRatio(1f), text = "4"
                )
                CircleButton(
                    modifier = Modifier
                        .weight(1f)
                        .aspectRatio(1f), text = "5"
                )
                CircleButton(
                    modifier = Modifier
                        .weight(1f)
                        .aspectRatio(1f), text = "6"
                )
                CircleButton(
                    modifier = Modifier
                        .weight(1f)
                        .aspectRatio(1f),
                    text = "-",
                    containerColor = MaterialTheme.colorScheme.tertiary
                )


            }

            Row(
                modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {

                CircleButton(
                    modifier = Modifier
                        .weight(1f)
                        .aspectRatio(1f), text = "1"
                )
                CircleButton(
                    modifier = Modifier
                        .weight(1f)
                        .aspectRatio(1f), text = "2"
                )
                CircleButton(
                    modifier = Modifier
                        .weight(1f)
                        .aspectRatio(1f), text = "3"
                )
                CircleButton(
                    modifier = Modifier
                        .weight(1f)
                        .aspectRatio(1f),
                    text = "+",
                    containerColor = MaterialTheme.colorScheme.tertiary
                )


            }

            Row(
                modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {

                CircleButton(
                    modifier = Modifier
                        .weight(2f)
                        .aspectRatio(2f), text = "0"
                )
                CircleButton(
                    modifier = Modifier
                        .weight(1f)
                        .aspectRatio(1f), text = ","
                )
                CircleButton(
                    modifier = Modifier
                        .weight(1f)
                        .aspectRatio(1f),
                    text = "+",
                    containerColor = MaterialTheme.colorScheme.tertiary
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
fun CircleButton(
    modifier: Modifier = Modifier,
    containerColor: Color = MaterialTheme.colorScheme.primary,
    textColor: Color = MaterialTheme.colorScheme.onBackground,
    text: String
) {
    Box(
        modifier = modifier
            .clip(CircleShape)
            .background(containerColor),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = text, fontWeight = FontWeight.Normal, fontSize = 40.sp, color = textColor
        )

    }
}