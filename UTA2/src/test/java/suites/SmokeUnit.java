package suites;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.runner.RunWith;

import tests.unit.HelloTest;
import tests.unit.LoggingTest;

@RunWith(JUnitPlatform.class)
@SelectClasses({
  LoggingTest.class,
  HelloTest.class
  })
class SmokeUnit
{}
