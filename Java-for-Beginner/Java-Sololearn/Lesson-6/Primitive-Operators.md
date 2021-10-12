
# Operator Matematika
<details>
  <summary><b>Table of Contents</b></summary>
  
  + [Penjumlahan](#penjumlahan)
  + [Pengurangan](#pengurangan)
  + [Perkalian](#perkalian)
  + [Pembagian](#pembagian)
  + [Modulus](#modulus)
  
</details>

----

Java menyediakan seperangkat operator yang kaya untuk digunakan dalam memanipulasi variabel. Nilai yang digunakan di kedua sisi operator disebut **Operand**. 
Misalnya, dalam ekspresi di bawah ini, angka 6 dan 3 adalah **operand** dari operator plus:

```java
int x = 6 + 3;
```
Operator aritmatika Java:

\+ **Penjumlahan**<br>
\- **Pengurangan**<br>
\* **Perkalian**<br>
\/ **Pembagian**<br>
\% **Modulus**

> <img src="https://img.icons8.com/ios/250/000000/pin3.png" width=20> Operator aritmatika digunakan dalam ekspresi matematika dengan cara yang sama seperti yang digunakan dalam persamaan aljabar.

## Penjumlahan
Operator `+` menjumlahkan dua nilai, seperti dua konstanta, konstanta dan variabel, atau variabel dan variabel. Berikut adalah beberapa contoh penjumlahan:

```java
int sum1 = 50 + 10; 
int sum2 = sum1 + 66; 
int sum3 = sum2 + sum2;
```
<br><br>
## Pengurangan
Operator `-` mengurangi satu nilai dari nilai lainnya.
```java
int sum1 = 1000 - 10;
int sum2 = sum1 - 5;
int sum3 = sum1 - sum2;
```

> <img src="https://img.icons8.com/ios/250/000000/pin3.png" width=20> Sama seperti dalam aljabar, Anda dapat menggunakan kedua operasi dalam satu baris. Misalnya: `int val = 10 + 5 - 2;`
> 
<br><br>
## Perkalian
Operator `*` mengalikan dua nilai.
```java
int sum1 = 1000 * 2;
int sum2 = sum1 * 10;
int sum3 = sum1 * sum2;
```
<br><br>
## Pembagian
Operator `/` membagi satu nilai dengan yang lain.
```java
int sum1 = 1000 / 5;
int sum2 = sum1 / 2;
int sum3 = sum1 / sum2;
```
> <img src="https://img.icons8.com/ios/250/000000/pin3.png" width=20> Pada contoh di atas, hasil dari persamaan pembagian akan menjadi bilangan bulat, karena **int** digunakan sebagai tipe data. Anda dapat menggunakan **double** untuk mengambil nilai dengan titik desimal.

<br><br>
## Modulus

Operasi matematika **modulus** (atau sisa) melakukan pembagian bilangan bulat dari satu nilai dengan nilai lainnya, dan mengembalikan sisa pembagian tersebut. Operator untuk operasi **modulus** adalah karakter persentase (%).

**example:**
```java
public class Program {
    public static void main(String[] args) {
        int value = 23;
        int res = value % 6;

        System.out.println(res);
    }
}
```

**Outputnya:**<br>
`5`

> Membagi 23 dengan 6 mengembalikan hasil bagi 3, dengan sisa 5. Jadi, nilai 5 ditetapkan ke variabel **res**.
