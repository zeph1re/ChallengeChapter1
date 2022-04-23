fun main(args: Array<String>) {
    println("Bentuk Piramida Bintang")
    var baris: Int= 8

    for (i:Int in 1..baris) {
        for (j: Int in 1..baris -i){
            print("  ")
        }

        for (k in i..2 * i - 1) {
            print("* ")
        }
        for (k in 0..i - 2){
            print("* ")
        }

        println()

    }


}
