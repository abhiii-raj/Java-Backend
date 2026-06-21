# What is IoC (Inversion of Control)?
Normally, in plain Java, you create objects yourself using new.
In Spring, IoC means you don’t create objects manually. Instead, the framework creates and manages them for you.
This is done by the IoC Container.

It’s the core part of Spring Framework.

Responsible for:
1. Creating objects (beans).
2. Managing their lifecycle.
3. Injecting dependencies (Dependency Injection).

Think of it as a factory + manager for your application objects.

# Types of IoC Containers
1. BeanFactory
Basic container, lazy initialization (creates beans only when needed).
Lightweight, rarely used directly.


2. ApplicationContext
Advanced container, eagerly initializes beans at startup.
Provides extra features like event handling, internationalization, etc.
Most commonly used in Spring Boot.

# Types of Dependency Injection
1. Using Constructor(most preferable)
    if there is a single constructor then there is no need to use the annotation autowired
2. Uisng Setter functions
3. Using filed Injections(not recomended)

# Why Constuctor injection in preferred ?
1. Dependency can be injected (get wired) at object creation
2. final class can be used
3. easy to test the class