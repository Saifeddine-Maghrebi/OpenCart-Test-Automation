Feature: tester le site OpenCart

  @loggedIn
  Scenario: tester login avec des donnees valides
    Given je suis connecte a mon compte openCart
    When je clique sur My Account dans le menu
    And je clique sur Logout
    Then je suis deconnecte et redirigie vers la page logout