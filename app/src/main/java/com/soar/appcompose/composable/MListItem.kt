package com.soar.appcompose.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Divider
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Icon
import androidx.compose.material.ListItem
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.soar.appcompose.R

/**
 * NAME：YONG_
 * Created at: 2023/9/19 16
 * Describe:
 */
@Preview
@Composable
fun PreviewMListItem() {
    Column {
     MListItem()
    }
}

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun MListItem() {
    ListItem(
        icon = {
             Image(
                 painter = painterResource(id = (R.mipmap.p1)),
                 contentDescription = null)
        },
        text = {
            Text(text = "item")
        },
        secondaryText = {
            Text(text = "secondaryText")
        }
    )
    Divider(modifier = Modifier.padding(4.dp))
    ListItem(
        icon = {
             Image(
                 painter = painterResource(id = (R.mipmap.p2)),
                 contentDescription = null)
        },
        text = {
            Text(text = "item")
        },
        secondaryText = {
            Text(text = "secondaryText")
        },
        overlineText ={
            Text(text = "overlineText")
        }
    )
    Divider(modifier = Modifier.padding(4.dp))
    ListItem(
        icon = {
             Image(
                 painter = painterResource(id = (R.mipmap.p3)),
                 contentDescription = null)
        },
        text = {
            Text(text = "item")
        },
        secondaryText = {
            Text(text = "secondaryText")
        },
        trailing = {
            Icon(Icons.Default.ShoppingCart, contentDescription = null)
        }
    )
    Divider(modifier = Modifier.padding(4.dp))
}