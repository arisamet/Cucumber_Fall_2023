Feature: ets tur sitesi login
@ets
  Scenario: ets tur login login

    Given ets tur sitesine gidilir
    And login butonu ustune gidilir
    When giris butonuna basilir
    And eposta girilir
    And password girilir
    And giris yap butonuna basilir
    Then sayfaya gidilemedigi dogrulanir