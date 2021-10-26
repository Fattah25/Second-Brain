<h1 align="center">Pemrograman dengan Java SE</h1>

## Programming Language

+ Bahasa pemrograman: Suatu aturan penulisan standar yang digunakan untuk membuat program komputer.
+ Pemrograman: kegiantan membuat program.

## Java Programming Language

+ Java dikembangkan oleh **James Gosling dkk** dari *Sum Microsystem* pada Agustus 1991 dengan nama awal OAK.
+ Pada tahun 1995 diganti menjadi JAVA karena OAK kurang komersil dan sudah ada bahasa lain yang bernama Oak.

## Why use JAVA?

+ Open source
+ Object oriented programming
+ Multi-platform
+ Multi-threading
+ Stabil

## Java Application

* Terdapat 3 garis besar kelompok program yang dapat dibuat dengan menggunakan JAVA:

    * Applet
    * Aplikasi

        * Aplikasi GUI (*Graphical User Interface*)
        * Aplikasi command-line/console

    * Library

## JDK dan JRE

+ **JDK(*Java Development Kit*)**: berisi *package* yang digunakan untuk membangun program.
+ **JRE(*Java Runtime Environment*)**: berisi *package* yang digunakan untuk menjalankan program.
+ JDK dan JRE ada dalam satu paket **J2SDK**.
+ Paket J2SDK dibedakan menjadi 3 jenis, yaitu:

    + *Standar Edition* (J2SE)
    + *Enterprise edition* (J2EE)
    + *Micro Edition* (J2ME)

## Java IDE

+ **IDE(*Integrated DEvelopment Environment*)**: *software* yang digunakan untuk membangun dan menjalankan program.
+ Java IDE: IDE khusus untuk program java.
+ Beberapa contoh IDE untuk java:

    + NetBeans (*free*)
    + IntelliJ IDEA (*free and commercial*)
    + Eclipse (*free*)
    + Jdeveloper (*free*)
    + Android Studio (*free*) - *for Android only*
    + DrJava (*free*)
    + MyEclipse (*Commercial*)
    + BlueJ (*free*)
    + etc.

## Java Features

Beberapa fitur Java:

+ [Java Virtual Machine](#java-virtual-machine) (JVM)
+ [Garbage Collection](#garbage-collection)
+ [Security Code](#security-code)

### Java Virtual Machine

+ Java Virtual Machine (JVM)

    + Mesin virtual yang diimplementasikan oleh software sehingga menyamai mesin yang sebenarnya (seperti *sandbox*).
    + Menyediakan spesifikasi *platform* perangkat keras yang dapat meng-*compile* semua program Java.

+ Bytecode

    + Bahasa mesin khusus yang dimengerti oleh *Java Virtual Machine* (JVM).
    + Bebas dari kekhususan berbagai jenis perangkat keras komputer, jadi komputer dengan Java *interpreter* dapat mengeksekusi program Java yang sudah ter-*compile*, tidak peduli jenis komputer apa yang telah meng-*compile* program tersebut.


### Garbage Collection

Fungsi Grabage Collection :

+ Bertanggung jawab untuk mengosongkan memori. Pengosongan memori terjadi otomatis selama masa aktif dari program Java.
+ programmer dibebaskan dari beban untuk mengalokasikan kembali memori itu sendiri.

### Security Code

+ Diimplementasikan oleh *Java Runtime Environment* (JRE).
+ JRE

    + Menjalankan code yang telah ter-*compile* pada JVM dan menampilkan *class loading* (melalui *class loader*), memverifikasi code (melalui *bytecode verifier*) dan yang terakhir adalah mengeksekusi code.

## Java Programming LifeCycle


[selanjutnya...]()
