package org.example;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyStepDefs {
    HomePage homePage = new HomePage();
    CountryPage countryPage = new CountryPage();
    DateOfBirthPage dateOfBirthPage = new DateOfBirthPage();
    ResultPageForAge16 resultUnder16Page = new ResultPageForAge16();
    UniversalPaidCreditPage universal_credit_claim_page = new UniversalPaidCreditPage();
    EducationPage education_page = new EducationPage();
    ResultPageForAge17to19 result_page_For_age__17To19 = new ResultPageForAge17to19();
    UniversalCreditClaimPage universal_credit_page = new UniversalCreditClaimPage();
    TaxPage tax_page = new TaxPage();
    HomePageCredit take_home_page = new HomePageCredit();
    PartnerPage partner_page = new PartnerPage();
    ResultPageForAge19to99 result_page_age_between_19_to_60 = new ResultPageForAge19to99();



    @Given("^User on NHS cost checker tool$")
    public void user_on_NHS_cost_checker_tool() {

    }
    @When("^User click on start button$")
    public void user_click_on_start_button() {
        homePage.clickOnStartButton();
    }

    @And("^User select country wales$")
    public void user_select_country_wales() {
        countryPage.clickOnRadioButton();
    }

    @And("^Click on next$")
    public void click_on_next() {
        countryPage.clickOnNextButton();
    }

    @And("^User type date of birth$")
    public void user_type_date_of_birth() {
        dateOfBirthPage.typeDateOfBirth();
    }

    @And("^User click on next$")
    public void user_click_on_next() {
        countryPage.clickOnNextButton();
    }
    @Then("^User should be able to see free treatment message from NHS$")
    public void user_should_be_able_to_see_free_treatment_message_from_NHS() {
        resultUnder16Page.verifyMessage();
    }

    @And("^User select yes full time Education$")
    public void userSelectYesFullTimeEducation() {
        education_page.clickOnFullTimeEducation();
    }

    @And("^Click on next tab$")
    public void clickOnNextTab() {
        countryPage.clickOnNextButton();
    }

    @Then("^User should be able to see treatment message$")
    public void userShouldBeAbleToSeeTreatmentMessage() {
        result_page_For_age__17To19.verifyFullTimeEductionMessage();
    }

    @And("^User select yes live with partner$")
    public void userSelectYesLiveWithPartner() {
        partner_page.click_On_Married();
        countryPage.clickOnNextButton();

    }
    @And("^User select yes Do you or your partner claim any benefits or tax credits\\?$")
    public void userSelectYesDoYouOrYourPartnerClaimAnyBenefitsOrTaxCredits() {
        tax_page.clickOnTaxCredit();
        countryPage.clickOnNextButton();

    }
    @And("^User select yes Do you or your partner get paid Universal Credit\\?$")
    public void userSelectYesDoYouOrYourPartnerGetPaidUniversalCredit() {
        universal_credit_page.clickOnUniversalCredit();
        countryPage.clickOnNextButton();

    }
    @And("^User select yes As part of your or your parent's Universal Credit, do you have any of these\\?$")
    public void userSelectYesAsPartOfYourOrYourParentSUniversalCreditDoYouHaveAnyOfThese() {
        universal_credit_claim_page.clickOnUniversalCreditLaw();
        countryPage.clickOnNextButton();
    }
    @And("^User select yes Was the take-home pay used in the last Universal Credit period Amount or less\\?$")
    public void userSelectYesWasTheTakeHomePayUsedInTheLastUniversalCreditPeriodAmountOrLess() {
        take_home_page.clickOnYesHomePay();

    }
    @And("^Click on next last tab$")
    public void clickOnNextLastTab() {
        countryPage.clickOnNextButton();
    }

    @Then("^User should be able to see treatment message from NHS$")
    public void userShouldBeAbleToSeeTreatmentMessageFromNHS() {
        result_page_age_between_19_to_60.verifyUserAge19To60Massage();
    }


}