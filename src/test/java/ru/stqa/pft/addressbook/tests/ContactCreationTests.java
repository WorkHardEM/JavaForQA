package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

import java.io.File;

public class ContactCreationTests extends TestBase {

  @Test()
  public void testContactCreation() {
    app.goTo().goToHomePage();
    app.contact().initContactCreation();
    File photo = new File("src/main/resources/Java.png");
    app.contact().fillContactForm(
            new ContactData().withFirstname("test_name").withLastname("test_surname").withPhoto(photo));
    app.contact().submitContactCreation();
    app.contact().returnToHomePage();
  }

  @Test()
  public void testCurrentDir() {
    File currentDir = new File(".");
    System.out.println(currentDir.getAbsolutePath());
    File photo = new File("src/main/resources/Java.png");
    System.out.println(photo.getAbsolutePath());
    System.out.println(photo.exists());
  }
}
