Feature: tester la suppression d'un produit

  @loggedIn
  @productsAdded
  Scenario: supprimer un produit du panier
    Given j ai ajoute des produits a mon panier
    When je supprime le produit HTC Touch HD
    Then un seul produit reste présent dans le panier
