import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import java.awt.Robot as Robot
import java.awt.event.KeyEvent as KeyEvent

WebUI.openBrowser('')

WebUI.navigateToUrl('https://demoqa.com/automation-practice-form')

WebUI.maximizeWindow()

WebUI.scrollToElement(findTestObject('Forms/Page_DEMOQA/div_Forms'), 0)

WebUI.click(findTestObject('Object Repository/Forms/Page_DEMOQA/li_Practice Form'))

WebUI.setText(findTestObject('Object Repository/Forms/Page_DEMOQA/input_Name_firstName'), 'TEST')

WebUI.setText(findTestObject('Object Repository/Forms/Page_DEMOQA/input_Name_lastName'), 'S')

WebUI.setText(findTestObject('Object Repository/Forms/Page_DEMOQA/input_Email_userEmail'), 'test@example.com')

WebUI.click(findTestObject('Object Repository/Forms/Page_DEMOQA/label_Female'))

WebUI.setText(findTestObject('Object Repository/Forms/Page_DEMOQA/userNumber'), '1234567890')

WebUI.setText(findTestObject('Object Repository/Forms/Page_DEMOQA/input_Subjects'), 'TEST')

WebUI.click(findTestObject('Object Repository/Forms/Page_DEMOQA/label_Music'))

WebUI.setText(findTestObject('Object Repository/Forms/Page_DEMOQA/currentAddress'), 'TEST')

Robot robot = new Robot()

for (int i = 0; i < 5; i++) {
    // how many times you want CRTL+'-' pressed
    robot.keyPress(KeyEvent.VK_CONTROL)

    robot.keyPress(KeyEvent.VK_SUBTRACT)

    robot.keyRelease(KeyEvent.VK_SUBTRACT)

    robot.keyRelease(KeyEvent.VK_CONTROL)
}

not_run: WebUI.selectOptionByIndex(findTestObject('Object Repository/Forms/Page_DEMOQA/div_Select State'), 1)

not_run: WebUI.selectOptionByIndex(findTestObject('Object Repository/Forms/Page_DEMOQA/div_Select City'), 0)

WebUI.click(findTestObject('Object Repository/Forms/Page_DEMOQA/button_Submit'))

WebUI.enableSmartWait()

WebUI.click(findTestObject('Object Repository/Forms/Page_DEMOQA/button_Close'))

