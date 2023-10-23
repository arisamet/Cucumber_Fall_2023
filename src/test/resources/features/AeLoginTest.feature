Feature: AutomationExercise sitesi login olma
  @cip
  Scenario: TC001 Ae Pozitif Login Test

    Given kullanici aeUrl adresine gider
    Then kullanici login linkine tiklar
    Then dogru bilgilerle giris yapar
    Then basarili giris yapildigini dogrular
    And sayfayi kapatir
