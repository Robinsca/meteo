# Open Meteo

Applicazione Spring Boot per visualizzare le previsioni meteo settimanali delle principali città italiane, con frontend interattivo basato su Chart.js.

## Funzionalità

Selezione di una città italiana e visualizzazione delle temperature massime e minime previste per la settimana.
Grafico interattivo delle temperature.
Backend Java Spring Boot che funge da proxy verso l'API Open-Meteo.

## Struttura del progetto

Frontend: [meteo2/src/main/resources/static/index.html](meteo2/src/main/resources/static/index.html)

<<<<<<< HEAD
Backend: Java Spring Boot ([com.robinsca.openmeteo](meteo2/src/main/java/com/robinsca/openmeteo/))
=======


Configurazione: [application.properties](meteo2/src/main/resources/application.properties)

Docker: [Dockerfile](Dockerfile), [docker-compose.yml](docker-compose.yml)

## Come avviare il progetto

### Prerequisiti

Java 17+
Docker (per esecuzione containerizzata)

### Installazione e Configurazione di Docker

#### Windows e macOS

Scarica Docker Desktop: Vai sul sito ufficiale di Docker e scarica Docker Desktop per il tuo sistema operativo: https://www.docker.com/products/docker-desktop

Installa Docker Desktop: Esegui il programma di installazione scaricato e segui le istruzioni. Su Windows, assicurati che WSL 2 (Windows Subsystem for Linux 2) sia abilitato, poiché è richiesto da Docker Desktop per le migliori prestazioni. Docker Desktop ti guiderà nella sua abilitazione se necessario.

Avvia Docker Desktop: Una volta installato, avvia Docker Desktop. L'icona di Docker apparirà nella barra delle applicazioni (Windows) o nella barra dei menu (macOS). Assicurati che sia in esecuzione prima di procedere.

Verifica l'installazione: Apri un terminale (PowerShell o CMD su Windows, Terminale su macOS) e digita:

```
docker --version
docker compose version
```
#### Linux

Installa Docker Engine: Le istruzioni possono variare leggermente a seconda della distribuzione Linux. Visita la documentazione ufficiale di Docker per la tua distribuzione: https://docs.docker.com/engine/install/

Esempio per Ubuntu:

```
sudo apt update

sudo apt install ca-certificates curl gnupg

sudo install -m 0755 -d /etc/apt/keyrings

curl -fsSL https://download.docker.com/linux/ubuntu/gpg | sudo gpg --dearmor -o /etc/apt/keyrings/docker.gpg
sudo chmod a+r /etc/apt/keyrings/docker.gpg

echo \
  "deb [arch="$(dpkg --print-architecture)" signed-by=/etc/apt/keyrings/docker.gpg] https://download.docker.com/linux/ubuntu \
  "$(. /etc/os-release && echo "$VERSION_CODENAME")" stable" | \
  sudo tee /etc/apt/sources.list.d/docker.list > /dev/null

sudo apt update

sudo apt install docker-ce docker-ce-cli containerd.io docker-buildx-plugin docker-compose-plugin
```

Aggiungi il tuo utente al gruppo docker (opzionale ma consigliato): Questo ti permette di eseguire comandi Docker senza sudo.


```
sudo usermod -aG docker $USER
newgrp docker # Potrebbe essere necessario fare il logout/login o riavviare il terminale
```

Verifica l'installazione: Apri un terminale e digita:

```
docker --version
docker compose version
```

### Avvio locale

Vai nella cartella meteo2: 

```
cd meteo2
``` 

Compila ed esegui l'applicazione: 

```
 ./mvnw spring-boot:run
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
