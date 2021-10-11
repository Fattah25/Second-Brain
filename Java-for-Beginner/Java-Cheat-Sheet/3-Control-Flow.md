# Control Flow

<details>
<summary><b>Table of Contents</b></summary>
 
+ [Comparison Operators](#comparison-operators)
+ [Logical Operators](#logical-operators)
+ [If Statements](#if-statements)
+ [The Ternary Operator](#the-ternary-operator)
+ [Switch Statements](#switch-statements)
+ [For Loops](#for-loops)
+ [While Loops](#while-loops)
+ [Do-While Loops](#do-while-loops)
+ [For-each Loops](#for-each-loops)
</details>

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

```java
switch (x) {
 case 1:
 …
 break;
 case 2:
 …
 break;
 default:
 …
} 
```

Setelah setiap klausa **case**, kita menggunakan pernyataan **break** untuk melompat keluar dari blok *switch*.

## For Loops

*For loop* berguna ketika kita tahu sebelumnya berapa kali kita ingin mengulang sesuatu. Kita mendeklarasikan variabel *loop* (atau penghitung *loop*) dan di setiap iterasi kita menambahkannya hingga kita mencapai pengulangan beberapa kali yang kita inginkan dalam mengeksekusi beberapa kode.

```java
for (int i = 0; i < 5; i++)
 statement
```

## While Loops
*While loops* berguna ketika kita tidak tahu sebelumnya berapa kali kita ingin mengulang sesuatu. Ini mungkin tergantung pada nilai saat run-time (misalnya apa yang dimasukkan pengguna).

```java
while (someCondition) {
 …
 if (someCondition)
 break;
}
```

## Do-While Loops

*Do..While loops* sangat mirip dengan perulangan *while* (*while loops*) tetapi itu dieksekusi setidaknya sekali. Sebaliknya, *while loop* mungkin tidak akan pernah dieksekusi jika kondisi awalnya salah.

```java
do {
 …
} while (someCondition);
```

## For-Each Loops
*For* berguna untuk mengulangi *array* atau *collection*.

```java
int[] numbers = {1, 2, 3, 4};
for (int number : numbers)
```

> Sekian yang dapat saya terjemahkan. Ada baiknya di baca sambil menyimak tutorial dari penyedia asli ringkasan java ini.
