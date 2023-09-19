package com.soar.appcompose.activity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.guru.fontawesomecomposelib.FaIcon
import com.guru.fontawesomecomposelib.FaIcons
import com.soar.appcompose.R
import com.soar.appcompose.composable.HomeScreen
import com.soar.appcompose.composable.WidgetScreen
import com.soar.appcompose.consta.BottomNavType
import com.soar.appcompose.consta.ConstantTags
import com.soar.appcompose.ui.theme.AppComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppComposeTheme {
                contentView()
            }
        }
    }
}

@Preview
@Composable
fun previewContentView(){
    Column {
        contentView()
    }
}

@Composable
fun contentView() {
    val stateTypeState = rememberSaveable { mutableStateOf(BottomNavType.WIDGETS) }
    val bottomNavBarContentDescription=stringResource(id = R.string.app_name)

    Column {
        HomeScreenContent(
            stateTypeState.value,
            Modifier.weight(1F)
        )
        BottomNavigationContent(
            modifier = Modifier
                .semantics { contentDescription = bottomNavBarContentDescription }
                .testTag(ConstantTags.BOTTOM_NAV_TEST_TAG),
            stateTypeState = stateTypeState
        )
    }
}

@Composable
fun HomeScreenContent(
    stateType: BottomNavType,
    modifier: Modifier
) {
    Column(modifier = modifier) {
        Surface(color = MaterialTheme.colorScheme.background) {
            when (stateType) {
                BottomNavType.HOME -> HomeScreen()
                BottomNavType.WIDGETS -> WidgetScreen()
            }
        }
    }
}

@Composable
fun BottomNavigationContent(modifier: Modifier, stateTypeState: MutableState<BottomNavType>) {
    NavigationBar(modifier) {
        NavigationBarItem(
            selected = stateTypeState.value == BottomNavType.WIDGETS,
            onClick = {
                stateTypeState.value = BottomNavType.WIDGETS
            },
            icon = {
                FaIcon(
                    faIcon = FaIcons.Tools
                )
            },
            label ={
                Text(
                    text = stringResource(id = R.string.navigation_item_widgets),
                    style = TextStyle(fontSize = 12.sp)
                )
            }
        )
        NavigationBarItem(
            selected = stateTypeState.value == BottomNavType.HOME,
            onClick = {
                stateTypeState.value = BottomNavType.HOME
            },
            icon = {
                FaIcon(
                    faIcon = FaIcons.Home
                )
            },
            label ={
                Text(
                    text = stringResource(id = R.string.navigation_item_home),
                    style = TextStyle(fontSize = 12.sp)
                )
            }
        )
    }
}


