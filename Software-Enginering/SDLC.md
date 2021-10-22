
<h1 align="center">SYSTEM DEVELOPMENT LIFE CYCLE</h1>

<h4 id="definisi"> Definisi :</h4>

Merupakan model konseptual yang berfungsi untuk mengembangkan tahapan-tahapan dalam pengembangan sistem.

#### Tahapan :
1. [Planning](#planning)
2. Analysis
3. Design
4. Implementasi

<h2 id="planning" align="center">PLANNING</h2>

<h3 id="perencanaan">APA ITU PERENCANAAN?</h3>

Proses yang dilakukan untuk membuat rencana[^1].

[^1]: suatu keinginan atau keputusan untuk melakukan sesuatu/mencapai sesuatu di masa depan.

#### Perencanaan :
+ **Why**:Mengapa dilakukan.
+ **What**: Apa yang harus dilakukan.
+ **When**: Kapan dilakukan.
+ **Who**: Siapa yang melakukan.
+ **How**: Bagaimana cara melakukannya.

<br>

<h3 id="apa">APA ITU SYSTEM PLANNING?</h3>

Merupakan fase dimana ide dan pemahaman dasar *mengapa* sistem harus dibuat, *bagaimana* seharusnya sistem dibuat serta *bagaimana* membuatnya.


<h3 id="mengapa">MENGAPA MEMBUTUHKAN PERENCANAAN?</h3>

**Proyek sistem** merupakan hajatan besar di mana :
+ Melibatkan orang yang banyak
+ Memerlukan biaya yang besar
+ Memerlukan waktu yang cukup lama

> Sehingga, perlu perencanaan yang matang dan teliti sebelum sistem tersebut diputuskan untuk dibangun dan diimplementasikan.


<h3 id="tahapan">TAHAPAN PADA SISTEM PLANNING</h3>

<table align="center">
  <tr align="left">
    <th rowspan=2 align="center">1. </th>
    <th rowspan=2>Inisiasi Proyek</th>
    <td>1. Identifikasi proyek</td>
    <td><b>Output</b>: System request.<br><b>Siapa yang membuat</b> : Project Sponsor.
  </tr>
  <tr align="left">
    <td>2. Analisa Kelayakan</td>
    <td><b>Output</b>: Laporan kelayakan proyek.<br><b>Siapa yang membuat</b> : Project Sponsor & IS/IT Departement.
  </tr>
  <tr align="left">
    <th align="center">2. </th>
    <th>Pemilihan Proyek</th>
    <td></td>
    <td><b>Output</b>: Proyek yang terpilih.<br><b>Siapa yang melakukan </b>:<i>Approval Commite</i>
  </tr>
  <tr align="left">
    <th align="center">3.</th>
    <th>Manajemen Proyek</th>
    <td></td>
    <td><b>Output</b>: Project Plan.<br><b>Siapa yang melakukan</b>: Project Manager</td>
  </tr>
</table>

### PLANNING
1. <b id="ident1-proyek">Identifikasi proyek</b> (*project identification*) [⬇️](#ident-proyek "Pemaparan lebih lanjut")

   + Permintaan sistem (*system request*) &rarr; mengidentifikasi dan memetakan kebutuhan bisnis (yang mengajukan project sponsor).
3. **Melakukan analisa kelayakan** (*feasibility analysis*)

   + Mengukur dan mengidentifikasi keuntungan yang didapatkan organisasi jika sistem informasi dibangun.
   + Melakukan analisa kelayakan (*fesibility analysis*). 

      + Technical feasibility (dapatkah kita membuatnya?)
      + Economic feasibility (apakah sistem akan memberikan *value* bagi perusahaan?)
      + Organizational / Operational feasibility (jika kita membuatnya, akankah sistem digunakan?)
5. **Pemilihan proyek** (*project selection*)

    + Dilakukan oleh <i title="Komiter persetujuan">approval commite</i> (AC)
    + Laporan *feasability analysis* \+ *system request* yang sudah direvisi diserahkan ke <i title="Komite persetujuan">approval commite</i>. AC kemudian memutuskan untuk menyetujui, menolak atau menunda proyek yang diajukan.
7. **Manajemen proyek** (*project management*)

    + Workplan
    + staffs the project

---

<h3 id="ident-proyek">1. IDENTIFIKASI PROYEK (<i>PROJECT IDENTIFICATION</i>)</h3> 

<h4 id="request"> Apa itu Sysem Request??</h4>

+ ***System Request*** merupakan dokumen yang mendeskripsikan hal-hal utama yang melandasi dibangunnya sebuah sistem dan manfaat apa saja yang diharapkan jika sistem diimplementasikan.
+ ***System request*** disusun dan dibuat oleh <em>Project Sponsor</em>

#### Siapa Project Sponsor??

   Orang atau unit kerja dalam perusahaan yang memberikan ide dan gagasan / yang mengajukan untuk membangun sebuah sistem yang dapat menjawab kebutuhan bisnis (*business need*) dari perusahaan.

#### Siapa Approval Commite??

+ Orang/tim/komite yang bertanggung jawab untuk mereview sebuah proyek dan memiliki kewenangan untuk menerima, menolak atau menunada pelaksanaan sebuah proyek.
+ Biasanya proyek SI teridentifikasi/muncul berdasarkan kebutuhan bisnis organisasi (*business needs*) terhadap sebuah sistem.
+ Contoh kebutuhan bisnis (*business needs*):

    + **Untuk mendukung strategi pemasaran yang baru**
    + **Mendukung target customer yang baru**
    + **Memperbaiki hubungan interaksi dengan supplier**
    + **Dan lain-lain**

+ Didokumentasikan ke dalam [*system request*](#request).
    
***Business needs* bisa muncul karena:**
1. Suatu "**pengalaman pahit**" yang dialami perusahaan. Contoh:

    + Pangsa pasar menurun
    + *Customer service* yang buruk
    + Kompetisi bisnis yang semakin meningkat
3. Perusahaan menemukan cara yang berbeda untuk berkompetisi dengan kompetitor bisnisnya menggunakan teknologi informasi. Contoh:

    **Misalnya** saja kita berada pada masa-masa awal teknologi internet, *smart card* dan perangkat *mobile*. Perusahaan melihat teknologi-teknologi tersebut memiliki potensi yang luar biasa untuk mendukung strategi bisnisnya. Sehingga, perusahaan dapat membangun sebuah sistem yang menggunakan seluruh teknologi tersebut dan memperkenalkan sistem tersebut di pasaran. Perusahaan sebagai ***first mover***, idealnya akan mendapatkan keuntungan selama belum ada yang menggunakan teknologi serupa. Dan kemudian terus berinovasi dengan teknologi tersebut ketika pesaing-pesaingnya mulai menggunakan teknologi serupa.
    
    contoh first mover: Aqua, Gojek/Grab Bike

[🔙](#ident1-proyek "Kembali")




