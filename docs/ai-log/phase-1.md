AI'a gönderdiğim prompt = Sen bu kodun nesne yaratım sorununu hangi yöntemle ve nasıl çözerdin.Kodu nasıl daha iyi optimize ederdin

AI ne yanıtladı = Kodun Problemi
Paylaştığın Game sınıfı, birbirinden farklı oyun nesnelerini (ana karakter, düşman, can iksiri) tek bir sınıfta string kontrolüyle yönetiyordu. Yani "Enemy" mi "Main Charecter" mi diye if-else'le bakıyordu — hem typo riski var hem de yeni bir nesne eklemek istesen mevcut kodu değiştirmek zorunda kalıyordun.GameObject adında soyut bir temel sınıf oluşturdum, her nesne tipi bunu miras alıyor.MainCharacter, Enemy, HealthCure için ayrı ayrı somut sınıflar yazdım — her biri sadece kendi render() davranışını ve alanlarını (damage, defence vb.) taşıyor
GameObjectFactory sınıfı yarattım, nesne yaratma sorumluluğunu buraya taşıdım — Main.java artık sadece factory'den nesne istiyor.


AI ne uyguladı ben ne uyguladım=AI ile aynı temel yapıyı kurdum (interface + somut sınıflar + factory). Farklı olarak nesnelere gerçekçi parametreler ekledim (boy, kilo, stok). AI abstract class önerdi, ben interface tercih ettim — interface daha uygundu. String eşleştirme tutarsızlığını ve parametre kirliliğini AI fark etti, ben atlamıştım.  (NOT=Kodu ilk önce ben optimize ederek yazdım ondan sonra AI'a nasıl yaparsın diyip kendi kodumla Aı'ın yazdığı kodu karşılaştırdım.)