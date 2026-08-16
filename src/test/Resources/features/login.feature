Feature: tester le site OpenCart
  Scenario: tester login avec des donnees valides
    Given je suis sur la Home Page du site OpenCart
    When je navigue vers login page
    When je saisis mon email
    And je saisis mon password
    And je clique sur le login button
    Then je suis redirigé vers la page de mon compte