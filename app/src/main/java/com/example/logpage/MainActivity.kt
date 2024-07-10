package com.example.logpage

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.fontResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.logpage.ui.theme.MyBlack
import com.example.logpage.ui.theme.MyOrange
import com.example.logpage.ui.theme.MyWhite
import com.example.logpage.ui.theme.MyWhiteOrange

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            GreetingPreview()
        }
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    val FontFamil = FontFamily(
        Font(R.font.gentona_extrabold, FontWeight.Bold)
    )

    Column (
        modifier = Modifier
            .fillMaxSize()
            .background(MyWhite),
        verticalArrangement = Arrangement.Bottom
    ) {
        Row (
            modifier = Modifier
                .weight(3f)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.Center,
        ) {

            Column (
                modifier = Modifier
                    .fillMaxHeight(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(id = R.drawable.logo),
                    contentDescription = "Logo",
                    modifier = Modifier
                        .height(150.dp)
                        .width(150.dp)
                )
                Text(
                    text = "Ласкаво просимо у",
                    color = MyBlack,
                    fontSize = 30.sp,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = "Yoky",
                    color = MyOrange,
                    fontSize = 30.sp,
                    fontWeight = FontWeight.Bold
                )
            }
        }

        Card (
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
                .background(MyWhite),
            colors = CardDefaults.cardColors(
                containerColor = MyOrange
            ),
            shape = RoundedCornerShape(topStart = 30.dp, topEnd = 30.dp)
        ) {
            Column (
                modifier = Modifier
                    .fillMaxSize()
                    .padding(20.dp),
                verticalArrangement = Arrangement.SpaceAround,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Button(
                    onClick = { /* TODO: Handle new account registration */ },
                    colors = ButtonDefaults.buttonColors(MyWhiteOrange),
                    shape = RoundedCornerShape(17.dp),
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxWidth()
                ) {
                    Text(
                        text = "Реєстрація нового акаунту",
                        color = MyBlack,
                        fontSize = 17.sp
                    )
                }

                Spacer(
                    modifier = Modifier
                        .height(20.dp)
                )

                Button(
                    onClick = { /* TODO: Handle existing account login */ },
                    colors = ButtonDefaults.buttonColors(MyWhite),
                    shape = RoundedCornerShape(17.dp),
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxWidth()
                ) {
                    Text(
                        text = "Увійти до існуючого акаунту",
                        color = MyBlack,
                        fontSize = 17.sp
                    )
                }
            }
        }
    }
}