# Gostaria de aprender passo a passo como esse projeto foi desenvolvido?
Tenho disponível na Udemy um curso onde desenvolvo esta aplicação Spring Boot com gRPC e Java. Acesse: [Spring Boot e gRPC - Crie uma aplicação com gRPC e Java](https://www.udemy.com/course/spring-boot-e-grpc-crie-uma-aplicacao-com-grpc-e-java/?referralCode=D89F92BA0DE3FE9632F1)

## Exemplo de uso do gRPC em um projeto Spring Boot com Java

O Spring não oferece suporte nativo ao gRPC, portanto, neste projeto foi usado a lib [gRPC-Spring-Boot-Starter](https://yidongnan.github.io/grpc-spring-boot-starter/en/).

## Stack:
- Java 11;
- Spring Boot e Spring gRPC;
- Assertj;
- Mockito.

## Alguns recursos utilizados neste exemplo:
- GrpcExceptionHandler
- Testes integrados dos enpoints gRPC
- Testes unitários

## Como executar
Antes de mais nada você deve executar o Protobuf para que sejam gerados os stubs a partir do arquivo .proto do projeto. Para isso, siga esses passos:
- 1º Na lateral esquerda do Intellij, acesse a aba Maven e em plugins navegue até o **protobuf** e execute **protobuf:compile** e **protobuf:compile-custom**.
- 2º Com os stubs gerados, você pode executar todos os testes da aplicação para ver o seu funcionamento ou até mesmo executar a aplicação e testar as chamadas usando um client gRPC como o BloomRPC ou Insomnia.



## Gostaria de aprender mais sobre gRPC?
- Tenho uma página no Medium onde publico artigos: [Tony Augusto - Medium](https://tonyaugusto.medium.com/)
- Também tenho um curso de gRPC usando Micronaut e Kotlin: [Micronaut e gRPC - Crie um projeto do zero com gRPC e Kotlin](https://www.udemy.com/course/micronaut-e-grpc-crie-um-projeto-do-zero-com-grpc-e-kotlin/?referralCode=B0511367F040D62EBBEB)
