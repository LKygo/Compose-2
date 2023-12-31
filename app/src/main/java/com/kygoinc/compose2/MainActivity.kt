package com.kygoinc.compose2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val fontPoppins = FontFamily(
            Font(R.font.poppins_thin, FontWeight.Thin),
            Font(R.font.poppins_extralight, FontWeight.ExtraLight),
            Font(R.font.poppins_light, FontWeight.Light),
            Font(R.font.poppins_regular, FontWeight.Normal),
            Font(R.font.poppins_medium, FontWeight.Medium),
            Font(R.font.poppins_semibold, FontWeight.SemiBold),
            Font(R.font.poppins_bold, FontWeight.Bold),
        )

        setContent {
            Column {
                Text(
                    text = "Hey Lee! We're gonna cover image views today.",
                    modifier = Modifier
                        .padding(15.dp)
                )

                val painter = painterResource(id = R.drawable.charles)
                val title = " Charles Leclerc"
                val contentDescription = "Charles Leclerc 16"

                Row {

                    Column {
                        Box(
                            modifier = Modifier
                                .fillMaxWidth(0.5f)
                                .padding(12.dp)
                        ) {
                            ImageView(
                                painter = painter,
                                contentDescription = contentDescription,
                                title = title
                            )
                        }

                    }

                    Column {
                        Box(
                            modifier = Modifier
                                .fillMaxWidth(1f)
                                .padding(12.dp)
                        ) {
                            ImageView(
                                painter = painterResource(id = R.drawable.carlos),
                                contentDescription = "Carlos Sainz Jr",
                                title = "Carlos Sainz Jr"
                            )
                        }

                    }
                }

                Row {
                    Column {
                        Box(
                            modifier = Modifier
                                .fillMaxWidth(0.5f)
                                .padding(12.dp)
                        ) {
                            ImageView(
                                painter = painterResource(id = R.drawable.f150),
                                contentDescription = "2022's F1-50",
                                title = "2022's F1-50"
                            )
                        }
                    }

                    Column {
                        Box(
                            modifier = Modifier
                                .fillMaxWidth(1f)
                                .padding(12.dp)
                        ) {
                            ImageView(
                                painter = painterResource(id = R.drawable.sf23),
                                contentDescription = "2023's SF-23",
                                title = "2023's SF-23"
                            )
                        }

                    }


                }

                Row(
                    modifier = Modifier
                        .padding(0.dp, 20.dp)
                ) {
                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                            .background(Color(0xFF101010))
                            .padding(12.dp)
                    ) {
                        Text(
                            text = buildAnnotatedString {
                                withStyle(
                                    style = SpanStyle(
                                        color = Color.Magenta,
                                        fontSize = 30.sp
                                    )

                                ) {
                                    append("K")
                                }
                                append("ygo ")
                                withStyle(
                                    style = SpanStyle(
                                        color = Color.Magenta,
                                        fontSize = 30.sp
                                    )

                                ) {
                                    append("i")
                                }
                                append("nc ")
                            },
                            color = Color.White,
                            fontSize = 18.sp,
                            fontFamily = fontPoppins,
                            fontWeight = FontWeight.Bold,
                            fontStyle = FontStyle.Italic,
                            textAlign = TextAlign.Center,
                            textDecoration = TextDecoration.Underline
                        )
                    }
                }
            }
        }
    }
}


@Composable
fun ImageView(
    painter: Painter, contentDescription: String, title: String, modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier.fillMaxWidth(),
        shape = RoundedCornerShape(15.dp),
        elevation = CardDefaults.cardElevation(15.dp)
    ) {

        Box(modifier = Modifier.height(200.dp)) {

            Image(
                painter = painter,
                contentDescription = contentDescription,
                contentScale = ContentScale.Crop
            )
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(
                        Brush.verticalGradient(
                            colors = listOf(
                                Color.Transparent,
                                Color.White
                            ),
                            startY = 300f

                        )
                    )
            )
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(12.dp),
                contentAlignment = Alignment.BottomStart
            ) {
                Text(title, style = TextStyle(color = Color.Black, fontSize = 16.sp))
            }
        }
    }

}


