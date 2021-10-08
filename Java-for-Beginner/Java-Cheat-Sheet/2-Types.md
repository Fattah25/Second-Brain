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

## Strings
String adalah *reference types* tetapi kita tidak perlu menggunakan operator *new* untuk mengalokasikan memori kepadanya. Kita dapat mendeklarasikan variabel string seperti primitif karena kita sering menggunakannya.

```java
String name = "Tri Ilman";
```

## Useful String Methods
*String class* di Java menyediakan sejumlah *methods* yang berguna:
+ startsWith(“a”)
+ endsWith(“a”)
+ length() 
+ indexOf(“a”)
+ replace(“a”, “b”)
+ toUpperCase()
+ toLowerCase()

String tidak dapat diubah, yang berarti setelah kita menginisialisasinya, nilainya tidak dapat diubah. Semua *methods* yang memodifikasi string (seperti toUpperCase) mengembalikan objek string baru. String asli tetap tidak terpengaruh.

## Escape Sequences
Jika Anda perlu menggunakan *backslash* atau tanda kutip ganda dalam sebuah string, Anda harus mengawalinya dengan *backslash*. Ini disebut *escaping*.

+ \\
+ \"
+ \n (*new line*)
+ \t (tab)

## Array
Kita menggunakan array untuk menyimpan daftar objek. Kita dapat menyimpan semua jenis objek dalam sebuah array (tipe primitif atau referensi). Semua item (juga disebut elemen) dalam array memiliki tipe yang sama.

```java
// Creating and and initializing an array of 5 elements
int[] numbers = new int[3];
numbers[0] = 10;
numbers[1] = 20;
numbers[2] = 30;
// Shortcut
int[] numbers = { 10, 20, 30 };
```

Array Java memiliki panjang (ukuran) yang tetap. Anda tidak dapat menambah atau menghapus item baru setelah membuat *instance array*. Jika Anda perlu menambahkan item baru atau menghapus item yang ada, Anda perlu menggunakan salah satu *collection classes*.

## The Array Class
*array class* menyediakan beberapa *methods* yang berguna untuk bekerja dengan array.

```java
int[] numbers = { 4, 2, 7 };
Arrays.sort(numbers);
String result = Arrays.toString(numbers);
System.out.println(result);
```

## Multi-Dimensional Arrays
```java
// Creating a 2x3 array (two rows, three columns)
int[2][3] matrix = new int[2][3];
matrix[0][0] = 10;
// Shortcut
int[2][3] matrix = {
 { 1, 2, 3 },
 { 4, 5, 6 }
 };
```

## Constants
Konstanta (juga disebut variabel akhir/*final variable*) memiliki nilai tetap. Setelah kita mengaturnya, kita tidak dapat mengubahnya.
```java
final float INTEREST_RATE = 0.04;
```
Dengan konvensi (kesepakatan), kita menggunakan **HURUF BESAR** untuk memberi nama konstanta. Beberapa kata dapat dipisahkan menggunakan garis bawah (*underscore*).

## Arithmetic Expressions
```java
int x = 10 + 3;
int x = 10 - 3;
int x = 10 * 3;
int x = 10 / 3; // returns an int
float x = (float)10 / (float)3; // returns a float
int x = 10 % 3; // modulus (remainder of division)
```

### Increment and Decrement Operators
```java
int x = 1;
x++; // Equivalent to x = x + 1
x--; // Equivalent to x = x - 1
```

### Augmented Assignment Operator 
```java
int x = 1;
x += 5; // Equivalent to x = x + 5
```

## Order of Operations
Operator perkalian dan pembagian memiliki urutan yang lebih tinggi daripada penjumlahan dan pengurangan. Mereka akan diterapkan terlebih dahulu. Kita selalu dapat mengubah urutan menggunakan tanda kurung.[^1]
[^1]: Ingat konsep *kukabataku* (kurung, kali, bagi, tambah, kurang).

```java
int x = 10 + 3 * 2; // 16
int x = (10 + 3) * 2; // 26
```

## Casting
Di Java, kita memiliki dua jenis casting:

+ Implisit: terjadi secara otomatis saat kita menyimpan nilai dalam tipe data yang lebih besar atau lebih tepat.
+ Eksplisit: kita melakukannya secara manual.

```java
// Casting implisit terjadi karena kita mencoba menyimpan short
// value (2 bytes) in an int (4 bytes).
short x = 1;
int y = x;
// Explicit casting
int x = 1;
short y = (short) x;
```

Untuk mengonversi string menjadi angka, kita menggunakan salah satu *methods* berikut: 
+ Byte.parseByte(“1”)
+ Short.parseShort(“1”)
+ Integer.parseInt(“1”)
+ Long.parseLong(“1”)
+ Float.parseFloat(“1.1”)
+ Double.parseDouble(“1.1”) 

## Formatting Numbers
```java
NumberFormat currency = NumberFormat.getCurrencyInstance();
String result = currency.format(“123456”); // $123,456

NumberFormat percent = NumberFormat.getPercentInstance();
String result = percent(“0.04”); // 4%

```

## Reading Input
```java
Scanner scanner = new Scanner(system.in);
double number = scanner.nextDouble();
byte number = scanner.nextByte();
String name = scanner.next();
String line = scanner.nextLine();
```

