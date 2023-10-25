# Calculator_App_Automation
--The test scenario involves automating a calculator app to calculate a mathematical series provided as a parameter. The series is "100/10*5-10+60". The objective is to pass this series to the test method, calculate the result, and compare it to the expected result to ensure the correctness of the calculator app's calculations. If the calculated result matches the expected result, the test passes; otherwise, it fails.

# necessary dependencies : (always use latest version)
--https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java
--https://mvnrepository.com/artifact/io.appium/java-client
--https://mvnrepository.com/artifact/org.testng/testng
   

# Generate Allure Report :
    --download the zip from the given link : https://github.com/allure-framework/allure2/releases
    --UNzip file , copy the path till bin and Setup home environment on your windows 
    --go to your IDE then add this on build.gradle script , make a suite before that .
    -- plugins {
    id 'java'
    id 'io.qameta.allure' version '2.10.0'
    }
    allure {
    version = '2.10.0'
    } 
  # Run the following Gradle task to generate the report:
    ---./gradlew clean test
    --allure generate allure results --clean -output
    --allure serve allure results
    
# Allure Report :
--![screencapture-192-168-0-104-55927-index-html-2023-10-25-17_38_25](https://github.com/anika-tahsin4152/Calculator_App_Automation/assets/73738319/68878f5b-edd0-4ca4-a738-aa0eff1d5e2b)

# Video
--https://github.com/anika-tahsin4152/Calculator_App_Automation/assets/73738319/b43c6a4e-e243-4cb4-87ed-79108b10bd30

