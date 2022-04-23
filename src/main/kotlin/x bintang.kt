fun main(args: Array<String>) {
    println("X bintang")

    val baris = 8
    for (i in 1..baris){
        for (j in 1.. baris){
            if (j == i)
                print("*")
            else
                print(" ")
        }

        for (k: Int in 7 downTo 0) {
            if (k == i)
                print("*")
            else
                print(" ")
        }
        println()
    }

    for (i in 1..baris){
        for (k in 7 downTo 0){
            if (k == i)
                print("*")
            else
                print(" ")
        }
        for (j in 1..baris-1){
            if (j==i)
                print("*")
            else
                print(" ")
        }
        println()
    }
}