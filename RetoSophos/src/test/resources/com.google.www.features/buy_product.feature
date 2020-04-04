Feature: Process to buy a product.
  i as user of the platform web
  i need to do a process buy
  for adquire a product

  Scenario:Buy a product
    Given User was navigated for the web
    When The user is purchasing a product
    Then User will be see a: El producto se agrego a tu carrito de compras