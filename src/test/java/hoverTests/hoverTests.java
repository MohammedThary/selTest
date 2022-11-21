package hoverTests;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class hoverTests extends BaseTests {
    @Test
    public void hoverImage() {
        var hoverPage = homePage.clickHover();
        var caption = hoverPage.hoverOverFigure(1);
        Assert.assertTrue(caption.isCaptionDisplayed());
        Assert.assertEquals(caption.getTitle(), "name: user1");
        Assert.assertEquals(caption.getLinkText(), "View profile");
        Assert.assertTrue(caption.getLink().endsWith("/users/1"), "View Profile");
    }
}
