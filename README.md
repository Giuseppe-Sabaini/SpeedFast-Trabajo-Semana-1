# SpeedFast App - Semana 2 Actualizado

## 👤 Autor del proyecto

● **Nombre:** Giuseppe Sabaini
● **Carrera:** Programador Computacional
● **Asignatura:** Desarrollo Orientado a Objetos II
● **Institución:** Duoc UC Online

---

## 📦 Descripción general del sistema

Este proyecto corresponde a la evaluación de la Semana 2 de la asignatura **Desarrollo Orientado a Objetos II**. El sistema extiende la solución para la empresa de logística y entregas **SpeedFast**, estructurando una arquitectura más robusta, modular y reutilizable mediante el uso de **Clases Abstractas**, **Herencia** y **Polimorfismo**.

Se implementa una clase abstracta base `Pedido` de la cual heredan tres tipos de pedidos específicos:
1. **PedidoComida:** Calcula el tiempo de entrega considerando 15 minutos base + 2 minutos por kilómetro.
2. **PedidoEncomienda:** Calcula el tiempo base de 20 minutos + 1.5 minutos por kilómetro (ajustado al entero más cercano)[cite: 1].
3. **PedidoExpress:** Aplica un tiempo base de 10 minutos con un recargo de 5 minutos adicionales si la distancia supera los 5 km[cite: 1].

---

---

## 🧱 Estructura General del Proyecto

```text
📁 src/
├── app/          # Contiene la clase principal de ejecución (Main)
├── model/        # Clases del dominio del problema
│   ├── Pedido.java           # Clase abstracta base
│   ├── PedidoComida.java     # Subclase especializada
│   ├── PedidoEncomienda.java # Subclase especializada
│   └── PedidoExpress.java    # Subclase especializada
└── util/         # Clase de utilidad para formateo de consola
    └── UtilPedido.java       # Métodos auxiliares para la salida de consola
```

## ⚙️ Instrucciones para clonar y ejecutar el proyecto


Clona el repositorio desde GitHub: 

```
https://github.com/Giuseppe-Sabaini/SpeedFast-Trabajo-Semana-1.git
```
2. Abre el proyecto en IntelliJ IDEA.
3. Ejecuta el archivo Main.java desde el paquete app

Repositorio GitHub: https://github.com/Giuseppe-Sabaini/SpeedFast-Trabajo-Semana-1.git Fecha de Entrega: 24/8/26 23:59 
