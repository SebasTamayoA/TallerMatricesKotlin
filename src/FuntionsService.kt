
fun imprimirMatriz(matriz: Array<IntArray>) {
    for (fila in matriz) {
        println(fila.joinToString(" "))
    }
}