package com.soar.appcompose.composable

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

/**
 * NAME：YONG_
 * Created at: 2023/9/19 15
 * Describe:
 */
@Preview
@Composable
fun PreviewButtons() {
   Column {
      AllButtons()
   }
}

@Composable
fun AllButtons() {
   Text(text = "Buttons", modifier = Modifier.padding(8.dp))

   Row {
      Button(onClick = {},modifier=Modifier.padding(8.dp)) {
         Text(text = "Main Button")
      }
      TextButton(onClick = {},modifier=Modifier.padding(8.dp)) {
         Text(text = "Text Button")
      }
      TextButton(onClick = {},modifier=Modifier.padding(8.dp),enabled=false) {
         Text(text = "Text Disabled")
      }
   }
   Row {
      Button(onClick = {}, modifier = Modifier.padding(8.dp), enabled = false) {
         Text(text = "Disabled")
      }
      Button(
         onClick = {},
         modifier = Modifier.padding(8.dp),
         elevation = ButtonDefaults.buttonElevation()
      ) {
         Text(text = "Flat")
      }
      Button(
         onClick = {},
         modifier = Modifier.padding(8.dp),
         shape = RoundedCornerShape(12.dp)
      ) {
         Text(text = "Rounded")
      }
   }
   Row {
      OutlinedButton(onClick = {}, modifier = Modifier.padding(8.dp)) {
         Text(text = "Outline")
      }
      Button(onClick = {}, modifier = Modifier.padding(8.dp)) {
         Row {
            Icon(
               imageVector = Icons.Default.FavoriteBorder,
               contentDescription = null,
               modifier = Modifier.padding(end = 4.dp)
            )
            Text(text = "Icon Button")
         }
      }
   }

}