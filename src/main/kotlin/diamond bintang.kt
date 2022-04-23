fun main(args: Array<String>) {

    println("Bentuk Diamond Bintang")
    var baris: Int= 8

    for (i:Int in 1..baris) {
        for (j: Int in 1..baris -i){
            print(" ")
        }
        for (k in i..2 * i - 1) {
            print("*")
        }
        for (k in 0..i - 2){
            print("*")
        }
        println()
    }
    for ( i in baris-1 downTo 1){
        for (j in 1..baris - i){
            print(" ")
        }
        for (k in i..2 * i - 1) {
            print("*")
        }
        for (k in 0..i - 2){
            print("*")
        }
        println()
    }
}
