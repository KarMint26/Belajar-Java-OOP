package ObjectOrientedProgramming.Java.Karel.Materi;

public class MateriJavaOOP {
    public static void main(String[] args) {
        // Materi OOP //

        /*
         * Class
         * Class adalah BluePrint, prototype atau cetakan untuk membuat Object.
         * Class berisikan deklarasi semua properties dan functions yang dimiliki oleh Object.
         * Setiap Object selalu dibuat dari class.
         * Dan Sebuah Class bisa membuat object tanpa batas.
         */

        /*
         * Object
         * Object adalah hasil instansiasi dari sebuah class.
         * Untuk membuat object kita bisa menggunakan kata kunci new, dan diikuti dengan nama Class
         * dan kurung().
         */

        /*
         * field / properties / attributes
         * Adalah data yg bisa kita sisipkan didalam object.
         * Namun sebelum kita bisa memasukkan data di fields, kita harus mendeklarasikan data apa
         * saja yg dimiliki oleh object tersebut di dalam deklarasi class-nya.
         * Membuat field sama seperti membuat variable, namun ditempatkan di block class.
         */

        /*
         * Constructor
         * Saat kita membuat Object, maka kita seperti memanggil sebuah method, karena kita menggunakan
         * kurung(). Didalam class Java, kita bisa membuat constructor, constructor adalah method
         * yang akan dipanggil saat pertama kali Object dibuat.
         * Mirip seperti di Method, kita bisa memberi parameter pd constructor.
         * Nama constructor harus sama dengan nama class, tidak membutuhkan kata kunci void atau
         * return value
         */

        /*
         * Constructor Overloading
         * Sama seperti di method, di constructor pun kita bisa melakukan overlaoding.
         * Kita bisa membuat constructor lebih dari 1, dengan syarat tipe data parameter harus
         * berbeda, atau jumlah parameter harus berbeda.
         */

        /*
         * Variable Shadowing
         * adalah kejadian ketika kita membuat nama variable dengan nama yang sama di scope yang menutupi
         * variable dengan nama yang sama di scope diatasnya.
         * Ini biasa terjadi seperti kita membuat nama parameter dimethod sama dengan nama field di class.
         * Saat terjadi variable shadowing, maka secara otomatis variable di scope diatasnya tidak bisa diakses.
         */

        /*
         * This Keyword
         * Saat kita membuat kode didalam block constructor atau method di dalam class, kita bisa menggunakan
         * kata kunci this untuk mengakses object saat ini.
         * Misal kadang kita butuh mengakses sebuah field yang namanya sama dengan parameter method, hal ini
         * tidak bisa dilakukan jika langsung menyebut nama field (Variable Shadowing), kita bisa mengakses
         * nama field tersebut dengan kata kunci This.
         * This juga tidak hanya digunakan untuk mengakses field milik object saat ini, namun juga bisa digunakan
         * untuk mengakses method. This bisa digunakan untuk mengatasi masalah variable shadowing.
         */

        /*
         * Inheritance atau pewarisan adalah kemampuan untuk menurunkan sebuah class ke class lain.
         * Dalam artian, kita bisa membuat class Parent dan class Child.
         * Class Child, hanya bisa punya satu class Parent, namun satu class Parent bisa punya banyak
         * class Child.
         * Saat sebuah class diturunkan, maka semua field dan method yang ada di class Parent, secara
         * otomatis akan dimiliki oleh class Child.
         * Untuk melakukan pewarisan, di class Child, kita harus menggunakan kata kunci extends lalu
         * diikuti dengan nama class Parentnya.
         */

        /*
         * Method Overriding
         * Method Overriding adalah kemampuan mendeklarasikan ulang method di child class, yang sudah
         * ada di parent class.
         * Saat kita melakukan proses overriding tersebut, secara otomatis ketika kita membuat object
         * dari kelas child, method yang di class parent tidak bisa diakses lagi.
         */

        /*
         * Super Keyword
         * Kadang kita ingin mengakses method yang terdapat di class parent yang sudah terlanjur kita
         * override di class Child.
         * Untuk mengakses method milik class Parent, kita bisa menggunakan kata kunci super.
         * Sederhananya, super digunakan untuk mengakses class parent.
         * Tidak hanya method, field milik parent class pun bisa kita akses menggunakan kata kunci super.
         */

        /*
         * Super Constructor
         * Tidak hanya untuk mengakses method atau field yang ada di parent class, kata kunci super juga
         * bisa digunakan untuk mengakses constructor.
         * Namun syaratnya untuk mengakses parent class constructor, kita harus mengaksesnya di dalam
         * class Child Constructor.
         * Jika sebuah class parent tidak memiliki constructor yang tidak ada parameter-nya(tidak memiliki
         * default constructor), maka class child wajib mengakses constructor class parent tersebut.
         */

        /*
         * Object Class
         * Di Java, setiap class yang kita buat secara otomatis adalah turunan dari class Object.
         * Walaupun tidak secara langsung kita eksplisit menyebutkan extends Object, tapi secara
         * otomatis Java akan membuat class kita extends Object.
         * Bisa dikatakan class Object adalah superclass untuk semua class yang ada di Java.
         */

        /*
         * PolymorphismApp
         * polymorphism berasal dari bahasa Yunani yang berarti banyak bentuk.
         * Dalam OOP, PolymorphismApp adalah kemampuan sebuah object berubah bentuk menjadi bentuk lain.
         * PolymorphismApp erat hubungannya dengan inheritance.
         */

        /*
         * Type Check & Casts
         * Sebelumnya kita sudah tau cara melakukan konversi tipe data(casts) di tipe data Primitive.
         * Casts juga bisa digunakan untuk tipe data bukan Primitive.
         * Namun agar aman, sebelum melakukan casts, pastikan kita melakukan type check(pengecekan
         * tipe data), dengan menggunakan kata kunci instanceof.
         * Hasil operator instanceof adalah boolean, true jika tipe data sesuai, false jika tidak sesuai.
         */

        /*
         * Variable hiding merupakan masalah yang terjadi ketika kita membuat nama field sama di class
         * Child dengan nama field di class parent.
         * Tidak ada yang namanya field overriding, ketika kita buat ulang nama field di class class, itu
         * berarti variable hiding.
         * Untuk mengatasi variable hiding, caranya kita bisa menggunakan super keywoard.
         * Yang membedakan variable hiding dan method overriding adalah ketika sebuah object di casts.
         * Saat object di casts, method akan tetap mengakses method overriding, namun variable akan
         * mengakses variable yang ada di classnya.
         */

        /*
         * Package
         * Saat kita membuat aplikasi, bisa dipastikan kita akan banyak sekali membuat class.
         * Jika class terlalu banyak, kadang akan menyulitkan kita untuk mencari atau mengklasifikasikan
         * jenis-jenis class.
         * Java memiliki fitur package, yaitu fitur mirip folder/direktori, dimana kita bisa menyimpan
         * class-class kita di dalam package.
         * Sama seperti folder / direktori, package juga bisa nested, kita bisa menggunakan tanda titik(.)
         * untuk membuat nested package.
         * Ketika kita menyimpan class di dalam package, maka diatas file Javanya. kita wajib menyebutkan
         * nama package nya.
         */

        /*
         * Access modifier adalah kemampuan membuat class, field, method dan constructor dapat diakses
         * dari mana saja.
         * Sebelumnya kita sudah melihat 2 access modifier, yaitu public dan default(no-modifier).
         * Sekarang kita akan bahas access modifier lainnya.
         *
         * Access Level
         * Modifier     Class       Package     Subclass        World
         * public       Y           Y           Y               Y
         * protected    Y           Y           Y               N
         * no modifier  Y           N               N
         * private      Y           N           N               N
         *
         * Public Class
         * Saat membuat public class, kita hanya bisa membuat 1 public class di 1 file java.
         * Selain itu, nama public class harus sama dengan nama file.
         */

        /*
         * Import adalah kemampuan untuk menggunakan class yang berada dipackage yang berbeda.
         * Syarat class yang bisa digunakan jika packagenya berbeda adalah class yang harus public.
         */

        /*
         * Import Semua Package
         * Jika kita ingin mengimport semua class di dalam sebuah package, kita bisa menggunakan tanda*,
         * misal.
         * Import karel.belajar.oop.data.*
         */

        /*
         * Default Import
         * Secara default, semua class yang ada di package java.lang sudah auto import, jadi kita tidak
         * perlu melakukan import secara manual.
         * Contoh class String, Integer, Long, Boolean, dan lain-lain terdapat di package java.lang. Oleh
         * karena itu, kita tidak perlu meng-importnya secara manual.
         */

        /*
         * Abstract Class
         * Saat kita membuat class, kita bisa menjadikan sebuah class sebagai abstract class.
         * Abstract class artinya, class tersebut tidak bisa dibuat sebagai object secara langsung, hanya
         * bisa diturunkan.
         * Untuk membuat sebuah class menjadi abstract, kita bisa menggunakan kata kunci abstract sebelum
         * kata kunci class.
         * Dengan demikian abstract class bisa kita gunakan sebagai kontrak untuk class child.
         */

        /*
         * Abstract Method
         * Saat kita membuat class yang abstract, kita bisa membuat abstract method juga didalam class
         * abstract tersebut.
         * Saat kita membuat sebuah abstract method, kita tidak boleh membuat block method untuk method
         * tersebut.
         * Artinya, abstract method wajib di override di class Child.
         * Abstract method tidak boleh memiliki access modifier private.
         */

        /*
         * Getter and Setter
         * ENCAPSULATION Artinya memastikan data sensitif sebuah object tersembunyi dari akses luar.
         * Hal ini bertujuan agar kita bisa menjaga agar data sebuah object tetap baik dan valid.
         * Untuk mencapai ini, biasanya kita akan membuat semua field menggunakan access modifier private
         * sehingga tidak bisa diakses atau diubah dari luar.
         * Agar bisa diubah, kita akan menyediakan method untuk mengubah dan mendapatkan field tersebut.
         *
         * Getter dan Setter
         * Di Java, proces encapsulation sudah dibuat standarisasinya, dimana kita bisa menggunakan Getter
         * dan Setter method.
         * Getter adalah function yang dibuat untuk mengambil data field.
         * Setter adalah function yang dibuat untuk mengubah data field.
         *
         * Tipe Data        Getter Method       Setter Method
         * Boolean          isXxx()             setXxx(boolean value)
         * primitif         getXxx()            setXxx(primitif value)
         * Object           getXxx()            setXxx(Object value)
         */

        /*
         * Interface
         * Sebelumnya kita sudah tahu bahwa abstract class bisa kita gunakan sebagai kontrak untuk class
         * Child nya.
         * Namun sebenarnya yang lebih tepat untuk kontrak adalah Interface.
         * Jangan salah sangka bahwa interface disini bukanlah User Interface.
         * Interface mirip seperti abstract class, yang membedakan adalah di interface, semua method
         * otomatis abstract, tidak memiliki block.
         * Di Interface kita tidak boleh memiliki field, kita hanya boleh memiliki constant(field yang tidak bisa diubah).
         * Untuk mewariskan interface, kita tidak menggunakan kata kunci extends, melainkan implements.
         */

        /*
         * Default Method
         * Sebelumnya, kita tidak bisa membuat method konkrit yang memiliki block method.
         * Namun sejak versi Java 8, ada fitur default method di interface.
         * Fitur ini terjadi karena sulit untuk maintain kontrak interface jika sudah terlalu banyak
         * class yang implement interface tersebut.
         * Ketika kita menambah satu method di interface, secara otomatis semua class yang implement akan
         * rusak karena harus meng-override method tersebut.
         * Dengan menggunakan default method, kita bisa menambahkan konkrit method di interface.
         */

        /*
         * ToString Method
         * toString() adalah method yang terdapat di class Object.
         * Method ini biasanya digunakan untuk merepresentasikan object dalam bentuk String.
         * Secara default, toString() ini akan menghasilkan : namaclass + @ + hashCode.
         * Namun kita bisa mengubahnya jika kita mau, agar object yang kita buat lebih mudah dibaca.
         */

        /*
         * Equals Method
         * Di bahasa pemrograman lain, untuk mengecek apakah sebuah object sama, biasanya menggunakan operator
         * ==, Di Java, operator == hanya untuk mengecek data primitif. Untuk non primitif pengecekannya
         * menggunakan method equals. Secara default, method equals itu akan membandingkan dua buah object
         * secara kesamaan posisi object tersebut di memory, artinya jika kita membuat 2 object yang isi field
         * nya sama, tetap dianggap beda oleh method equals.
         * Oleh karena itu, ada baiknya kita meng-override method equals milik class Object tersebut.
         */

        /*
         * HashCode Method
         * Method hashCode adalah method representasi Integer object kita, mirip toString yang merupakan
         * representasi String, hashCode adalah representasi Integer.
         * HashCode sangat bermanfaat untuk membuat struktur data unique seperti HashMap, Set, dan lain2,
         * karena cukup menggunakan hashCode method untuk mendapatkan identitas unique object kita.
         * Secara default hashCode akan mengembalikan nilai Integer sesuai data di memory, namun kita bisa
         * mengoverride nya jika kita ingin.
         *
         * Kontrak untuk mengoverride method HashCode(), yaitu :
         * Sebanyak apapun hasCode dipanggil, untuk object yang sama, harus menghasilkan data Integer
         * yang sama.
         * Jika ada 2 object yang sama jika dibandingkan menggunakan method equals, maka nilai hashCode
         * nya juga harus sama.
         * Tidak wajib hashCode berbeda jika method equals menghasilkan false, karena memang keterbatasan
         * jumlah integer sekitar 2 milyar.
         */

        /*
         * Final Class
         * Jika digunakan di variable, maka variable tersebut tidak bisa berubah lagi datanya.
         * Final pun bisa digunakan di class, dimana jika kita menggunakan kata kunci final sebelum class,
         * maka kita menandakan bahwa class tersebut tidak bisa diwariskan lagi.
         * Secara otomatis semua class child nya akan error.
         */

        /*
         * Final Method
         * Kata kunci final juga bisa digunakan di Method.
         * Jika sebuah method kita tambahkan kata kunci final, maka artinya method tersebut tidak bisa di
         * override lagi di class Childnya.
         * Ini sangat cocok jika kita ingin mengunci implementasi dari sebuah method agar tidak bisa diubah
         * lagi oleh class childnya.
         */

        /*
         * Inner Class
         * Di Java, kita bisa membuat class di dalam class, atau disebut dengan inner Class.
         * Salah satu kasus kita membuat inner class biasanya ketika kita butuh mmembuat beberapa class
         * yang saling berhubungan, dimana sebuah class tidak bisa dibuat tanpa class lain.
         * Misal kita perlu membuat Class Employee, dimana membutuhkan class Company, maka kita bisa
         * membuat class Employee sebagai inner class Company.
         * Cara membuat inner class, cukup membuatnya di dalam blok class outer classnya.
         *
         * Mengakses Outer Class
         * Keuntungan saat kita membuat inner class adalah, kemampuan untuk mengakses outer classnya.
         * Inner class bisa membaca semua private member yang ada di outer class nya.
         * Untuk mengakses object outer class nya, kita bisa menggunakan nama class outer nya diikuti
         * dengan kata kunci this, misal Company.this.
         * Dan untuk mengakses super class outer class nya, kita bisa menggunakan nama class outer nya
         * diikuti dengan kata kunci super, misal Company.super.
         */

        /*
         * Anonymous Class
         * Class tanpa nama adalah kemampuan mendeklarasikan class, sekaligus meng-instansiasi object-nya
         * secara langsung. Anonymous class sebenarnya termasuk inner class, dimana outer class nya adalah
         * tempat dimana kita membuat anonymous class tersebut.
         * Anonymous class sangat cocok ketika kita berhadapan dengan kasus membuat implementasi interface
         * atau abstract class sederhana, tanpa harus membuat implementasi class nya.
         */

        /*
         * Static Keyword
         * Dengan menggunakan kata kunci static, kita bisa membuat field, method atau class bisa diakses
         * langsung tanpa melalui objectnya.
         * Perlu diingat, static hanya bisa mengakses static lainnya.
         *
         * Static dapat digunakan di
         * Field, atau disebut class variable, artinya field tersebut bisa diakses langsung tanpa membuat
         * object terlebih dahulu.
         * Method, atau disebut class method, artinya method tersebut bisa diakses langsung tanpa membuat
         * object terlebih dahulu.
         * Block, static block akan otomatis dieksekusi ketika sebuah class di load.
         * Inner Class, artinya inner class tersebut bisa diakses secara langsung tanpa harus membuat object
         * outer class terlebih dahulu. Static pada inner class menyebabkan kita tidak bisa mengakses lagi
         * object outer class-nya.
         */

        /*
         * Record Class
         * Kadang kita sering membuat class, hanya untuk class yang berisikan data. Hanya berisi getter,
         * equals, hashCode, dan toString method.
         * Record Class digunakan untuk mempermudah pembuatan jenis class tersebut.
         * Saat kita membuat record class, secara otomatis Java akan membuatkan getter, equals, hashCode
         * dan toString method secara otomatis, dan juga constructor secara otomatis.
         * Saat membuat record class, secara otomatis kita akan meng-extends class Java.Record, yang artinya
         * kita tidak bisa extends class lain, Namun kita tetap bisa meng-implement interface.
         *
         * Record Class Constructor
         * Secara default, constructor di record cass akan dibuat secara otomatis, sesuai dengan definisi
         * record class parameter.
         * Namun jika kita ingin melakukan sesuatu di constructor tersebut, kita bisa membuat compact
         * constructor, yaitu constructor tanpa tanda ().
         * Selain itu, kita juga bisa melakukan constructor overloading, namun ada syaratnya, yaitu
         * constructor overloading-nya harus tetap memanggil constructor utama yang secara otomatis akan
         * dibuatkan di record class.
         */

        /*
         * Enum Class
         * Saat kita membuat aplikasi, kadang kita akan bertemu dengan jenis-jenis data yang nilainya
         * terbatas.
         * Misal gender, ada male dan female, atau tipe customer, ada standard, premium atau vip, dll
         * Dalam kasus seperti ini, kita bisa menggunakan enum clas, yaitu class yang berisikan nilai
         * terbatas yang sudah ditentukan.
         * Saat membuat enum class, secara otomatis dia akan meng-extends class java.lang.Enum, oleh karena
         * itu class enum tidak bisa extends class lain, namun masih tetap bisa implements interface.
         *
         * Enum Members
         * Sama seperti class biasanya, di class enum pun kita bisa menambahkan members (field, emthod dan
         * constructor).
         * Khusus constructor, kita tidak bisa membuat public constructor, karena memang tujuan enum
         * bukan untuk di instansiasi secara bebas.
         */

        /*
         * Exception
         * Saat kita membuat aplikasi, kita tidak akan terhindar dengan namanya error.
         * Di Java, error direpresentasikan dengan istilah exception, dan semua direpresentasikan dalam
         * bentuk class exception.
         * Kita bisa menggunakan class exception sendiri, atau menggunakan yang sudah disediakan oleh
         * Java.
         * Jika kita ingin membuat exception, maka kita harus membuat class yang extends class Throwable
         * atau turunan-turunannya.
         *
         * Membuat exception
         * Exception biasanya terjadi di method, ketika kita membuat exception di sebuah method, maka
         * method tersebut ahrus ditandai dengan kata kunci thrown diikuti dengan class exceptionnya.
         * Jika method tersebut bisa menimbulkan lebih dari satu jenis exception, kita bisa menambah lebih
         * dari satu class exception.
         * Di dalam kode program kita, untuk membuat exception kita cukup menggunakan kata kunci throw,
         * diikuti dengan object exception-nya.
         *
         * Try Catch
         * Saat kita memanggil sebuah function yang bisa menyebabkan exception, maka kita wajib menggunakan
         * try-catch expression di Java.
         * Ini gunanya agar kita bsia menangkap exception yang terjadi, karena jika tidak ditangkap, lalu
         * terjadi exception, maka secara otomatis program kita akan berhenti.
         * Cara menggunakan try-catch expression di Java sangat mudah, di block try, kita panggil method
         * yang bisa menyebabkan exception, dan di block catch, kita bisa melakukan sesuatu jika terjadi
         * exception.
         *
         * Finally Keyword
         * Dalam Try-catch, kita bisa menambahkan block finally.
         * Block finally ini adalah block dimana akan selalu dieksekusi baik terjadi exception ataupun tidak.
         * Ini sangat cocok ketika kita ingin melakukan sesuatu, tidak peduli sukses ataupun gagal, misal di
         * block try kita ingin membaca file, di block catch kita akan tangkap jika terjadi error, dan di block
         * finally error ataupun sukses membaca file, kita wajib menutup koneksi ke file tersebut, biar tidak
         * menggantung di memory.
         *
         * Jenis Exception
         * Ada 3 jenis secara garis besar, yaitu
         * Checked Exception, yaitu exception yang wajib di try catch.
         * Runtime Exception, dan Error.
         *
         * Runtime Exception
         * Adalah jenis exception yang tidak wajib di tangkap menggunakan try catch.
         * Compiler Java tidak akan protes walaupun kita tidak menggunakan try catch ketika kita memanggil
         * method yang bisa menyebabkan runtime exception.
         * Untuk membuat class runtime exception, kita wajib meng-extends class RuntimeException.
         * Ada banyak di Java yang merupakan Runtime Exception, seperti NullPointerException, IllegalArgumentException,dll.
         * Walaupun runtime exceptio0n tidak wajib di try-catch, tapi ada baiknya kita tetap melakukan try-catch.
         * Karena jika terjadi runtime exception, yang ditakutkan adalah program kita berhenti.
         *
         * Error
         * Adalah jenis exception yang terakhir.
         * Error adalah sebuah class di Java, yang tidak direkomendasikan untuk di try-catch.
         * Biasanya error terjadi ketika ada masalah serius, dan sangat tidak direkomendasikan untuk
         * di try-catch.
         * Artinya, direkomendasikan untuk mematikan aplikasi.
         * Contoh, misal jika diawal aplikasi kita tidak bisa terkoneksi ke database, di rekomendasikan
         * untuk membuat exception jenis Error, dan menghentikan aplikasi.
         */

        /*
         * StackTraceElement Class
         * Throwable memiliki method yang bernama getStackTrace(), dimana menghasilkan Array dari
         * StackTraceElement Object.
         * STE berisikan informasi tentang, class, file bahkan baris lokasi terjadinya error.
         * Class StackTraceElement ini sangat penting untuk menelusuri lokasi kejadian error yang terjadi.
         * Cara yang paling mudah, kita bisa memanggil method printStackTrace() class Throwable, untuk
         * memprint ke console detail error StackTraceElement-nya.
         */

        /*
         * Try With Resource
         * Di Java 7, terdapat fitur baru yang bernama try with resource.
         * Try With Resource adalah sebuah mekanisme agar kita lebih mudah menggunakan resource(yang wajib di close)
         * dalam block Try.
         * Jika kita ingin menggunakan fitur ini, kita wajib menggunakan interface AutoCloseable.
         */

        /*
         * ANNOTATION
         * Annotation adalah menambahkan metadata ke kode program yang kita buat.
         * Tidak semua orang membutuhkan annotation, biasanya Annotation digunakan saat kita ingin membuat library
         * atau Framework.
         * Annotation sendiri bisa diakses menggunakan Reflection.
         * Untuk membuat annotation, kita bisa menggunakan kata kunci @interface.
         * Annotation hanya bisa memiliki method dengan tipe data sederhana, dan bisa memiliki default value.
         *
         * Attribute            Keterangan
         * @Target              Memberitahu annotation bisa digunakan di mana? Class, method, field, dll.
         * @Retention           Memberitahu annotation apakah disimpan di hasil kompilasi, dan apakah bisa
         *                      di baca oleh Reflection.
         *
         * Predefined Annotation
         * @Override, untuk menandai bahwa method yang meng-override method parent class-nya.
         * @Deprecated, untuk menandai bahwa method tersebut tidak direkomendasikan lagi untuk digunakan.
         * @FunctionalInterface, untuk menandai bahwa class tersebut bisa dibuat sebagai lambda expression, ect.
         */

        /*
         * Reflection
         * Adalah kemampuan melihat struktur aplikasi kita pada saat berjalan.
         * Reflection biasanya sangat berguna saat kita ingin membuat library ataupun framework, sehingga bisa
         * meng-otomatisasi pekerjaan.
         * Untuk mengakses reflection class dari sebuah object, kita bisa menggunakan method getClass() atau
         * NamaClass.class
         */

    }
}
