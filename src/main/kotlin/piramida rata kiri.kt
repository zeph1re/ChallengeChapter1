fun main(args: Array<String>) {

    println("Bentuk Piramid Kiri")
    var baris = 8
    for (i:Int in 1..baris) {
        for (j: Int in 1..i) {
            print("*")
        }
        println()
    }
}