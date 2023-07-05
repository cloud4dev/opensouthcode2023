package es.cloud4dev.opensouthcode.demo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.annotation.DirtiesContext;

import com.github.mvysny.kaributesting.v10.*;
import com.github.mvysny.kaributesting.v10.spring.MockSpringServlet;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.spring.SpringServlet;

import es.cloud4dev.opensouthcode.demo.views.MainLayout;
import kotlin.jvm.functions.Function0;
import static com.github.mvysny.kaributesting.v10.GridKt.*;
import static com.github.mvysny.kaributesting.v10.LocatorJ.*;
import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest
@DirtiesContext
public class ApplicationTest {
	
	private static final Routes routes = new Routes().autoDiscoverViews("es.cloud4dev.opensouthcode.demo.views");

    @Autowired
    private ApplicationContext ctx;
    
    @BeforeEach
    public void setup() {
        final Function0<UI> uiFactory = UI::new;
        final SpringServlet servlet = new MockSpringServlet(routes, ctx, uiFactory);
        MockVaadin.setup(uiFactory, servlet);
    }

    @AfterEach
    public void tearDown() {
        MockVaadin.tearDown();
    }
    
    @Test
    public void simpleUITest() {
        final MainLayout main = (MainLayout) UI.getCurrent().getChildren().findFirst().get();
        assertEquals(6, main.getChildren().count());
    }
    
    @Test
    public void testGreeting() {
        // simula el click de un botón
        _click(_get(Button.class, spec -> spec.withCaption("Say hello")));

    }

}
