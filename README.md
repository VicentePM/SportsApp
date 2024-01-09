# SportsApp - Aplicación Deportiva Multifuncional

SportsApp es una aplicación Android desarrollada en Kotlin que proporciona una experiencia completa para los usuarios, incorporando funciones de login, navegación con menú lateral, visualización de información de usuario, galería de imágenes, formulario de contacto y más. La aplicación utiliza la arquitectura MVVM y la librería Retrofit para obtener datos de una API simulada.

## Configuración del Proyecto

1. **Clonar el Repositorio:**
   ```bash
   git clone https://github.com/VicentePM/SportsApp.git
   ```

2. **Configurar API Key:**
   - No se requiere una clave API para la API simulada.

3. **Ejecutar la Aplicación:**
   - Abrir el proyecto en Android Studio.
   - Conectar un dispositivo Android o utilizar un emulador.
   - Ejecutar la aplicación.

## Funcionalidades de la Aplicación

### Pantalla de Login

- **Autenticación de Usuario:**
  - Permite a los usuarios autenticarse con un nombre de usuario y contraseña.
  - Credenciales de prueba: aficionado - 123456, jugador - qwerasdf, directivo - asdfasdf.
  - Muestra mensajes de error si las credenciales son incorrectas o si algún campo está vacío.
  
- **Acceso Invitado:**
  - Botón para acceder a la aplicación como invitado.

- **Recordatorio de Login:**
  - Almacena el nombre de usuario en preferencias si el login es exitoso.
  - La próxima vez que se abra la aplicación, muestra automáticamente el último nombre de usuario.

### Actividad Principal y Menú Lateral

- **Menú Lateral:**
  - Presenta un menú lateral con varias opciones de navegación.
  - Muestra una cabecera con el nombre o tipo de usuario que ha accedido.

- **Botón Atrás:**
  - Si se pulsa el botón atrás en el primer fragmento de la pila, muestra un cuadro de diálogo para confirmar la salida.

### Fragmento de Inicio

- **Mensaje de Bienvenida:**
  - Muestra un mensaje de bienvenida y una imagen.
  - Incluye el nombre de usuario si se ha iniciado sesión.

- **Menú de Logout:**
  - En la Toolbar, se presenta un menú con la opción de hacer logout.
  - Al pulsar, muestra un cuadro de diálogo para confirmar el logout.

- **Huevo de Pascua:**
  - Si se pulsa 10 veces el logo, se activa un huevo de pascua.
  - Muestra un cuadro de diálogo con una lista de premios y un código aleatorio después de seleccionar uno.

### Fragmento Galería

- **Galería Paginada:**
  - Muestra imágenes en un formato de listado escalonado usando un RecyclerView.
  - Al pulsar en una imagen, se abre un fragmento para verla a pantalla completa.

### Fragmento Plantilla y Jugador

- **Lista de Jugadores:**
  - Utiliza una lista normal o en formato de rejilla.
  - Cambia el color de fondo de las celdas según algún dato específico.

- **Vista en Detalle:**
  - Al pulsar un elemento, se abre otro fragmento para mostrar toda la información del jugador.

### Fragmento Contacto

- **Formulario de Contacto:**
  - Envía un correo de contacto.
  - No permite enviar el formulario si algún campo está vacío o si el correo no tiene formato adecuado.
  - Muestra un cuadro de diálogo para confirmar el envío.

- **Botones de Contacto:**
  - Botón de correo: Abre la aplicación de correo con la dirección indicada.
  - Botón teléfono: Llama al centro.
  - Botón WhatsApp: Abre una conversación en WhatsApp con el número indicado.
  - Botón Google Maps: Abre la aplicación de Google Maps con una ubicación específica.

### Otras Funcionalidades

- Se pueden añadir otras funcionalidades según sea necesario.
- Se incluyen comentarios en el código para explicar bloques importantes.
- El código está bien ordenado y estructurado con nombres apropiados para recursos, clases y variables.
