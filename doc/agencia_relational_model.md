## Agencia de viajes Relational Model

``` plantuml
@startuml
entity Turista {
    * codigo: varchar(10) <<PK>>
    --
    * nombre: varchar(25)
    * apellidos: varchar(25)
    * telefono: varchar(10)
    id_calle_fk: Integer <<FK>> REFERENCES Calle(id)
}

/' Relación: Turista contrata sucursal '/
entity Contratación {
    * cod_sucursal: Integer <<PK>>
    * cod_turista: varchar(10) <<PK>>
    * fecha_contratación: Date <<PK>> /'Permite que un turista contrate la misma sucursal en diferentes contrataciones en diferentes fechas'/
    --
    * cod_vendedor: varchar(10)
    * fecha_venta: Date
    * cod_viaje: Integer
    * cod_hotel: Integer
    * id_regimen: Integer
    * fecha_llegada_hospedaje
    * fecha_salida_hospedaje
    FOREIGN KEY (cod_sucursal) REFERENCES Sucursal(codigo)
    FOREIGN KEY (cod_turista) REFERENCES Turista(codigo)
    FOREIGN KEY (cod_vendedor) REFERENCES Vendedor(codigo)
    FOREIGN KEY (cod_viaje) REFERENCES Viaje(codigo)
    FOREIGN KEY (id_regimen) REFERENCES Regimen(id)
    FOREIGN KEY (cod_hotel, id_regimen) REFERENCES ContratoHospedaje(cod_hotel, id_regimen)
}

entity Vendedor {
    * codigo: varchar(10) <<PK>>
    --
    * nombre: varchar(25)
    * apellidos: varchar(25)
    * telefono: varchar(10)
    * cod_sucursal: Integer
    * cod_admin_general: varchar(10)
    FOREIGN KEY(cod_sucursal) REFERENCES Sucursal(codigo)
    FOREIGN KEY(cod_admin_general) REFERENCES AdminGeneral(codigo)
    
}

entity ContratoHospedaje {
    * cod_hotel: Integer <<PK>> 
    * id_regimen: Integer <<PK>>
}

entity AdminSucursal {
    * codigo: varchar(10) <<PK>>
    --
    * nombre: varchar(25)
    * apellidos: varchar(25)
    * telefono: varchar(10)
    * cod_admin_general: varchar(10)
    * fecha_creacion: Date
    FOREIGN KEY (cod_admin_general) REFERENCES AdminGeneral(codigo)
}

entity TrabajoAdminSucursal {
    * cod_admin_sucursal: varchar(10) <<PK>>
    * cod_sucursal: Integer <<PK>>
    --
    * fecha_inicio: Date
    fecha_fin: Date
    * fecha_asignacion: Date
    * cod_admin_general: varchar(10)
    FOREIGN KEY (cod_admin_sucursal) REFERENCES AdminSucursal(codigo)
    FOREIGN KEY (cod_sucursal) REFERENCES Sucursal(codigo)
    FOREIGN KEY (cod_admin_general) REFERENCES AdminGeneral(codigo)
}

entity TrabajoVendedor {
    * cod_vendedor: varchar(10) <<PK>>
    * cod_sucursal: Integer <<PK>>
    --
    * fecha_inicio: Date
    fecha_fin: Date
    * fecha_asignacion: Date
    * cod_admin_general: varchar(10)
    FOREIGN KEY (cod_admin_general) REFERENCES AdminGeneral(codigo)
    FOREIGN KEY (cod_sucursal) REFERENCES Sucursal(codigo)
    FOREIGN KEY (cod_vendedor) REFERENCES Vendedor(codigo)
}

entity AdminGeneral {
    * codigo: varchar(10) <<PK>>
    --
    * nombre: varchar(25)
    * apellidos: varchar(25)
    * telefono: varchar(10)
    * id_calle: Integer
    FOREIGN KEY (id_calle) REFERENCES Calle(id)
}



entity Vuelo {
    * numero: Integer <<autonumber>> <<PK>>
    --
    * fecha: Date
    * id_aeropuerto_salida: Integer
    * id_aeropuerto_llegada: Integer
    * fecha_salida: Date
    * fecha_llegada: Date
    FOREIGN KEY (id_aeropuerto_salida) REFERENCES Aeropuerto(id)
    FOREIGN KEY (id_aeropuerto_llegada) REFERENCES Aeropuerto(id)

}

entity Aeropuerto {
    * id: Integer <<autonumber>> <<PK>>
    --
    * nombre: varchar(50)
    * codigo_iata: varchar(5)
}

entity Viaje {
    * codigo: Integer <<autonumber>> <<PK>>
    --
    * fecha_inicio: Date
    * fecha_fin: Date
    precio_total: float
}

entity Calle {
    * id: Integer <<autonumber>> <<PK>>
    --
    * nombre: varchar(25)
    id_ciudad_fk: <<FK>> REFERENCES Ciudad(id)
}

entity Ciudad {
    * id: Integer <<autonumber>> <<PK>>
    --
    * nombre: varchar(25)
}

entity Hotel {
    * codigo: Integer <<autonumber>> <<PK>>
    --
    * nombre: varchar(25)
    * telefono: varchar(25)
    * cod_admin_general: varchar(10)
    * plazas_disponibles: integer
    * id_calle: Integer 
    FOREIGN KEY (id_calle) REFERENCES Calle(id)
    FOREIGN KEY (cod_admin_general) REFERENCES AdminGeneral(codigo)
}

entity Sucursal {
    * codigo: Integer <<autonumber>> <<PK>>
    --
    telefono: varchar(10)
}

entity Regimen {
    * id: Integer <<autonumber>> <<PK>>
    --
    * descripcion: varchar(100)
    * precio: Real   
}

entity HotelTieneRegimen {
    * cod_hotel: Integer <<PK>>
    * id_regimen: Integer <<PK>>
}

entity Plaza {
    * id: Integer <<PK>>
    --
    * descripcion: varchar(30)
    * precio: Real
    cod_viaje: Integer
    cod_vuelo: Integer 
    FOREIGN KEY (cod_viaje) REFERENCES Viaje(codigo)
    FOREIGN KEY (cod_vuelo) REFERENCES Vuelo(codigo)
}

/' Relaciones '/
AdminGeneral ||--o{ Vendedor
AdminGeneral ||--o{ TrabajoAdminSucursal
AdminSucursal ||--|| TrabajoAdminSucursal
Sucursal ||--|| TrabajoAdminSucursal
AdminGeneral ||--o{ AdminSucursal
Contratación ||--|| Viaje
Viaje ||--o{ Plaza
AdminGeneral ||--o{ Hotel
Vuelo ||--|{ Plaza
Vuelo }o--|| Aeropuerto
AdminGeneral ||--o{ TrabajoVendedor
Sucursal ||--o{ TrabajoVendedor
Vendedor ||--o{ TrabajoVendedor
Vendedor ||--o{ Contratación
Turista ||--|{ Contratación
Sucursal ||--|{ Contratación
Contratación }o--o| ContratoHospedaje
Hotel ||--|{ HotelTieneRegimen
Regimen ||--|{ HotelTieneRegimen

Calle ||--o{ Turista
Calle }|--|| Ciudad
Calle ||--o{ Hotel
Vendedor }o--|| Sucursal
AdminGeneral }o--|| Calle




@endluml
```
