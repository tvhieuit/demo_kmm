import org.example.project.BuildConfig


class AndroidConfig: Configs {
    override val baseUrl: String = BuildConfig.FLAVOR
}


actual fun getConfig(): Configs {
    return  AndroidConfig()
}