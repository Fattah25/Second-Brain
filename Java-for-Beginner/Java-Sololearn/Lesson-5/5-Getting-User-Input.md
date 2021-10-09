# Mendapatkan Input Pengguna
Walaupun Java menyediakan (*provide*) banyak metode (*method*) berbeda untuk mendapatkan *input* pengguna, Objek **scanner** adalah yang paling umum, dan mungkin yang paling mudah untuk diimplementasikan. Import kelas *scanner* untuk menggunakan objek **scanner**, seperti di bawah ini:
```java
import java.util.Scanner;
```

Untuk menggunakan kelas **scanner** (*scanner class*), buat *instance*[^1] *class* dengan menggunakan sintaks berikut:
[^1]: Setiap objek disebut sebagai turunan (*instance*) dari sebuah kelas (*class*).
```java
Scanner myVar = new Scanner(System.in);
```

Kita sekarang dapat membaca dalam berbagai jenis data input yang dimasukkan pengguna.
Berikut adalah beberapa metode yang tersedia melalui kelas *scanner*: 

Membaca sebuah *byte* - `nextByte()`[^2]
[^2]: Selalu ingat Java sangat sensitif dengan huruf besar (*Upercase*) dan kecil (*Lowercase*). 
Membaca sebuah *short* - `nextShort()`
Membaca sebuah *int*[^3] - `nextInt()`
[^3]: Digunakan untuk mendeklarasikan sebuah Variabel *integer* (bilangan bulat)
Membaca sebuah *long* - `nextLong()`
Membaca sebuah *float*[^4] - `nextFloat()`
[^4]: Digunakan untuk mendeklarasikan sebuah Variabel *floating-number* (bilangan desimal)
Membaca sebuah *double* - `nextDouble()`
Membaca sebuah *boolean* - `nextBoolean()`
Membaca sebuah *String* atau sebaris lengkap kalimat - `nextLine()`
Membaca sebuah kata - `next()`

