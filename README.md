# Sistema de gestión de parqueaderos
![parqueadero](https://github.com/user-attachments/assets/a333af47-cb73-4305-bded-a6215b9dadd7)

## Introducción
Este módulo tiene como finalidad gestionar un parqueadero que está compuesto por múltiples pisos. Cada piso tiene varias plazas de parqueo. Los vehículos pueden ser de diferentes tipos: automóviles, motocicletas y bicicletas. Todos comparten características comunes como matrícula, modelo y color, pero tienen atributos específicos según el tipo.
Los usuarios del parqueadero pueden ser clientes regulares o visitantes. Los clientes regulares tienen una suscripción activa y un método de pago asociado. Los visitantes pagan por las horas usadas.
El sistema debe maneja reservas en plazas específicas para clientes regulares. Los empleados del parqueadero se dividen en supervisores y cajeros, encargados de supervisar las operaciones, generar facturas y cobrar lo requerido.

## Clases usadas
- **[1. Automovil]( Codigo/Automovil.java)**
- **[2. Bicicleta ]( Codigo/Bicicleta.java)**
- **[3. Cajero ]( Codigo/Cajero.java)**
- **[4. Cliente]( Codigo/Cliente.java)**
- **[5. Empleado ]( Codigo/Empleado.java)**
- **[6. Factura ]( Codigo/Factura.java)**
- **[7. IContrato ]( Codigo/IContrato.java)**
- **[8. Main]( Codigo/Main.java)**
- **[9. MetodoPago ]( Codigo/MetodoPago.java)**
- **[10. Motocicleta ]( Codigo/Motocicleta.java)**
- **[11. Parqueadero]( Codigo/Parqueadero.java)**
- **[12. Persona]( Codigo/Persona.java)**
- **[13. Piso]( Codigo/Piso.java)**
- **[14. Plaza ]( Codigo/Plaza.java)**
- **[15. Regular]( Codigo/Regular.java)**
- **[16. Reserva]( Codigo/Reserva.java)**
- **[17. Supervisor ]( Codigo/Supervisor.java)**
- **[18. Suscripcion ]( Codigo/Suscripcion.java)**
- **[19. Ticket]( Codigo/Ticket.java)**
- **[20. Visitante]( Codigo/Visitante.java)**
- **[21. Vehiculo]( Codigo/Vehiculo.java)**

  

## Cambios realizados
En comparación al primer diagrama UML realizado, el diagrama actual tiene algunas modificaciones que se explican a continuación. Para mayor comocidad se  ha dividido los cambios de acuerdo a su rol en el diagrama de clases:

### **1. Relaciones** 
- Se cambio la multiplicidad y dirección de la relación en clases como Plaza, Factura y Ticket.
- Se agregaron relaciones en algunas clases como Factura, Cajero y Supervisor.
- Se eliminaron relaciones, especialmente la realación de dependencia entre Suscripción y Vehículo.
- 
### **2. Atributos**
- La clase Reserva tiene un nuevo atributo denominado codigo.
- En las clases Piso, Plaza y Ticket se eliminaron de uno a dos elementos.

### **3. Métodos**
- Las clases Supervisor y Cajero, Factura y Ticket sufren modificaciones en sus métodos.
