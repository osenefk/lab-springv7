# lab-springv7
Ce projet est géré par Maven. 
Il mette en oeuvre d'une part l'injection de dependances via la specification CDI avec l'annotation @Inject.
Et d'autre part,le projet Spring data pour simplifier la creation du DAO.
Les annotations utilisés tels que @Name et @Inject sont dits standards.
L'application est repartie en trois couches à savoir :
- La couche persistence : contient les classes POJO
- La couche dao : contient les classes accés aux données (Interface + classe Implementant l'interface)
- La couche service : contient les classes implémentant la logique métier de l'application. 
La dependance entre la couche dao et la couche service est gérée CDI : Injection de l'interface dao via l'annotation @Inject
- Et la couche presentation : contient la classe principale pour l'execution du projet

