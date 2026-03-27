# 🍔 Simulador de McDonald's (Java)

Aplicación de escritorio desarrollada en **Java Swing** que simula un sistema de pedidos tipo McDonald's, permitiendo seleccionar productos por código, visualizar el pedido y calcular el total y el cambio.

<p align="center">
  <img src="https://github.com/user-attachments/assets/34094b30-0106-45e2-998e-cecb44c486b7" width="450" />
</p>


---

## 🚀 Funcionalidades

* Ingreso de productos por código
* Visualización en tabla
* Cálculo de total y cambio
* Eliminación de productos
* Imágenes dinámicas
* Conexión a MySQL

---

## 🛠️ Tecnologías

* Java (Swing)
* JDBC
* MySQL

---

## 🗄️ Base de Datos

* **DB:** `mc-boliche`
* **Tabla:** `productos`

```sql
CREATE TABLE productos (
    idproducto INT PRIMARY KEY,
    tipo VARCHAR(50),
    descripcion VARCHAR(100),
    precio DOUBLE
);
```

---

## ⚙️ Configuración

Editar credenciales en el código:

```java
String url = "jdbc:mysql://localhost:3306/";
String bd = "mc-boliche";
String user = "root";
String password = "1234";
```

---

## ▶️ Uso

1. Ingresar código
2. Agregar productos
3. Finalizar pedido
4. Ingresar pago → ver cambio

---

## 👨‍💻 Autor

**Benjamin Lazarte** 🚀
