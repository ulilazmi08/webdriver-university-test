package com.pages;

import com.base.BasePage;
import org.openqa.selenium.By;
import com.ultilities.ActionsUtility;
import com.ultilities.JavaScriptUtility;
import org.openqa.selenium.support.Color;

import java.awt.*;

import static com.ultilities.ActionsUtility.*;
import static com.ultilities.JavaScriptUtility.*;

public class ActionsPage extends BasePage {
    private By dragItem = By.id("draggable");
    private By droppedPlace = By.xpath("//div[@id='droppable']/p/b[text()='Dropped!']");
    private By holdClick = By.id("click-box");
    private By doubleClickBox = By.id("double-click");
    private final Color green = Color.fromString("#93CB5A");
    public void moveItem(int x, int y ){
        switchNewTab();
        dragAndDropBy(find(dragItem),x,y);
        scrollToElementJS(droppedPlace);
        find(droppedPlace).isDisplayed();
    }
    public void holdClickBox(){
        switchNewTab();
        scrollToElementJS(holdClick);
        holdClickJS(holdClick);
    }
    public void doubleClickCheck(){
        switchNewTab();
        scrollToElementJS(doubleClickBox);
        doubleClick(doubleClickBox);
        checkBackgroundColor(doubleClickBox,green);
    }

}
