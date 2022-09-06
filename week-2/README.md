## Açıklama
[UI ödevini görebilmek için buraya tıklayın.](https://github.com/FMSSBilisimAndroid/furkan-balci/tree/main/week-2/ui)

## Lazy ve Eager nedir?

### Lazy Loading Nedir?
Sadece o anda ihtiyacı olan ve gösterilmesi gereken nesnelerin çağrılması anlamına gelir. Bunu bir mobil uygulama üzerinden örnek verecek olursak, 100 tane öğrenciyi ekranda listeleyeceğiz fakat ilk başta ekranımıza sadece 25 tanesi sığıyor. Diğer öğrencileri görebilmemiz için ekranı aşağıya doğru kaydırmamız gerekecektir. Geriye kalan 75 tane öğrenciyi ekranı kaydırdığımız anda görünecek olanları yüklemesi lazy loading anlamına gelmektedir. Bu hem performans açısından hem de veri kullanımı açısından oldukça önemlidir.

### Eager Loading Nedir?
Lazy loading'e göre tam tersi olarak çalışır. 100 tane öğrenci varsa uygulama çalıştığı zaman 100 öğrenciyi de aynı anda yükler. Eager loading, lazy loading'e göre veri tabanıyla çok daha az iletişim kurar.

## Eager ve Lazy Filters

Elimizde öğrencilerimizin olduğu bir liste düşünelim.
```kotlin
val students = listOf("İlke", "Mehmet", "Esma", "Fazıl", "Furkan", "Pelin", "Ensar", "Elif")
```
Bu listede ismi 'E' harfi ile başlayan kişileri farklı bir listede tutalım ve ekrana yazdıralım.

### Eager Filters
Eager filters'da yapmamız gereken tek şey basit bir filters yapmak olacaktır.
```kotlin
val newList = students.filter {it[0] == 'E'}
println(newList)
```
Çıktı: 
```bash
["Esma", "Ensar", "Elif"]
```

### Lazy Filters
Diğerine kıyasla ekstra bir anahtar kelime olarak **asSequence()** kullanmamız gerekecektir.
```kotlin
val newList = students.asSequence().filter {it[0] == 'E'}
println(newList)
```
Çıktı:
```bash
kotlin.sequences.FilteringSequence@a2ce542e
```
Gördüğünüz gibi bir liste döndürmek yerine bir obje döndürdü. **Eğer ki bu listeyi ihtiyacımız olan yerde kullanmak isteseydik ```newList.toList()``` yazmamız yeterli olacaktı.

##
İki farklı sisteminden avantajları ve dezavantajları vardır. Yapmak istediğimiz işleme göre ikisinden birini tercih edebiliriz. 

## 
![](https://ottball.com/content/images/2020/06/image-5-min.png)
