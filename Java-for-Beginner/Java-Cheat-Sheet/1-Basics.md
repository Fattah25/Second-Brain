*Ini adalah artikel terjemahan klik <a href="https://programmingwithmosh.com/wp-content/uploads/2019/07/Java-Cheat-Sheet.pdf" target="blank">di sini</a> untuk ke artikel aslinya* dan <a href="https://youtu.be/eIrMbAQSU34" target="blank">di sini</a> untuk tutorial youtubenya.

# Basics
Java adalah salah satu bahasa pemrograman paling populer di dunia. Dengan Java Anda dapat membangun berbagai jenis aplikasi seperti desktop, 
web, aplikasi seluler, dan sistem terdistribusi.



## Java Development Kit (JDK)
Kita menggunakan *Java Development Kit* (JDK) untuk membangun aplikasi Java. JDK berisi compiler, *Java Runtime Environment* (JRE) 
dan perpustakaan kelas (*library of classes*) yang kita gunakan untuk membangun aplikasi.

## Java Editions
Kita memiliki empat edisi Java, masing-masing digunakan untuk membangun jenis aplikasi yang berbeda:
+ **Java Standard Edition (SE)**: platform Java inti. Ini berisi semua perpustakaan yang harus dipelajari oleh setiap pengembang Java.
+ **Java Enterprise Edition (EE)**: digunakan untuk membangun skala yang sangat besar, sistem terdistribusi. Itu dibangun di
 atas Java SE dan menyediakan perpustakaan tambahan untuk membangun perangkat lunak multi-tingkat yang toleran terhadap kesalahan, terdistribusi.
+ **Java Micro Edition (ME)**: bagian dari Java SE, dirancang untuk perangkat seluler. Ini juga memiliki perpustakaan khusus untuk perangkat seluler.
+ **Java Card**: digunakan dalam *smart card*.

## How Java Code Gets Executed
Kompiler Java mengambil kode Java dan mengompilasinya ke Java *Bytecode* yang merupakan format lintas platform. Saat kami
menjalankan aplikasi Java, *Java Virtual Machine* (JVM) dimuat di memori. Dibutuhkan *bytecode* kita sebagai 
input dan menerjemahkannya ke kode asli untuk sistem operasi yang mendasarinya. Ada berbagai implementasi Java Virtual Machine untuk hampir semua sistem operasi.

## Architecture of Java Applications
*building block* terkecil dalam program Java adalah **methods** (juga disebut fungsi dalam bahasa pemrograman lain). Kita menggabungkan *methods* tertaut di dalam  **classes**, dan *classes* tertaut dalam **packages**. Modularitas di Java ini memungkinkan kita untuk memecah program besar menjadi *building block* yang lebih kecil yang lebih mudah dipahami dan digunakan kembali.

# 5 Interesting Facts about Java
1. Java dikembangkan oleh James Gosling pada tahun 1995 di **Sun Microsystems** (kemudian diakuisisi oleh Oracle).
2. Itu awalnya disebut *Oak*. Kemudian berganti nama menjadi *Green* dan akhirnya berganti nama menjadi **Java** yang terinspirasi dari kopi Java (kopi dari pulau Jawa).
3. Java memiliki hampir 9 juta pengembang di seluruh dunia
4. Sekitar 3 miliar ponsel menjalankan Java, serta 125 juta perangkat TV dan setiap pemutar Blu-Ray.
5. Menurut [`indeed.com`](https://id.indeed.com/?r=us), gaji rata-rata pengembang Java hanya lebih dari $ 100.000 per tahun di AS (sekitar Rp1,423,245,000).
