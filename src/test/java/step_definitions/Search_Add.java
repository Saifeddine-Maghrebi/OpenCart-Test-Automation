package step_definitions;

import hooks.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page_factory.Cart_page;
import page_factory.SearchAdd_page;

public class Search_Add {

    SearchAdd_page searchAddPage;
    Cart_page cartPage;

    @Given("je suis connecte a mon compte OpenCart")
    public void jeSuisConnecteAMonCompteOpenCart() {
        // Login handled by @Before("@loggedIn")
        searchAddPage = new SearchAdd_page(Hooks.driver);
        cartPage = new Cart_page(Hooks.driver);
    }

    @When("je recherche le produit Nikon D{int}")
    public void jeRechercheLeProduitNikonD(int arg0) {

        searchAddPage.searchProduct("Nikon D300");
    }

    @When("j'ajoute le premier produit au panier")
    public void j_ajoute_le_premier_produit_au_panier() {

        searchAddPage.clickAddProduct();
    }

    @When("je recherche le produit HTC Touch HD")
    public void jeRechercheLeProduitHTCTouchHD() {

        searchAddPage.searchProduct("HTC Touch HD");
    }

    @When("j'ajoute le deuxieme produit au panier")
    public void j_ajoute_le_deuxieme_produit_au_panier() {

        searchAddPage.clickAddProduct();
    }


    @And("j ouvre le panier")
    public void jOuvreLePanier() {

        searchAddPage.clickShoppingCart();
    }

    @Then("les deux produits sont présents dans le panier")
    public void lesDeuxProduitsSontPrésentsDansLePanier() {

        if(cartPage.getCartCentent().contains("Nikon D300") && cartPage.getCartCentent().contains("HTC Touch HD")) {
            System.out.println("le panier contient les deux produits");
        }else{
            System.out.println("le panier ne contient pas les deux produits");
        }
    }
}
