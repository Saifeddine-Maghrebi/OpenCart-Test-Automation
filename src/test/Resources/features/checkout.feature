Feature: tester la fonctionnalité checkout
  @loggedIn
  @productsAdded
  Scenario: faire le checkout et compléter le paiement
    Given j ai ajoute des produits au panier
    When je clique sur Checkout
    Then j accede a la page Checkout
    And je saisis un First Name
    And je saisis un Last Name
    And je saisis une Adresse
    And je saisis une City
    And je saisis un Post Code
    And je selecte une Country
    And je selecte une Region
    And je clique sur le premier bouton continue
    And je clique sur le deuxieme bouton Continue
    And je clique sur le troisieme bouton Continue
    And je coche les Terms & Conditions
    And je clique sur le quatrieme bouton Continue
    And je clique sur Confirm Order
    Then je suis redirige vers la page Order Confirmation


