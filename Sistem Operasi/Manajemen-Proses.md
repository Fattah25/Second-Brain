# Manajemen Proses

[Proses Control Block](#proses-control-block)
## Konsep Proses

### Tugas sistem operasi pada manajemen proses

+ Membuat dan menghapus proses pengguna dan sistem proses.
+ Menunda atau melanjutkan proses.
+ Menyediakan mekanisme untuk proses komunikasi.
+ Menyediakan mekanisme untuk proses sinkronisasi.
+ Menyediakan mekanisme untuk penanganan ***deadlock***[^1].
[^1]: Deadlock adalah situasi yang terjadi di dalam OS ketika suatu proses memasuki status menunggu (*waiting*) karena *waiting process* lainnya menahan permintaan *resource*. Deadlock adalah masalah umum dalam multi-pemrosesan di mana beberapa proses berbagi type khusus dari sumber daya (*resource*) yang saling saling terpisah dari yang lain yang dikenal sebagai *soft lock* atau perangkat lunak (*software*).

#### Proses merupakan semua aktifitas CPU, seperti :
+ Job yang dieksekusi pada sistem batch
+ User Program atau task[^2] pada sistem shared
[^2]: Istilah pada buku teks : *job*, *task* dan *process* (dapat diartikan sama).

|Windows Task Manager|Perintah PS pada UNIX|
|---|---|
|<img src="https://external-content.duckduckgo.com/iu/?u=http%3A%2F%2Fgeektnt.com%2Fstatic%2F2012%2F01%2FWindows-Task-Manager.png&f=1&nofb=1" width=300>|<img src="https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2F4.bp.blogspot.com%2F-t-NiNfw_c1U%2FVFjC-JQNUKI%2FAAAAAAAAAnI%2F8eHhNzayO4E%2Fs1600%2F22.png&f=1&nofb=1" width=300>|

+ Proses adalah program yang sedang dieksekusi.
+ Eksekusi proses dilakukan secara berurutan.
+ Proses bukan hanya "kode program", tapi juga termasuk didalamnya:
    + Aktifitas saat ini yang merupakan nilai dari "program counter / PC"
    + Isi dari register *processor*
    + Program *stack* (tumpukan)
    + "*Data section*" yang berisi variabel global
    + Menyimpan status proses, seperti: aktif, wait I/O request dll.
+ Proses adalah entity aktif, mempunyai program counter yang menunjuk ke instruksi selanjutnya yang akan dieksekusi.
+ Dua proses yang merupakan program yang sama mempunyai urutan eksekusi yang terpisah
+ Suatu proses membutuhkan *resource* untuk menyelesaikan pekerjaannya, dimana *resource* tersebut dialokasikan oleh proses pada saat dibuat atau dieksekusi.
<br>

## Status Proses
+ Saat-saat proses dijalankan (*executed*) maka status dari proses akan berubah
+ Status dari sebuah proses mencerminkan suatu keadaan/aktivitas yang sedang dilakukan oleh proses itu sendiri.
+ Hanya satu proses yang dapat berjalan pada prosesor manapun pada satu waktu, tetapi banyak proses yang dapat berstatus *ready* atau *waiting*

### Status proses terdiri dari 
+ **NEW**
    + Status yang dimiliki pada saat proses baru saja dibuat
+ **RUNNING**
    + Status yang dimiliki pada saat instruksi-instruksi dari sebuah proses dieksekusi
    + Proses bisa dieksekusi karena CPU tidak sedang mengerjakan tugas yang lain
+ **WAITING**
    + Status yang dimiliki pada saat proses menunggu suatu event, seperti penyelesaian I/O atau menerima signal
+ **READY**
    + Status yang dimiliki pada saat proses siap dieksekusi oleh *processor* 
    + Proses menunggu jatah waktu dari *processor*
+ **TERMINATED**
    + Status yang dimiliki pada saat proses telah selesai dieksekusi

### Diagram Status Proses
<img src="https://1.bp.blogspot.com/-sV-9zL4Xnog/X_VhHlpRkFI/AAAAAAAADAQ/JU7MH3CQHqcjk8j8q8qkqpBR65J542xDQCLcBGAsYHQ/w556-h224/Screenshot_29.png" width=400 alt="Diagram" alt="diagram Status Proses">

### Ada 3 kemungkinan bila sebuah proses memiliki status *running*

1. Jika program telah selesai dieksekusi maka status proses berubah menjadi **TERMINATED**
2. Jika waktu yang disediakan oleh OS untuk proses tersebut habis maka akan terjadi **interrupt* dan proses berstatus **READY**
3. Jika suatu *event* terjadi pada saat proses dieksekusi (seperti ada request I?O) maka proses tersebut akan menunggu *event* tersebut dan proses berstatus **WAITING**

## Proses Control Block
PCB hanya berfungsi sebagai tempat penyimpanan informasi yang dapat bervariasi dari proses satu dengan proses yang lainnya.

<table>
    <tr>
        <td align="center">pointer</td>
        <td align="center">state proses</td>
    </tr>
    <tr>
        <td colspan="2" align="center">nomor proses</td>
    </tr>
    <tr>
        <td colspan="2" align="center">program counter (PC)</td>
    </tr>
    <tr>
        <td colspan="2" align="center"><i>registers</i></td>
    </tr>
    <tr>
        <td colspan="2" align="center">batas memori</td>
    </tr>
    <tr>
        <td colspan="2" align="center">daftar berkas yang telah dibuka</td>
    </tr>
    <tr>
        <td colspan="2" align="center">.......</td>
    </tr>
</table>


