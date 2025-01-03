# Usar una imagen base de Java 17cd
FROM openjdk:17-jdk-alpine

# Establecer el directorio de trabajo dentro del contenedor
WORKDIR /app

# Copiar el archivo JAR generado por Maven desde el directorio target
COPY target/e-commerce-0.0.1-SNAPSHOT.jar app.jar

# Exponer el puerto en el que corre la aplicación
EXPOSE 8070

# Comando para ejecutar la aplicación
ENTRYPOINT ["java", "-jar", "app.jar"]