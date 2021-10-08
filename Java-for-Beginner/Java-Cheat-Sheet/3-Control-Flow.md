# Control Flow

## Comparison Operators

Kita menggunakan operator perbandingan () untuk membandingkan nilai.
```java
x == y // equality operator
x != y. // in-equality operator
x > y
x >= y
x < y
x <= y
```

## Logical Operators
Kita menggunakan operator logika untuk menggabungkan beberapa nilai/ekspresi boolean.
+ **x && y (AND):** jika x dan y *true*, hasilnya juga *true*.
+ **x || y (ATAU):** jika x atau y atau keduanya *true*, hasilnya akan *true*.
+ **!x (TIDAK):** membalikkan nilai boolean. *true* menjadi *false*.

```java
bool hasHighIncome = true;
bool hasGoodCredit = false;
bool hasCriminalRecord = false;
bool isEligible = (hasHighIncome || hasGoodCredit) && !isEligible;
```

## If Statements
Berikut adalah struktur dasar dari *if statements*. Jika Anda ingin mengeksekusi beberapa pernyataan, Anda harus membungkusnya dengan kurung kurawal (*curly braces*).

```java
if (condition1)
 statement1
else if (condition2)
 statement2
else if (condition3)
 statement3
else
 statement4
```

## The Ternary Operator
```java
String className = (income > 100_000) ? “First” : “Economy”;
```

Ini adalah singkatan (*shorthand*) untuk menulis kode berikut:

```java
String className;
if (income > 100_000)
 className = “First”;
else
 className = “Economy”;
```

## Switch Statements

Kita menggunakan pernyataan switch untuk mengeksekusi bagian kode yang berbeda tergantung pada nilai variabel.
[halaman sebelah](1-types.md)

