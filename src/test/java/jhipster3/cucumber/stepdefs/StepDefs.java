package jhipster3.cucumber.stepdefs;

import jhipster3.Jhipster3App;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = Jhipster3App.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
