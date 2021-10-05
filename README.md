# Recomendaciones!

- En caso de hacer pruebas con la base de datos, asegurese de cambiar las credenciales en el archivo: application.properties. Agregue spring.datasource.password=pass de ser necesario (el proyecto fue realizado con XAMPP, por lo que no requeria la configuracion de la contraseña)
- Para ver los cambios realizados por un POST o PUT, es recomendable ejecutar el comando directamente en la base de datos. Esto debido a que el endpoint GET muestra el resultado por páginas, mientras que el comando muestra todo.
