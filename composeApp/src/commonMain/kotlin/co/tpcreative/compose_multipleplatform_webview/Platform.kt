package co.tpcreative.compose_multipleplatform_webview

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform