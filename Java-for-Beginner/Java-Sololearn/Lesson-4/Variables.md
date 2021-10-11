# Variabel

**Variabel** menyimpan data untuk diproses. Suatu variabel diberi nama (atau **identifier**), seperti luas, umur, tinggi badan,
dan sejenisnya. Nama secara unik mengidentifikasi setiap variabel, menetapkan nilai ke variabel dan mengambil nilai yang disimpan.

Variabel memiliki **types**. sebagai berikut:
+ **int**: untuk bilangan **integer** (bilangan bulat) seperti 123 dan -456.
+ **double**: untuk **floating-point** atau bilangan real dengan titik desimal opsional dan bagian pecahan dalam bentuk tetap atua notasi ilmiah, seperti 3.1416, -55.66.
+ **String**: untuk teks seperti "Halo" atau "Selamat Pagi!". *String* teks diapit dalam tanda kutip ganda.

Anda dapat mendeklarasikan sebuah variabel dari suatu *type* dan memberikannya sebuah nilai.
**Contoh:**

```java
String name = "David";
```
Ini menciptakan variabel yang disebut **name** dengan tipe *String*, dan memberinya nilai "David".

> <img src="https://img.icons8.com/ios/250/000000/pin3.png" width=20> Penting untuk dicatat bahwa variabel dikaitkan dengan tipe (*type*),
>  dan hanya mampu menyimpan nilai dari tipe tertentu. Misalnya, variabel **int** dapat menyimpan nilai integer, seperti 123; 
>  tetapi tidak dapat menyimpan bilangan real, seperti 12.34[^1], atau teks, seperti "Halo".
>  [^1]: perlu diketahui koma dalam bahasa pemrograman adalah titik atau ".".

**Contoh deklarasi variabel:**

```java
class MyClass {
    public static void main(String[ ] args) {
        String name ="David";
        int age = 42;
        double score =15.9;
        char group = 'Z';
    }
}
```

**char** singkatan dari **character** dan hanya dapat menyimpan satu karakter. contoh 'A','B',...

Tipe lainnya adalah tipe **Boolean**, yang hanya memiliki dua kemungkinan nilai: **true** dan **false**. 
Tipe data ini digunakan untuk isyarat sederhana yang melacak kondisi benar/salah. 

Sebagai contoh:
```java
boolean online = true;
```

> <img src="https://img.icons8.com/ios/250/000000/pin3.png" width=20>
> Anda dapat menggunakan *coma-separated list* untuk mendeklarasikan lebih dari satu variabel dari tipe yang spesifik. Contoh: `int a = 42, b = 11`;
