Phase 0:Single Responsibilty Prensible(SRP)=Burda SRP nin ihlal edildiği en yaygın durum olan God Object durumu karşımıza çıkıyor.Sistemin bütün görevleri tek bir sınıf çatısı altında toplanmış.Bu da kodun ve nesnenin şişmesine yol açıyor.
Open/Closed Principle(OCP) ihlali= Sisteme yeni bir oyun nesnesi eklemeye çalıştığımızda (Örneğin=Villain,boss,teammate vb.)mevcut if else bloklarını değiştirmek zorunda kalıyoruz.Kod gelişime ve genişletilmeye açık bir yapıda değil.
Güvenlik Eksikliği=Nesne tipleri basit string metinler (Main Charecter,enemy vb.) üzerinden kontrol ediliyor.Örneğin klavyeden string tipi girerken yazım hatası yaparsak kod patlar.Derleme aşamasında hata ayıklama neredeyse imkansız hale gelir.
Nesne Oluşturmanın Kısıtlayıcı Olması = Nesnelerin nasıl oluştulucağı doğrudan constructara sıkıştırılmış.Bir nesne türüne (örneğin düşman) farklı bir silah türü veya özel eşyalarla başlayan bir oyuncu yaratmak istediğimizde bu yapı tıkanacaktır.
Gereksiz Veri Tüketimi=Bütün nesneler aynı sınıftan üretildiği için mesela Can iksiri bile gereksiz yere health değişkenine niteliğine sahip oluyor.Alt sınıflar olmadığı için nesneler kendileriyle alakalı olmayan değişkenleri bellekte tutmak zorunda kalıyor.

AI Ne Gördü =
# Kodda Görülen Tasarım Sorunları

## 1. God Class (Aşırı Sorumluluk)

`Game` sınıfı hem oyun nesnesinin verilerini tutuyor hem de render işlemini yapıyor. Ayrıca nesne tipine göre davranış belirleme görevini de üstlenmiş durumda. Bu durum sınıfın tek sorumluluk prensibini (SRP) ihlal etmesine neden olur.

### Çözebilecek Örüntüler

* Strategy
* Factory Method

---

## 2. if-else Zinciri ile Tür Kontrolü

Kod içerisinde sürekli `object_type.equals(...)` kontrolleri yapılıyor. Yeni bir nesne tipi eklendiğinde constructor ve Render metodunun değiştirilmesi gerekiyor. Bu durum Open/Closed Principle (OCP) ihlalidir.

### Çözebilecek Örüntüler

* Factory Method
* Strategy
* State

---

## 3. String Tabanlı Nesne Yönetimi

Nesne tipleri `"Enemy"` veya `"Main Charecter"` gibi string değerlerle yönetiliyor. Yazım hataları sistemin bozulmasına neden olabilir ve tip güvenliği sağlanamaz.

### Çözebilecek Örüntüler

* Factory Method
* Abstract Factory

---

## 4. Yeni Nesne Eklerken Mevcut Kodun Değişmesi

Yeni bir oyun nesnesi (örneğin Boss, NPC, Weapon) eklemek için mevcut constructor ve Render metodunun düzenlenmesi gerekiyor. Bu durum sistemin genişletilebilirliğini azaltır.

### Çözebilecek Örüntüler

* Factory Method
* Prototype

---

## 5. Polymorphism Kullanılmaması

Tüm oyun nesneleri aynı sınıf üzerinden yönetiliyor ve davranış farklılıkları if bloklarıyla ayrılıyor. OOP mantığında olması gereken polymorphism kullanılmamış.

### Çözebilecek Örüntüler

* Strategy
* Template Method

---

## 6. Render İşleminin Nesneye Sıkı Bağlı Olması

Render işlemi doğrudan Game sınıfı içinde yer alıyor. İleride farklı render sistemleri (2D, 3D, OpenGL vb.) eklemek zorlaşacaktır.

### Çözebilecek Örüntüler

* Bridge
* Facade

---

AI'ın cevabı ve benim cevabımın karşılaştırılması=
AI ve benim ortak olarak üzerinde durduğumuz konu God class ve if else zinciri ve yeni nesne eklerken mevcut kodun değişmesi  sorunları. Ayrıca ikimizde String tabanlı nesne yönetiminin tehlikelerini ve dezavantajlarını belirtmişiz. O benden farklı olarak render işleminin nesneye sıkı sıkı bağlı olmasının tehlikesinde parmak basmış ve belirtmiş ayrıca polymorphismin öneöini vurgulayarak bu problemi çözebilecek örüntüleri belirtmiş.

