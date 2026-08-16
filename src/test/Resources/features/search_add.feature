Feature: tester la recherche et l ajout des produits au le panier

@loggedIn
Scenario: rechercher et ajouter des produits au panier
    Given je suis connecte a mon compte OpenCart
    When je recherche le produit Nikon D300
    And j'ajoute le premier produit au panier
    When je recherche le produit HTC Touch HD
    And j'ajoute le deuxieme produit au panier
    And j ouvre le panier
    Then les deux produits sont présents dans le panier