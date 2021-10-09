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

+ Membaca sebuah *byte* - `nextByte()`[^2]
[^2]: Selalu ingat Java sangat sensitif dengan huruf besar (*Upercase*) dan kecil (*Lowercase*). 

+ Membaca sebuah *short* - `nextShort()`
+ Membaca sebuah *int*[^3] - `nextInt()`

[^3]: Digunakan untuk mendeklarasikan Variabel *integer* (bilangan bulat)
+ Membaca sebuah *long* - `nextLong()`
+ Membaca sebuah *float*[^4] - `nextFloat()`

[^4]: Digunakan untuk mendeklarasikan  Variabel *floating-number* (bilangan desimal)
+ Membaca sebuah *double* - `nextDouble()`
+ Membaca sebuah *boolean*[^5] - `nextBoolean()`
[^5]: Digunakan untuk mendeklarasikan variabel *boolean*, yang mana hanya mengembalikan dua nilai: *true* dan *false*

+ Membaca sebuah *String* atau sebaris lengkap kalimat - `nextLine()`
+ Membaca sebuah kata - `next()`

### Contoh program yang digunakan untuk mendapatkan *input* pengguna: 
```java
import java.util.Scanner;

class MyClass{
  public static void main(String args[]){
      
  }
  
}
```
> Ini akan menunggu pengguna untuk memasukkan sesuatu dan mencetak *input*nya.
> Kode ini mungkin tampak rumit, tetapi kita akan memahami semuanya di materi selanjutnya.

## Komentar Programmer: 

|Samer Saber|
|:---|
| Saya akan menjelaskan dengan jelas `import java.util.Scanner;` :<br><br> Di Java, ada paket (*package*), dan paket-paket ini seperti wadah tempat kita bisa meletakkan kelas (*class*).<br> Setiap kali kita ingin mengambil kelas|



