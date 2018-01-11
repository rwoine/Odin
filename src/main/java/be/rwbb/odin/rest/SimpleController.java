package be.rwbb.odin.rest;

import be.rwbb.odin.rest.output.TestOutput;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController
{
   @GetMapping(path = "test", produces = "application/json")
   public TestOutput getTest()
   {
      return new TestOutput(42,"the answer");
   }
}
