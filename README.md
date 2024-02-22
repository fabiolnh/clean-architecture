# Clean Architecture

- Became a Book
- Main Objective: Protect the Application Domain
- Hexagonal Architecture and Clean Architecture are similar, however, The Clean Architecture has more details (however, it is still open to how the developer will implement).
- It is a variation of Hexagonal Architecture, however, bringing more details (evolution).
- Low accouplement between layers (Interfaces).
- Oriented by Use Cases (Intent of action. With it, you can see the intention of the system).

![](https://github.com/fabiolnh/clean-architecture/blob/main/assets/clean-arc-pic1.png?raw=true)

- Each Use Case has a DTO for Input and a DTO for Output. Use Cases can variable in accord to the flux (that'ś why they are not a part of entities)
- Presenters: Transformation Object (Similar to DTO Mapper)
- Entities from Clean Architecture are different from DDD Entities
- Entities In Clean Architecture: Business Rules Layer
- There is no explicit definition of how to create entities. We use some tactics from DDD (just a correlation).
- Entities from Clean Architecture: Aggregates + Domain Services

- OBS: If you use a manual validation, you have to think if you want your domain to be pure or not. Think in a balance. Take care to not pollute your code. Do not be purest. But avoid being very dependent on the framework. If you know what you are doing, no problem. If the lib is very consolidated in the market, I think there is no problem. (Ex: Lombok)
