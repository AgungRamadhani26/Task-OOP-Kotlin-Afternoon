package id.infinitelearning.KotlinSubmission.exercise5
class Hero {

    private var name: String? = null
    private var age = 0
    private var height = 0

    private var health = 20

    fun setProfile(name: String?, age: Int, height: Int) {
        this.name = name
        this.age = age
        this.height = height
    }

    fun profile() {
        println("========= Profile =========")
        println("Name: $name")
        println("Age: $age")
        println("Height: $height")
        println("Health: $health")
        println("===========================")
    }

    private fun checkHealth() {
        if (health <= 0) {
            println("Anda telah mati $name")
        }
    }

    fun jalan(jumlahJalan: Int) {
        checkHealth()
        println("$name sedang berjalan $jumlahJalan kali...")
        health -= 1 * jumlahJalan
    }


    /**
     * Buat fungsi untuk lari, makan, minum, lompat, dan duduk. Masing2 memiliki kriteria sebagai berikut:
     - pasang fungsi checkHealth() di dalam fungsi yang akan dibuat
     - Tampilkan text kegiatan yang sedang dilakukan, misal, jika lari: "$name sedang berlari..."
     - ubah nilai variable health sesuai kegiatan yang dilakukan:
      * lari = -2
      * makan = +2
      * minum = +2
      * lompat = -2
      * duduk = +1

      Contoh fungsi bisa mengikuti fungsi jalan() diatas.
    */

    fun lari(jumlahLari: Int){
        checkHealth()
        println("$name sedang berlari $jumlahLari kali...")
        health -= 2 * jumlahLari
    }

    fun makan(jumlahMakan: Int){
        checkHealth()
        println("$name sedang makan $jumlahMakan kali...")
        health += 2 * jumlahMakan
    }

    fun minum(jumlahMinum: Int){
        checkHealth()
        println("$name sedang minum $jumlahMinum kali...")
        health += 2 * jumlahMinum
    }

    fun lompat(jumlahLompat: Int){
        checkHealth()
        println("$name sedang berlompat $jumlahLompat kali...")
        health -= 2 * jumlahLompat
    }

    fun duduk(jumlahDuduk: Int){
        checkHealth()
        println("$name sedang duduk $jumlahDuduk kali...")
        health += 1 * jumlahDuduk
    }
}

