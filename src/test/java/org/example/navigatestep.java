package org.example;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class navigatestep {
    Login login=new Login();
    FreshbyMarket market=new FreshbyMarket();
    @Given("user navigates to {string}")
    public void userNavigatesTo(String url) {
        login.navigate(url);
        login.enter("tivoqaprod@gmail.com","tivoqaProd1");
        login.changeLocation();
        login.selectFreshbymarket();
        login.selectCategory(2);
        login.addProductDirectly();
        login.addProduct();
        login.addRecomendedproduct();
        login.buy();
    }



}
