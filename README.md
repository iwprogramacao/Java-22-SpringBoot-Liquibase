# Java 22, SpringBoot e Liquibase

Para iniciar o projeto, crie o banco de dados com:
docker-compose up -d

Em sequência, pode utilizar os comandos liquibase:update para verificar o funcionamento e depois liquibase:diff que criará o diff com a classe de exemplo criada

Como o projeto utiliza Lombok, para as novas classes poderem ser criadas por liquibase:diff, deverá ser feita a compilação  do projeto antes do comando para a identificação das novas classes
