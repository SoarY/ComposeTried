package com.soar.appcompose.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SmallTopAppBar
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.soar.appcompose.R

/**
 * NAME：YONG_
 * Created at: 2023/9/19 14
 * Describe:
 */
@Preview
@Composable
fun previewHomeScreen(){
   Column {
      HomeScreen()
   }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(){
   Scaffold(topBar = {
      SmallTopAppBar(title = { 
         Text(text = stringResource(id = R.string.navigation_item_home))
      })
   }, content = {
      Column(Modifier.padding(it)) {
         Image(painter = painterResource(id = R.mipmap.p4), contentDescription = null)
      }
   })
}