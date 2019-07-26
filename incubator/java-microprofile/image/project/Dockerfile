FROM open-liberty:javaee8-java12

COPY --chown=1001:0 user-app/src/main/liberty/config/server.xml /config/

COPY --chown=1001:0 target/*.war /config/dropins/
