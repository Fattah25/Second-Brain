# Increment Operators
Operator **increment** atau **decrement** menyediakan cara yang lebih nyaman dan ringkas untuk menambah atau mengurangi nilai variabel satu per satu. 
Misalnya, pernyataan `x=x+1`; dapat disederhanakan menjadi `++x`; 

**Contoh:**
```java
public class Program {
    public static void main(String[] args) {
        int test = 5;
        ++test;
        
        System.out.println(test);
    }
}
```

Operator *decrement* (--) digunakan untuk mengurangi nilai variabel satu per satu.
```java
public class Program {
    public static void main(String[] args) {
        int test = 5;
        --test; 
        
        System.out.println(test);
    }
}
```
> 📌 Gunakan operator ini dengan hati-hati untuk menghindari kesalahan perhitungan.
<br>

# Prefix dan Postfix
Dua bentuk, **prefix** dan **postfix**, dapat digunakan dengan operator increment dan decrement.<br>Dengan bentuk awalan, operator 
muncul sebelum *operand*, sedangkan dalam bentuk *postfix*, operator muncul setelah *operand*. Berikut adalah penjelasan tentang cara kerja kedua bentuk tersebut:

**Prefix**: Menambah nilai variabel dan menggunakan nilai baru dalam ekspresi.<br>**Contoh:**

```java
public class Program {
    public static void main(String[] args) {
        int x = 34;
        int y = ++x;

        System.out.println(y);
    }
}
```

Nilai x pertama kali bertambah menjadi 35, dan kemudian ditetapkan ke y, sehingga nilai x dan y sekarang adalah 35. 

**Postfix**: Nilai variabel pertama kali digunakan dalam ekspresi dan kemudian ditingkatkan.<br>**Contoh:**

```java
public class Program {
    public static void main(String[] args) {
        int x = 34;
        int y = x++;

        System.out.println(y);
    }
}
```

x pertama ditempatkan ke y, dan kemudian bertambah satu. Oleh karena itu, x menjadi 35, sedangkan y diberi nilai 34.

> 📌 Hal yang sama berlaku untuk operator **decrement**.
<br>

# Assignment Operators

Anda sudah akrab dengan operator penugasan/*assignment* (=), yang memberikan nilai ke variabel.

```java
int value = 5;
```

Ini menetapkan nilai 5 ke variabel yang disebut **value** dari tipe **int**.

Java menyediakan sejumlah operator penugasan untuk memudahkan penulisan kode.

## Addition and assignment (+=)

```java
public class Program {
    public static void main(String[] args) {
        int num1 = 4;
        int num2 = 8;
        num2 += num1;
        
        System.out.println(num2);
    }
}
```

## Subtraction and assignment (-=)
```java
public class Program {
    public static void main(String[] args) {
        int num1 = 4;
        int num2 = 8;
        num2 -= num1;
        
        System.out.println(num2);
    }
}
```

> 📌 Demikian pula, Java mendukung perkalian dan *assignmet* (*=), pembagian dan *assignmet* (/=), dan modulus dan *assignmet* (%=).

