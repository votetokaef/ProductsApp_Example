package com.example.feature_pdp.data

import com.example.core_db_api.Db
import com.example.core_model.data.db.toProduct
import com.example.core_model.domain.Product
import com.example.core_worker_api.ProductsWorker
import com.example.feature_pdp.domain.PDPRepository
import javax.inject.Inject

class PDPRepositoryImpl @Inject constructor(
    private val db: Db,
    private val productsWorker: ProductsWorker,
) : PDPRepository {

    override suspend fun getProductById(guid: String): Product {
        return productsWorker.getProduct(guid = guid).toProduct()
    }

    override suspend fun updateProductInCartCount(guid: String, inCartCount: Int) {
        db.updateProductInCartCount(guid = guid, inCartCount = inCartCount)
    }

    override suspend fun updateProductFavoriteStatus(guid: String, isFavorite: Boolean) {
        db.updateProductFavoriteStatus(guid = guid, isFavorite = isFavorite)
    }
}