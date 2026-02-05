package cc.progmem.bukkoff.theme.catppuccin

fun <A, B> com.catppuccin.Pair<A, B>.toKotlin(): Pair<A, B> {
    return this.key() to this.value()
}