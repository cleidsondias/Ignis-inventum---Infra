# ignis-inventum-patterns

This project has 2 objectives, the first is to create a set of interfaces that can be used in the implementation of technology projects based on the JAVA language and using as a structure the Project Pattern (GoF), the second objective is an example of how it can implement the design patterns in our projects.

Below is a list of implemented design patterns :

**Type:** Behavioral
* [Command](src/main/java/br/com/ignisinventum/infra/patters/behavioral/command/README.md)
* [Strategy](src/main/java/br/com/ignisinventum/infra/patters/behavioral/strategy/README.md)

**Type:** Creational
* [Abstract Factory](src/main/java/br/com/ignisinventum/infra/patters/creational/abstractfactory/README.md)
* [Builder](src/main/java/br/com/ignisinventum/infra/patters/creational/builder/README.md)
* [Factory](src/main/java/br/com/ignisinventum/infra/patters/creational/factory/README.md)
* [Prototype](src/main/java/br/com/ignisinventum/infra/patters/creational/prototype/README.md)
* [Singleton](src/main/java/br/com/ignisinventum/infra/patters/creational/singleton/README.md)

**Type:** Structural
* [Composite](src/main/java/br/com/ignisinventum/infra/patters/structural/composite/README.md)
* [Proxy](src/main/java/br/com/ignisinventum/infra/patters/structural/proxy/README.md)

To use the interfaces of this project, put in dependency section in you prject:

```xml
<dependency>
	<groupId>br.com.ignisinventum</groupId>
	<artifactId>br.com.ignisinventum.patterns</artifactId>
	<version>1.0.0</version>
</dependency>
```