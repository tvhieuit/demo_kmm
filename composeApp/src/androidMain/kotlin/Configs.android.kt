class AndroidConfig: Configs {
    override val baseUrl: String = ""
}


actual fun getConfig(): Configs {
    return  AndroidConfig()
}