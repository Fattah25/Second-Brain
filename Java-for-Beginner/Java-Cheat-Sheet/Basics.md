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
