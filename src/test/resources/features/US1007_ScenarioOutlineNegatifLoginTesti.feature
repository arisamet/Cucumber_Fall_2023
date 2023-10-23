Feature: US1007 liste olarak verilen kullanici adi ve sifrelerle giris yapilamadigini test eder

  Scenario Outline:  TC11 qualitydemy sayfasina yanlis bilgilerle giris yapilamaz

    Given kullanici "qdUrl" anasayfaya gider
    Then ilk login linkine tiklar
    And username kutusuna "<GecersizEmail>" yazar
    And password kutusuna "<GecersizPassword>" yazar
    And login butonuna basar
    Then basarili giris yapilamadigini test eder
    And sayfayi kapatir
    Examples:
      | GecersizEmail | GecersizPassword |
    |Suha           | 12345|
    |Nergiz         |34521                  |
    |Omer           |786543                 |
    |Mehmet         |98098                  |
