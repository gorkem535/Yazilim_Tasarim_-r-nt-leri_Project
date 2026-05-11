# Uygulanan Tasarım Örüntüleri

## 1. Factory Method (Faz 1)

- **Nerede Kullanıldı:** `GameObjectFactory` sınıfında oyun nesnelerinin üretiminde kullanıldı.
- **Neden Seçildi:** Başlangıç kodundaki `GameObject` sınıfı bir "God Class" haline gelmişti ve nesne yaratımı esnek değildi. Factory Method ile yaratım sorumluluğunu tek bir merkeze çektim.
- **Ne Kazandırdım:** Sisteme yeni bir nesne (örneğin "BOSS") eklemek istediğimde ana kodum kırılmayacak. Sadece fabrikaya yeni bir durum eklemem yeterli olacak.

### UML Sınıf Diyagramı (Öncesi ve Sonrası)

**Öncesi (God Class - Spagetti Kod):**
```mermaid
classDiagram
    class GameObject {
        +String type
        +float kilo
        +float boy
        +int stok
        +GameObject(String type, float kilo, float boy, int stok)
        +update()
        +render()
    }
```

**Sonrası (Factory Method Uygulanmış Hali):**
```mermaid
classDiagram
    class GameObject {
        <<interface>>
        +update()
        +render()
    }
    class Main_Charecter {
        -float kilo
        -float boy
        +update()
        +render()
    }
    class Enemy {
        -float kilo
        -float boy
        +update()
        +render()
    }
    class Health_Cure {
        -int stok
        +update()
        +render()
    }
    class GameObjectFactory {
        +createGameObject(String type, float kilo, float boy, int stok) GameObject$
    }

    GameObject <|.. Main_Charecter
    GameObject <|.. Enemy
    GameObject <|.. Health_Cure
    GameObjectFactory ..> GameObject : creates
```