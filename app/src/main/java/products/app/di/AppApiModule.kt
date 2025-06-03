package products.app.di

import products.app.Application
import android.content.Context
import com.example.core_db.di.DbComponentHolder
import com.example.core_db.di.DbDeps
import com.example.core_db_api.DbApi
import com.example.core_navigation.di.NavigationComponentHolder
import com.example.core_navigation.di.NavigationDeps
import com.example.core_navigation_api.NavigationApi
import com.example.core_network.di.NetworkComponentHolder
import com.example.core_network.di.NetworkDeps
import com.example.core_network_api.NetworkApi
import com.example.core_utils.di.ApplicationScope
import com.example.core_worker.di.WorkerComponentHolder
import com.example.core_worker.di.WorkerDeps
import com.example.core_worker_api.WorkerApi
import com.example.feature_pdp.di.FeaturePDPComponentHolder
import com.example.feature_pdp.di.FeaturePDPDeps
import com.example.feature_pdp_api.FeaturePDPApi
import com.example.feature_products.di.FeatureProductsComponentHolder
import com.example.feature_products.di.FeatureProductsDeps
import com.example.feature_products_api.FeatureProductsApi
import com.example.feature_shoppingcart.di.FeatureShoppingCartComponentHolder
import com.example.feature_shoppingcart.di.FeatureShoppingCartDeps
import com.example.feature_shoppingcart_api.FeatureShoppingCartApi
import dagger.Module
import dagger.Provides

@Module
class AppApiModule {

    @ApplicationScope
    @Provides
    fun provideContext(): Context {
        return Application.appContext
    }

    @Provides
    fun provideDb(dependencies: DbDeps): DbApi {
        DbComponentHolder.init(dependencies)
        return DbComponentHolder.get()
    }

    @Provides
    fun provideNetwork(dependencies: NetworkDeps): NetworkApi {
        NetworkComponentHolder.init(dependencies)
        return NetworkComponentHolder.get()
    }

    @Provides
    fun provideProductsFeature(dependencies: FeatureProductsDeps): FeatureProductsApi {
        FeatureProductsComponentHolder.init(dependencies)
        return FeatureProductsComponentHolder.get()
    }

    @Provides
    fun providePDPFeature(dependencies: FeaturePDPDeps): FeaturePDPApi {
        FeaturePDPComponentHolder.init(dependencies)
        return FeaturePDPComponentHolder.get()
    }

    @Provides
    fun provideShoppingCartFeature(dependencies: FeatureShoppingCartDeps): FeatureShoppingCartApi {
        FeatureShoppingCartComponentHolder.init(dependencies)
        return FeatureShoppingCartComponentHolder.get()
    }

    @Provides
    fun provideNavigationApi(dependencies: NavigationDeps): NavigationApi {
        NavigationComponentHolder.init(dependencies)
        return NavigationComponentHolder.get()
    }

    @Provides
    fun provideWorkerApi(dependencies: WorkerDeps): WorkerApi {
        WorkerComponentHolder.init(dependencies)
        return WorkerComponentHolder.get()
    }
}