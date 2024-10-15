# Shark Names You - API
> This application is in (very) early development.

This is the API for **Shark Names You**, an application made to help trans folks choose a name. It uses data from Données Québec, therefore making it targeted towards french-speaking people.

## Technology Documentation
- Spring Boot API
- CSV Data
## Data Documentation
The data used by this API comes from Données Québec, that was transformed with a tool. They update their data every year during Spring. **It is not representative of how many people actually have that name in Quebec.**
### Datasets
- [Boy Names](https://donneesquebec.ca/recherche/fr/dataset/banque-de-prenoms-garcons)
- [Girl Names](https://donneesquebec.ca/recherche/fr/dataset/banque-de-prenoms-filles)
### Tools
- [Shark Names You - Quebec Data Tools](https://github.com/ariannelafraise/shark-names-you-quebec-data-tool)
## API Documentation
### Endpoints
> Available **genders** are: `girl`, `boy`, `both`.
#### Get List of Names
- **URL:** `/list/<gender>`
- **Method:** `GET`
- **Response:**
  - **200 OK:** A list of names.
  - **Content Type:** application/json
##### Example response:
```json
[
  {
    "name": "ARIANNE",
    "total": 2809
  },
  {
    "name": "EMMA",
    "total": 11073
  }
]
```
#### Get Random Girl Name
- **URL:** `/name/<gender>`
- **Method:** `GET`
- **Response:**
  - **200 OK:** A random name.
  - **Content Type:** application/json
##### Example response:
```json
{
  "name": "ARIANNE",
  "total": 2809
}
```

---
### Models

#### Name
>The `Name` model represents a name in the system.
- **name** *(string)*: The name. (acts as ID) (all capitals)
- **total** *(integer)*: The number of times the name has been used.