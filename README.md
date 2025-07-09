# Open Meteo

Applicazione Spring Boot per visualizzare le previsioni meteo settimanali delle principali città italiane, con frontend interattivo basato su Chart.js.

## Funzionalità

Selezione di una città italiana e visualizzazione delle temperature massime e minime previste per la settimana.
Grafico interattivo delle temperature.
Backend Java Spring Boot che funge da proxy verso l'API Open-Meteo.
## Struttura del progetto

Frontend: [meteo2/src/main/resources/static/index.html](meteo2/src/main/resources/static/index.html)

Backend: Java Spring Boot ([com.perno.openmeteo](meteo2/src/main/java/com/perno/openmeteo/))

Configurazione: [application.properties](meteo2/src/main/resources/application.properties)

Docker: [Dockerfile](Dockerfile), [docker-compose.yml](docker-compose.yml)
## Come avviare il progetto

### Prerequisiti

Java 17+
Maven 3.9+
Docker (opzionale, per esecuzione containerizzata)
### Avvio locale

Vai nella cartella meteo2: sh
 cd meteo2
 
Compila ed esegui l'applicazione: 
```
sh ./mvnw spring-boot:run
 ```
Apri il browser su [http://localhost:8080](http://localhost:8080) per accedere all'interfaccia.
### Avvio con Docker

Costruisci l'immagine e avvia il container: 
```
sh docker-compose up --build
 ```

Accedi a [http://localhost:8080](http://localhost:8080).
## Endpoints API

GET /api/weather/forecast?lat={lat}&lon={lon} Restituisce le previsioni meteo per la posizione specificata.
## Personalizzazione

Puoi modificare le città disponibili nel menu a tendina modificando il file [index.html](meteo2/src/main/resources/static/index.html).
Per cambiare la porta, modifica server.port in [application.properties](meteo2/src/main/resources/application.properties).
## Licenza

Questo progetto è fornito a scopo didattico.

---

Autore: Sara Gelli
