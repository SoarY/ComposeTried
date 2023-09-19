package com.soar.appcompose.composable

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SmallTopAppBar
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.soar.appcompose.R
import com.soar.appcompose.consta.ConstantTags

/**
 * NAME：YONG_
 * Created at: 2023/9/19 14
 * Describe:
 */
@Preview
@Composable
fun previewWidgetScreen(){
   Column {
      WidgetScreen()
   }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun WidgetScreen(){
   Scaffold(
      modifier = Modifier.testTag(ConstantTags.WIDGET_SCREEN_ROOT),
      topBar = {
         SmallTopAppBar(title = { Text(text = stringResource(id = R.string.navigation_item_widgets))})
      },
      content = {
         WidgetScreenContent(Modifier.padding(it))
      }
   )
}

@Composable
fun WidgetScreenContent(modifier: Modifier=Modifier) {
   LazyColumn(modifier=modifier){
      item {
         AllButtons()
         MListItem()
      }
   }
}