package com.rafi.shoppinglist.ui.shoppinglist

import com.rafi.shoppinglist.data.db.entities.ShoppingItem

interface AddDialogListener {
    fun onAddButtonClicked(item: ShoppingItem)
}