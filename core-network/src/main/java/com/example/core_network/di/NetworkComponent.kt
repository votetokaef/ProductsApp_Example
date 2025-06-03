package com.example.core_network.di

import com.example.core_network_api.NetworkApi
import com.example.core_utils.di.ApplicationScope
import dagger.Component

@ApplicationScope
@Component(
    dependencies = [NetworkDeps::class],
    modules = [NetworkModule::class]
)
internal interface NetworkComponent : NetworkApi {

    companion object {
        fun initAndGet(dependencies: NetworkDeps): NetworkComponent {
            return DaggerNetworkComponent.factory().create(dependencies)
        }
    }

    @Component.Factory
    interface Factory {
        fun create(dependencies: NetworkDeps): NetworkComponent
    }
}