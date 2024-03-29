package com.twaun95.presentation.extensions

import android.view.View
import androidx.core.view.isInvisible
import androidx.core.view.isVisible

fun View.visible() {
    this.isVisible = true
}

fun View.visibleOrGone(isVisible: Boolean) {
    this.isVisible = isVisible
}

fun View.gone() {
    this.isVisible = false
}

fun View.goneIfNeeded() {
    if (isVisible) {
        this.isVisible = false
    }
}

fun View.invisible() {
    this.isInvisible = true
}