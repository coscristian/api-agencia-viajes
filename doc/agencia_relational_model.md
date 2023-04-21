## Agencia de viajes Relational Model

``` plantuml

entity Turista {
    * codigo: varchar(10) <<PK>>
    --
    * nombre: varchar(25)
    * apellidos: varchar(25)
    * telefono: varchar(10)
    id_calle_fk: Integer <<FK>> REFERENCES Calle(id)
}

/' Relación: Turista contrata sucursal '/
entity Contrata {
    * cod_sucursal: Integer <<PK>>
    * cod_turista: varchar(10) <<PK>>
    * fecha_contratación: Date <<PK>> /'Permite que un turista contrate la misma sucursal en diferentes contrataciones en diferentes fechas'/
    --
    cod_sucursal_fk: Integer <<FK>> REFERENCES Sucursal(cod_sucursal)
    cod_turista_fk: varchar(10) <<FK>> REFERENCES Turista(cod_turista)
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
    * codigo: integer <<autonumber>> <<PK>>
    --
    * nombre: varchar(25)
    * telefono: varchar(25)
    * plazas_disponibles: integer
    id_calle_fk: Integer <<FK>> REFERENCES Calle(id)
}

entity Sucursal {
    * codigo: Integer <<autonumber>> <<PK>>
    --
    telefono: varchar(10)
}

entity Viaje {
    * codigo: integer <<autonumber>> <<PK>>
    --
    * fecha_inicio: Date
    * fecha_fin: Date
    precio_total: float
    
}

entity Vuelo {
    * numero: integer <<autonumber>> <<PK>>
    --
    * fecha: Date
    plazasDisponibles: Integer
    plazasTurista: Integer
    plazasEjecutiva: Integer
    PlazasPrimera: Integer
}

/' Relaciones '/
Turista ||--|{ Contrata
Sucursal ||--|{ Contrata
Calle ||--o{ Turista
Calle }|--|| Ciudad
Calle ||--o{ Hotel

```

