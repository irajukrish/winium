package winiumDemoTestCases;

import java.awt.RenderingHints.Key;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;

import winiumDemo.ImageCracker;

public class MyFirstTestCase {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
		DesktopOptions option =new DesktopOptions();
		//option.setApplicationPath("C:\\Windows\\System32\\calc.exe");
		option.setApplicationPath("C:\\Program Files (x86)\\NewNuk\\NewNuk\\NewNuk.exe");
		WiniumDriver driver=new WiniumDriver(new URL("http://localhost:9999"), option);
		Thread.sleep(5000);
		//driver.findElementByName("Seven").click();
		
		String Projectid=driver.findElementByName("FirstFloor.ModernUI.Presentation.LinkGroup").getAttribute("ClassName");
		
		System.out.println(Projectid);
		
		Thread.sleep(5000);
		int a=driver.findElementsByClassName("ListBoxItem").size();
		System.out.println(a);
		
		Thread.sleep(5000);
		//driver.findElementById("txtEditor").sendKeys("Hello World Vidya is good person!");
		
		System.out.println(ImageCracker.crackImage("C:\\AbsandBedouin.PNG"));
		
//		  String vidyafile="assorted Abs and Bedouin let me alone) I could have floated a few \n"
//		  + "thousand miles downstream in peace and tranquillity to Shepherd's \r\n" +
//		  "or the Hötel du Nil in Cairo. \r\n" +
//		  "I awoke suddenly with a hand gripping my arm and another over \r\n" +
//		  "my mouth, and was about to lash out in panic when I realised they \r\n" +
//		  "were Uliba's hands, it was just on half-dawn, and she was hissing \r\n" +
//		  "a warning In my ear. \r\n" +
//		  "\"Still! keep down!\" She was out Of her blanket, snaking away \r\n" +
//		  "across the turf damp With dew, and I followed her With my innards \r\n" +
//		  "turning over at this sudden alarm. \"See — yonder, across the river!\" \r\n"
//		  + "I followed her pointing finger, and froze where I lay. On the far \r\n" +
//		  "side of the water, which was barely fifty yards broad at this point, \r\n" +
//		  "a line of horsemen was emerging from the jungle, pricking down \r\n" +
//		  "to the bank. They were lancers, forty or fifty Of them, trim in white \r\n"
//		  + "robes and turbans and breastplates, one Or two with chain-mail \r\n" +
//		  "shoulder guards, their leader wearing a steel casque and knight's \r\n" +
//		  "gauntlets and carrying a silver shield. They ranged along the bank, \r\n" +
//		  "dismounting at his word of command to water their horses, their \r\n" +
//		  "voices drifting across the misty surface. \r\n" +
//		  "More in desperation than hope I wondered if they might be \r\n" +
//		  "Masteeat's people, but Uliba shook her head impatiently and wonned \r\n" +
//		  "her way backwards into the shelter Of the bushes, dragging blanket \r\n" +
//		  "and saddle-bag With her, and signing to me to do likewise. \r\n" +
//		  "\"They are Theodore's guardsmen, his household cavalry. That \r\n" +
//		  "silver shield is carried only by nobles high in his service.\" Her \r\n" +
//		  "whisper was fierce but steady. \"Those boats we saw last night, \r\n" +
//		  "making towards Adeena — they must have been at Kourata, bearing \r\n" +
//		  "word of us and where we were going!\" She screwed her eyes shut \r\n" +
//		  "in fury, clenching her fist. \"God of gods, why did I not kill that \r\n" +
//		  "loose-tongued fool!?\" \r\n" +
//		  "\"Hold on — how d'ye know they're looking for us? You can't \r\n" +
//		  "be sure —\" \r\n" +
//		  "\"A silver shield abroad before dawn with picked troops of the \r\n" +
//		  "Emperor? I can be sure they are not on manoeuvres! He would \r\n" +
//		  "never leave such an elite to garrison Kourata when he IS marching \r\n" +
//		  "on Magdala! No, he will have sent them west the moment he learned \r\n" +
//		  "";
		 
		
		
		
		  
		String s2 = String.format("%s%s%s"
	            , "line1\n"
	            , "line2\n"
	            , "line3\n"
	    );
		
		  driver.findElementById("txtEditor").sendKeys("assorted Abs and Bedouin let me alone) I could have floated");
		  driver.findElementById("txtEditor").sendKeys(s2);
//		  driver.findElementById("txtEditor").sendKeys("a few thousand miles ");
		  
		
		  
//		  WebElement txtedit=driver.findElementById("txtEditor");
//		  Actions builder = new Actions(driver);
//		  Action A = builder
//				  .sendKeys(txtedit,"assorted Abs and Bedouin let me alone) I could have floated")
//				  .build();
//		  A.perform();
		
	}
	
}
