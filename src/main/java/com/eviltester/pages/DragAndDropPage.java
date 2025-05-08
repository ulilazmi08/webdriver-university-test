package com.eviltester.pages;

import org.openqa.selenium.By;

import static com.ultilities.ActionsUtility.dragAndDropBy;
import static com.ultilities.JavaScriptUtility.*;

public class DragAndDropPage extends IndexPage {
    private By dragMe1 = By.xpath("//div[@id='draggable2']");
    private By dropHere1 = By.xpath("//div[@id='droppable2']/p[text()='Dropped!']");

    public void dragItem1(){
        scrollToElementJS(dragMe1);
        dragAndDropBy(find(dragMe1),-90,180);
        scrollToElementJS(dropHere1);
        fluentWait(dropHere1);
        find(dropHere1).isDisplayed();
    }
}
