Feature: Validar la respuesta al obtener detalles de canciones

  Scenario Outline: Obtener detalles de una canción devuelve 200 OK
    When realizo una solicitud GET para obtener detalles de la canción con id "<songId>"
    Then el código de estado de la respuesta debe ser 200

    Examples:
      | songId       |
      | 1217912247   |
      | 1217912248   |

  Scenario Outline: El cuerpo de la respuesta contiene los detalles esperados de la canción
    When realizo una solicitud GET para obtener detalles de la canción con id "<songId>"
    Then el cuerpo de la respuesta debe contener el campo "name" con el valor "<expectedTitle>"

    Examples:
      | songId       | expectedTitle                                |
      | 1217912247   | Let Me Out (feat. Mavis Staples & Pusha T)   |
      | 1217912248   | Interlude: Penthouse                         |

  Scenario Outline: El tiempo de respuesta es menor a 2000ms
    When realizo una solicitud GET para obtener detalles de la canción con id "<songId>"
    Then el tiempo de respuesta debe ser menor a 2000ms

    Examples:
      | songId       |
      | 1217912247   |
      | 1217912248   |
