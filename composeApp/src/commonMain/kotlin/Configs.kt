interface Configs {
    val baseUrl: String
}

expect fun getConfig() : Configs