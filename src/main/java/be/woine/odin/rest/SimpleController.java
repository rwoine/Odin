package be.woine.odin.rest;

import be.woine.odin.example.ExampleThread;
import be.woine.odin.rest.output.TestOutput;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController
{
   //Injection of whatever ExampleThread you find in the context, in our case the one from OdinApplication
   @Autowired
   private ExampleThread exampleThread;

   @GetMapping(path = "test", produces = "application/json")
   public TestOutput getTest()
   {
      return new TestOutput(exampleThread.getNumber(),"the answer");
   }
}
