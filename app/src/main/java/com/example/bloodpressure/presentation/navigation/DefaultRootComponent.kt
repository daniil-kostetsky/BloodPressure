package com.example.bloodpressure.presentation.navigation

import com.arkivanov.decompose.ComponentContext
import com.arkivanov.decompose.router.stack.ChildStack
import com.arkivanov.decompose.router.stack.StackNavigation
import com.arkivanov.decompose.router.stack.childStack
import com.arkivanov.decompose.router.stack.pop
import com.arkivanov.decompose.router.stack.push
import com.arkivanov.decompose.value.Value
import com.example.bloodpressure.BPItem
import com.example.bloodpressure.presentation.addEditRecord.DefaultAddEditRecordComponent
import com.example.bloodpressure.presentation.editRecord.DefaultEditRecordComponent
import com.example.bloodpressure.presentation.historyList.DefaultHistoryListComponent
import kotlinx.serialization.Serializable

class DefaultRootComponent(
    componentContext: ComponentContext
) : RootComponent, ComponentContext by componentContext {

    val navigation = StackNavigation<Config>()
    val stack: Value<ChildStack<Config, ComponentContext>> = childStack(
        source = navigation,
        serializer = Config.serializer(),
        handleBackButton = true,
        initialConfiguration = Config.HistoryList,
        childFactory = { config, context ->
            child(config, context)
        }

    )

    fun child(
        config: Config,
        componentContext: ComponentContext
    ): ComponentContext {
        return when (config) {
            is Config.AddRecord -> {
                DefaultAddEditRecordComponent(
                    componentContext = componentContext,
                    onSaved = {
                        navigation.pop()
                    }
                )
            }

            is Config.EditRecord -> {
                DefaultEditRecordComponent(
                    bpItem = config.bPItem,
                    componentContext = componentContext
                )
            }

            is Config.HistoryList -> {
                DefaultHistoryListComponent(
                    componentContext = componentContext,
                    onEditRecordRequest = {
                        navigation.push(Config.EditRecord(it))
                    }
                )
            }
        }
    }

    @Serializable
    sealed interface Config {

        @Serializable
        data object AddRecord : Config

        @Serializable
        data class EditRecord(val bPItem: BPItem) : Config

        @Serializable
        data object HistoryList : Config
    }
}