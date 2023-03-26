package crudTest;

import activity.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import singletonSession.Session;

public class ForeignSubscriberTest {

    AutenticationActivity autenticationActivity = new AutenticationActivity();
    PermissionsActivity permissionsActivity = new PermissionsActivity();
    MenuActivity menuActivity = new MenuActivity();
    OperationMenuActivity operationMenuActivity = new OperationMenuActivity();
    SubscriberListActivity subscriberListActivity = new SubscriberListActivity();
    BeneficiaryBankActivity beneficiaryBankActivity = new BeneficiaryBankActivity();
    BeneficiaryDataActivity beneficiaryDataActivity = new BeneficiaryDataActivity();
    CountryListActivity countryListActivity = new CountryListActivity();
    EconomicListActivity economicListActivity = new EconomicListActivity();
    ConfimationMessageActivity confimationMessageActivity = new ConfimationMessageActivity();
    BeneficiaryInformationActivity beneficiaryInformationActivity = new BeneficiaryInformationActivity();
    EditInformationActivity editInformationActivity = new EditInformationActivity();
    ConfirmationEliminateActivity confirmationEliminateActivity = new ConfirmationEliminateActivity();

    @Test
    public void verifyCrudNote() {

        // AUTENTICACION
        autenticationActivity.userTxtBox.setText("kachavez");
        autenticationActivity.passTxBox.setText("Abc123");
        autenticationActivity.saveButton.click();
        permissionsActivity.saveButton.click();
        permissionsActivity.activePermissionsButton.click();
        permissionsActivity.fingerprintButton.click();
        menuActivity.operationButton.click();
        operationMenuActivity.subscriberButton.click();
        operationMenuActivity.foreignSubscriberButton.click();
        subscriberListActivity.newSubscriberButton.click();
        beneficiaryBankActivity.selectCountryButton.click();
        countryListActivity.selectCountryListButton.click();
        //REGISTRO ABONADO
        beneficiaryBankActivity.verificationCodeTxBox.setText("BICAARBS");
        beneficiaryBankActivity.verificationButton.click();
        beneficiaryBankActivity.contryTxBox.setText("Salta");
        beneficiaryBankActivity.agencyTxBox.setText("Agencia Salta");
        beneficiaryBankActivity.followingButton.click();
        beneficiaryDataActivity.selectCountryBeneficiaryButton.click();
        countryListActivity.selectCountryListButton.click();
        beneficiaryDataActivity.economicActivityButton.click();
        economicListActivity.selectEconomicButton.click();
        beneficiaryDataActivity.nameTxBox.setText("Raquel Soto Medina");
        beneficiaryDataActivity.nameTxBox.click();
        beneficiaryDataActivity.accountNumberTxBox.click();
        beneficiaryDataActivity.accountNumberTxBox.setText("123456789012");
        beneficiaryDataActivity.addressTxBox.setText("calle 16 julio");
        beneficiaryDataActivity.cityTxBox.setText("salta");
        beneficiaryDataActivity.phoneTxBox.setText("2252561");
        beneficiaryDataActivity.idNumberTxBox.setText("9121120");
        beneficiaryDataActivity.issuedButton.click();
        beneficiaryDataActivity.issuedSelectButton.click();
        beneficiaryDataActivity.nationalityButton.click();
        beneficiaryDataActivity.nationalitySelectButton.click();
        beneficiaryDataActivity.saveBeneficiaryButton.click();
        confimationMessageActivity.acceptActivityButton.click();
        //VER
        subscriberListActivity.menuButton.click();
        subscriberListActivity.optionSeeButton.click();
        beneficiaryInformationActivity.nextOptionButton.click();
        beneficiaryInformationActivity.optionBack.click();
        beneficiaryInformationActivity.optionBack.click();
        //EDICION
        subscriberListActivity.menuButton.click();
        subscriberListActivity.optionEditButton.click();
        editInformationActivity.nextOptionButton.click();
        editInformationActivity.nameTxBox.setText("Abonado Editado");
        editInformationActivity.nameTxBox.click();
        editInformationActivity.phoneTxBox.click();
        editInformationActivity.saveButton.click();
        editInformationActivity.confirmationButton.click();
        editInformationActivity.optionBackButton.click();
        //editInformationActivity.optionBackButton.click();
        //ELIMINACION
        subscriberListActivity.menuButton.click();
        subscriberListActivity.optionEliminateButton.click();
        confirmationEliminateActivity.acceptButton.click();
        confimationMessageActivity.acceptActivityButton.click();
        //CREACION DEL ITEM
        Assertions.assertTrue(subscriberListActivity.isNoteDisplayed(), "Error: CRUD NO REALIZADO");

    }
    @AfterEach
    public void cloaseApp() {
        Session.getInstance().closeApp();
    }
}