# SE 311 - Mini Oyun Motoru Projesi

Bu proje, nesne yönelimli programlama prensipleri ve tasarım örüntülerini kullanarak modüler bir oyun motoru altyapısı sunar.

## 🚀 Proje Durumu
![Java Build CI](https://github.com/KULLANICI_ADIN/REPO_ADIN/actions/workflows/ci.yml/badge.svg)
*(Not: Yukarıdaki linki kendi GitHub kullanıcı adın ve repo adınla güncellersen yeşil tik burada da görünür!)*

## 🛠️ Kullanılan Tasarım Örüntüleri

### Faz 1: Creational (Yaratımsal)
- **Factory Method:** Oyun nesnelerinin (Karakter, Düşman, İksir) merkezi bir yerden oluşturulması sağlandı.

### Faz 2: Structural (Yapısal)
- **Decorator Pattern:** Karakterlere dinamik olarak "Zırh" gibi özellikler eklenmesi sağlandı.
- **Adapter Pattern:** Eski sistemden gelen `LegacyBoss` sınıfının yeni sisteme entegrasyonu sağlandı.

### Faz 3: Behavioral (Davranışsal)
- **Strategy Pattern:** Karakterin saldırı mekanizmaları (Sword, Magic, Bow) birbirinden bağımsız stratejiler olarak kurgulandı.
- **Observer Pattern:** Can değişimlerini takip eden bir bildirim sistemi kuruldu.

## 🧩 OCP (Open/Closed Principle) Kanıtı
Projemizde **Strategy Pattern** kullanılarak OCP başarıyla uygulanmıştır. Sisteme yeni bir saldırı türü olan `BowAttack` eklenirken; `Main`, `Game` veya `Main_Charecter` sınıflarının mevcut koduna dokunulmamış, sadece yeni bir sınıf eklenerek sistem genişletilmiştir.

## ⚙️ CI/CD Entegrasyonu
Proje, GitHub Actions kullanılarak otomatikleştirilmiştir. Yapılan her `push` ve `pull request` işlemi, bulut üzerinde Java 17 ortamında otomatik olarak derlenmekte ve kod sağlığı kontrol edilmektedir.