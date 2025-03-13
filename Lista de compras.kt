fun main() {

    val listaFrutas: MutableList<String> = mutableListOf("Maça", "Banana", "Laranja", "Manga", "Pera")

    println("Bem-Vindo ao nosso mercado!")

    println("Informe uma fruta para retirar da lista: $listaFrutas")

    while(listaFrutas.isNotEmpty()){
        var fruta = readln()
        if (fruta in listaFrutas) {
            listaFrutas.remove(fruta)
            println("Fruta foi retirada da lista $listaFrutas")
        } else {
            println("Fruta indisponível no nosso mercado")
        }
    }
    println("Lista de compras finalizada")
}