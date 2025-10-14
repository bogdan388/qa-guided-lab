# Probleme Intampinate pe Linux

## 1. Eroare Docker Credentials

**Problema:**
```
error getting credentials - err: exit status 1, out: `no usernames for https://index.docker.io/v1/`
```

**Cauza:** Config Docker avea `credsStore: desktop` setat dar helper-ul nu era disponibil.

**Rezolvare:** Am editat `~/.docker/config.json` si am sters linia `"credsStore": "desktop"`.

## 2. Port 5432 Deja in Uz

**Problema:**
```
Error starting userland proxy: listen tcp4 0.0.0.0:5432: bind: address already in use
```

**Cauza:** PostgreSQL local rula deja pe portul 5432.

**Rezolvare:** Am scos maparea porturilor pentru serviciile db si cache din `compose.yaml`. Doar Adminer are nevoie de port expus (8888).

```yaml
db:
  image: postgres:16-alpine

cache:
  image: redis:7-alpine

adminer:
  ports:
    - "8888:8080"
```

Serviciile comunica intre ele prin reteaua interna Docker, nu e nevoie de porturi expuse extern decat pentru Adminer.
