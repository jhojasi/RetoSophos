Feature: Process of rest service in the web
  i as user of the platform web
  i need to do a process of rest service
  for see a response of system

  Scenario Outline: Rest service
    Given The user was navigated in the web
    When User is consuming a service
    Then The user will see a first name: Jhojasi

    Examples:
      |requestmethod|firstname|firstvalue|lastname|lastvalue|gender|gendervalue|email|emailvalue|
      |POS|first_name|Jhojasi|last_name  |Sierra|gender|male|email|jhojasiretosophos@gmail.com|