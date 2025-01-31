# api-test-shazam
Automation shazam api 

El ejercicio consta de poder realizar interacciones por medio de los Verbos comunes que expone un Api rest y que puedas realizar todo el proceso que involucra automatizar una de esas acciones necesarias para interactuar con Api

## API Reference

#### Get song details by UD

```http
  GET songs/v2/get-details
```

| Parameter         | Type     | Description                          |
| :--------         | :------- | :----------------------------------- |
| `X-Rapidapi-Key:` | `string` | **Requerido**. Your API key          |
| `X-Rapidapi-Host` | `string` | **Requerido**. shazam.p.rapidapi.com |
| `Host`            | `string` | **Requerido**. shazam.p.rapidapi.com |
| `id`              | `string` | **Requerido**. 1217912247            |

#### Detect song form raw sound data

```http
  POST songs/v2/detect
```

| Parameter         | Type     | Description                          |
| :--------         | :------- | :----------------------------------- |
| `X-Rapidapi-Key:` | `string` | **Requerido**. Your API key          |
| `X-Rapidapi-Host` | `string` | **Requerido**. shazam.p.rapidapi.com |
| `Content-Type`    |          | **Requerido**. text/plain            |
| `Content-Length:` |          | **Requerido**. 90                    |
| `Host`            | `string` | **Requerido**. shazam.p.rapidapi.com |
