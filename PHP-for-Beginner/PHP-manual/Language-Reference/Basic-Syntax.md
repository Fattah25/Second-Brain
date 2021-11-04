<h1 align="center">Dasar Sintaks</h1>

## PHP Tags

Saat PHP mem-*parsing* (menguraikan) file, ia mencari tag pembuka dan penutup, yaitu `<?php` dan `?>` yang memberi tahu PHP untuk memulai dan berhenti menafsirkan kode di 
antara keduanya. *Parsing* dengan cara ini memungkinkan PHP untuk disematkan di semua jenis dokumen yang berbeda, karena segala sesuatu di luar sepasang tag pembuka 
dan penutup akan diabaikan oleh pengurai (*parser*) PHP.

PHP menyertakan tag *echo* pendek `<?=` yang merupakan singkatan dari  `<?php echo` yang lebih bertele-tele (*verbose*).

**Contoh PHP *Opening* dan *closing* tag

```php

 /*1. */ <?php echo 'jika Anda ingin menyajikan kode PHP dalam dokumen XHTML atau XML, gunakan tag ini'; ?>
 /*2. Anda dapat menggunakan tag echo pendek untuk*/ <?= 'print this string' ?>.
 
 /*itu sama dengan*/ <?php echo 'print this string' ?>.
    
 /*3.*/ <? echo 'kode ini dalam tag pendek, tapi masih dapat bekerja '.'jika short_open_tag diaktifkan'; ?>   

```

Tag pendek (contoh tiga) tersedia secara default tetapi dapat dinonaktifkan baik melalui arahan file konfigurasi **short_open_tag** `php.ini`, atau dinonaktifkan secara default jika PHP dibuat dengan konfigurasi **--disable-short-tags**.

> **Note:** 
> 
> Karena tag <em title="tag pendek">short tag</em> dapat dinonaktifkan, disarankan untuk hanya menggunakan tag normal (`<?php ?>` dan `<?= ?>`) untuk memaksimalkan kompatibilitas.

Jika file hanya berisi kode PHP, lebih baik menghilangkan tag penutup (*closing tag*) PHP di akhir file. Ini mencegah ruang kosong yang tidak disengaja atau baris baru ditambahkan setelah tag penutup PHP, yang dapat menyebabkan efek yang tidak diinginkan karena PHP akan memulai *buffering* (memproses) output ketika tidak ada maksud dari programmer untuk mengirim output apa pun pada saat itu dalam skrip.

```php
<?php
echo "Hello world";

// ... more code

echo "Last statement";

// the script ends here with no PHP closing tag

```


### Komentar

Three types of tag are available in php
1.normal tag(`<?php ?>`)
2.short echo tag(`<?= ?>`)
3.short tag(<? ?>)
