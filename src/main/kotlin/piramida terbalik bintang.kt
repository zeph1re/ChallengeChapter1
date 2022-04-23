fun main(args: Array<String>) {
    println("Piramida Terbalik Bintang")
    var baris: Int = 8
    for ( i in baris downTo 1){
        for (j in 1..baris - i){
            print("  ")
        }
        for (k in i..2 * i -1 ) {
            print("* ")
        }
        for (k in 0..i-2){
            print("* ")
        }
        println()
    }

}