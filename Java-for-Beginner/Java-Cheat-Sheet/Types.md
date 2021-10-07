# Types

## Variables
Kita menggunakan variabel untuk menyimpan data sementara di memori komputer. Di Java, **tipe** variabel harus ditentukan pada saat deklarasi.

Di Java, kita memiliki dua kategori tipe:
+ **Primitives:** untuk menyimpan nilai sederhana seperti angka, string, dan boolean.
+ **Reference Types:** untuk menyimpan objek kompleks seperti pesan email.

## Primitive Types
|Type|Bytes|Range|
|:-------------|:-----------:|:----------------------|
|byte|1|-128, 127]|
|short|2|[-32K, 32K]|
|int|4|[-2B, 2B]|
|long|8||
|float|4||
|double|8||
|char|2|A,B,C,...|
|boolean|1|true/false|

## Declaring Variables
```java
byte age = 30;
long viewsCount = 3_123_456L;
float price = 10.99F;
char letter = ‘A’;
boolean isEligible = true;
```

+ Di Java, kita mengakhiri pernyataan dengan titik koma (*semicolon*).
+ Kita menyertakan karakter dengan tanda kutip tunggal dan **string** (rangkaian karakter) dengan tanda kutip ganda.
+ Tipe default *integer* di Java adalah *int*. Untuk mewakili nilai *long*, kita harus menambahkan L sebagai postfix (pada akhir bilangan).
+ Tipe *default floating-point* di Java adalah *double*. Untuk merepresentasikan *float*, kita harus menambahkan F padanya sebagai postfix.

## Comments
Kita menggunakan komentar untuk menambahkan catatan ke kode kita.

```java
// This is a comment and it won’t get executed.
``` 

## Reference Types
Di Java kita memiliki 8 tipe primitif. Tipe lainnya adalah tipe referensi (*reference types*). Tipe ini tidak menyimpan objek sebenarnya dalam memori. Mereka menyimpan referensi (atau alamat) suatu objek dalam memori.

Untuk menggunakan *reference types*, kita perlu mengalokasikan memori menggunakan operator *new*. Memori akan dilepaskan secara otomatis saat tidak lagi digunakan.

```java
Date now = new Date();
```
