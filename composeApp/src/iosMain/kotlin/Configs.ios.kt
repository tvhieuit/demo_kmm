import platform.Foundation.NSBundle

class IoSConfigs : Configs {
    override val baseUrl: String =  NSBundle.mainBundle.infoDictionary.toString()


}

actual fun getConfig(): Configs {
    return IoSConfigs()
}