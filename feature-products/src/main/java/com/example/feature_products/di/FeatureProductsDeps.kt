package com.example.feature_products.di

import com.example.core_db_api.Db
import com.example.core_navigation_api.FragmentLauncher
import com.example.core_worker_api.ProductsWorker
import com.example.feature_pdp_api.FeaturePDPApi
import com.example.feature_shoppingcart_api.FeatureShoppingCartApi
import com.example.module_injector.BaseDependencies

interface FeatureProductsDeps : BaseDependencies {
    val db: Db
    val fragmentLauncher: FragmentLauncher
    val pdpApi: FeaturePDPApi
    val shoppingCartApi: FeatureShoppingCartApi
    val productsWorker: ProductsWorker
}