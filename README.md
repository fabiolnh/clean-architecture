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

# Branas

- Difference from Hexagonal: Use Cases, Defined responsabilities, Who knows who.
1) **Entity**: Is the Domain Model. It abstracts the Indendenty Business Rules (that can be objects with methods and validations). They are not the same of ORM (you will have one object for ORM and one for Domain). Ex: CPF is valid? The name is valid? (Some external user needs this information? If no, it is Indendenty Business Rules)
2) **Use Cases**: it is the orchestration of entities and external resources. Examples: Create an account, verify an account, order a track, accept the track, start the track, end the track. (Some external user needs this information? If yes, it is Use Case). 
3) **Interface Adapter (Controllers, Gateways, Presenters)**: It is a Bridge between Use Case and External Resources.
4) **Frameworks and Drivers**: low level, interaction with tecnology.

- Who is outside knows who is inside. (attention to the arrow on the image)
- Layer is not directory. It is only logic.
- Relationship in Hexagonal Architecture to Clean:
    * Controller = Main (Entry point), Framework/Drivers and Interface Adapter
    * Service = Use Case and Entity (Only Entity if there are some validations)
    * DAO = Framework/Drivers and Interface Adapter
