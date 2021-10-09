# Mendapatkan Input Pengguna
Walaupun Java menyediakan (*provide*) banyak metode (*method*) berbeda untuk mendapatkan *input* pengguna, Objek **scanner** adalah yang paling umum, dan mungkin yang paling mudah untuk diimplementasikan. Import kelas *scanner* untuk menggunakan objek **scanner**, seperti di bawah ini:
```java
import java.util.Scanner;
```

Untuk menggunakan kelas **scanner** (*scanner class*), buat *instance[^1] class* dengan menggunakan sintaks berikut:
[^1]: Setiap objek disebut sebagai turunan (*instance*) dari sebuah kelas (*class*).
```java
Scanner myVar = new Scanner(System.in);
```

Kita sekarang dapat membaca dalam berbagai jenis data input yang dimasukkan pengguna.
Berikut adalah beberapa metode yang tersedia melalui kelas *scanner*: 

menafsirkan sebuah *byte* - `nextByte()`[^1]
[^1]: Selalu ingat Java sangat sensitif dengan huruf besar (*Upercase*) dan kecil (*Lowercase*). 
