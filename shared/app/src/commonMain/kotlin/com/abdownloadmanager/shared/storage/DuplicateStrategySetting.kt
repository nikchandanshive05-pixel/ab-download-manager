package com.abdownloadmanager.shared.storage

import ir.amirab.downloader.utils.OnDuplicateStrategy

enum class DuplicateStrategySetting {
    AlwaysAsk,
    AddNumbered,
    OverrideDownload;

    fun toOnDuplicateStrategyOrNull(): OnDuplicateStrategy? {
        return when (this) {
            AlwaysAsk -> null
            AddNumbered -> OnDuplicateStrategy.AddNumbered
            OverrideDownload -> OnDuplicateStrategy.OverrideDownload
        }
    }
}
