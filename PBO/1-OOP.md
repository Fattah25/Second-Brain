<h1 align="center">OBJECT ORIENTED PROGRAMING</h1>

## Paradigma Pemrograman dan Model Komputasi

Empat paradigma pemrograman yang sangat mendasar dan berbeda pada tiga dekade terakhir :
+ [**Imperative programming**](#imperative-programming)
+ [**Object-oriented programming**](#oop)
+ [**Functional programming**](#functional-programming)
+ [**Logic programming**](#logic-programming)

Beberapa bahasa pemrograman mendukung lebih dari satu paradigma. contoh : C++ yang mendukung *imperative* dan *object-oriented*, sedangkan *Leda* 
dirancang untuk mendukung semua paradigma pemrograman di atas.

### Imperative Programming

+ Merupakan paradigma pemrograman paling tua
+ Pada model ini, program dan variabelnya disimpan bersama, dan program terdiri atas perintah-perintah yang membentuk perhitungan, penyimpanan nilai ke variabel, membaca *input*, menghasilkan *output*, atau mengarahkan kontrol dari deret instruksi dalam pemrograman.
+ Abstraksi prosedural/terstruktur membentuk blok untuk *imperative programming*, misalnya penugasan (*assignment*), pengulangan(*loop*), sekuensial, pernyataan kondisi, dan penanganan pengecualian (*exception handling*).
+ Bahasa pemrograman yang masuk ke dalam paradigma ini antara lain *Cobol*, *Fortran*, C, *Ada*, dan *perl*.

<h3 id="oop">Object-Oriented Programming</h3>

+ Menyediakan model dimana program merupakan kumpulan obyek yang berinteraksi satu sama lain.
+ Program dalam OOP membungkus (*Ecapsulate*) data dan fungsi (atau prosedur) dalam suatu objek yang umumnya diimplementasikan sebagai suatu kelas (*class*).
+ Klasifikasi obyek, pewarisan, dan *message passing* merupakan prinsip-prinsip dasar OOP.
+ Bahasa yang mendukung OOP antara lain *Smalltalk*, C++, Java, dan C#.

### Functional Programming

+ Memodelkan suatu masalah komputasi sebagai kumpulan fungsi matematis, dimana setiap *input* merupakan domain atau daerah fungsi, dan *output* berupa range atau wilayah fungsi.
+ Hal ini menjadikan *functional programming* sebagai bagian dari bahasa yang tidak membenarkan pernyataan penugasan, seperti x=x+1, yang tidak berlaku baik pada *functional programming* maupun dalam matematika.
+ Fungsi berinteraksi dengan yang lain menggunakan komposisi fungsi, kondisional, dan rekursif.
+ Bahasa pemrograman yang masuk dalam kelompok ini adalah *Lisp* (List Programming), *Scheme*, *Haskell*, dan *ML* (Meta Language).

### Logic Programming

+ Disebut sebagai *declarative programming* memodelkan masalah dengan menggunakan bahasa deklaratif[^1], yang diimplementasikan dalam bentuk fakta dan aturan.
+ Maka dari itu, bahasa ini juga disebut sebagai *rule-based languages*.
+ Contoh bahasa pemrograman kelompok ini adalah *Prolog* (Programming in Logic).

[^1]: Pernyataan yang ringkasa dan jelas.

## Pemrograman Terstruktur?

+ Adalah suatu proses untuk mengimplementasikan urutan langkah untuk menyelesaikna suatu masalah dalam bentuk pemrograman.
+ Selain pengertian diatas, **Pemorgraman Terstruktur** adalah suatu aktivitas pemrograman dengan memperhatikan urutan langkah-langkah perintah secara sistematis, logis, dan tersusun berdasarkan algoritama yang sederhana dan mudah dipahami.
+ Prinsip dari pemrograman terstruktur adalah Apabila kita sudah sampai pada langkah tertentu, kita tidak boleh mengeksekusi langkah sebelumnya. Hal ini dikecualikan pada langkah-langkah untuk proses berulang.
+ Bahasa pemrograman yang mendukung pemrograman terstruktur: *Cobol*, *Prolog*, C, *Pascal*, *Delphi*, *Borland Delphi*, dan lain-lain.

<h1 align="center">Prosedural VS OOP</h1>

## Bahasa Prosedural
[link referensi](https://dwightjordan23.wordpress.com/2015/06/29/pemrograman-prosedural/)

+ Serangkaian tugas diselesaikan dalam bentuk fungsi atau prosedur.
+ Cara pandang --> Program adalah suatu urutan instruksi.
+ Programmer harus mem-*break down* suatu problem menjadi sub problem yang lebih simpel.
+ *Fungsi* dan *prosedur* menjadi fokus utama.
+ Fungsi dan prosedur digunakan untuk memanipulasi data.
+ Data bersifat pasif.

<img src="https://1.bp.blogspot.com/-lUvgDKsl5ac/V9PctlGAk7I/AAAAAAAABoc/ECbb-2wQbuALC5dzYQh8X-52Nyo-AjMXQCLcB/s1600/prosedural.jpg" width="500">

## Pemrograman Berorientasi Objek

+ Fungsi dan data bukan menjadi dua hal yang terpisah.
+ Fungsi dan data menjadi satu kesatuan yang disebut sebagai **objek** aktif.
+ Cara pandang --> program adalah serangkaian objek yang bekerja sama untuk menyelesaikan suatu problem.

<h1 align="center">Konsep OOP</h1>

## Apa itu Objek (*Object*)

+ Semua benda yang ada di dunia nyata dapat dianggap sebagai obyek.
+ Contoh: rumah, mobil, sepeda motor, gelas, komputer, meja dll.
+ Objek dalam OOP juga dapat mereprensentasitakan objek dalam dunia nyata.
+ Setiap objek memiliki atribut / properti / state.
+ Setiap objek memiliki tingkah laku / method / function.
+ Contoh: objek sepeda.

    + Memiliki atribut --> Warna, jumlah roda, merk, dll.
    + Memiliki *method* --> mempercepat, melambatkan, perpindahan gigi sepeda, berhenti, dll.

+ Penggambaran pemrograman berorientasi objek = penggambaran pada dunia nyata.
+ Pada pemrograman berorientasi objek :

    + Atribut (*state*) disimpan pada --> variabel.
    + Tingkah laku disimpan pada  --> *method*.

## Karakteristik OOP

Suatu program disebut pemrograman berbasis objek (OOP) karena diantaranya terdapat:

+ Kelas
+ Objek
+ *Encapsulation* (pembungkusan)
+ *Inheritance* (pewarisan)
+ *Polymorphism* (Polimorfisme - perbedaan bentuk/memiliki banyak bentuk)

## Kelas (*class*)

+ Definisi *class*: merupakan *template*/*prototipe*/*blue prints* yang mendefinisikan variabel dan *method* secara umum untuk membuat *object*.
+ Objek merupakan hasil instansiasi dari suatu kelas (*class*).
+ Prose pembentukan objek daru suatu *class* disebut dengan ***instantiation***.
+ Objek disebut juga ***instances*** di dalam OOP.

<img src="https://intellipaat.com/mediaFiles/2019/03/python10.png" title="Class and Object" width="500">

### Class in UML[^2]

[^2]: UML (*Unified Modelling Language*) adalah suatu metode dalam pemodelan secara visual yang digunakan sebagai sarana perancangan sistem berorientasi objek. lebih jelasnya klik [di sini](https://www.dicoding.com/blog/apa-itu-uml/ "Apa itu UML? Beserta Pengertian dan Contohnya"). 
<p align="center">
    
|Cars|
|----|
|- color <br>- merk <br>- year|
|speedup()<br>slowdown()<br>stop()<br>braking()|

</p>

### class in java

<img src="https://www.w3resource.com/w3r_images/java-class-image.png" width="600">

## Kelebihan OOP

+ Reusabilitas. class-class yang sudah ada dapat kalian gunakan kembali di project dan development yang lain. Baik langsung pakai atau hanya butuh sedikit perubahan, tetapi jauh lebih mudah daripada harus membangun class lagi, bukan?
+ Fleksibilitas lebih tinggi 
+ Ekstensibilitas
+ *Less maintenance*

