# **App Consumo de Energia**
&gt; Desenvolvido para ajudar no cálculo de consumo de energia e custo da mesma.

## Descrição
O **App Calculo de Consumo** permite ao usuário saber o custo e o consumo de energia inserindo as informações necessárias para o cálculo.

## Funcionalidades
- [x] Entrada de dados (Potência, Tempo de uso, Preço do Kwh)
- [x] Interface simples e intuitiva

## Tecnologias Utilizadas
- [x] **Android Studio** (Koala | 2024.1.2)
- [x] **Java** para desenvolvimento
- [x] **FrameLayout** para interface responsiva
- [x] **TextView** e **EditText** para entrada e exibição de dados
      
## Como Rodar o Projeto
Siga os passos abaixo para rodar o projeto localmente:

1. Clone este repositório:
```bash
git clone https://github.com/Klaiancdrosa/Consumo_de_Energia.git
```
2. Abra o projeto no Android Studio.
3. Compile e execute o projeto em um emulador ou dispositivo físico.
   
## Estrutura do Projeto
```bash
├── app
│ ├── src
│ │ ├── main
│ │ │ ├── java
| | | | |── com.example.consumoenergia
│ │ │ │ | ├── MainActivity.java # Atividade aonde ocorre o cálculo do consumo e custo de energia.
| │ │ │ ├── res
| | | | ├── drawable # imagens e icones utilizados na tela principal
│ │ │ │ ├── layout
│ │ │ │ | ├── activity_main.xml # Layout da tela principal
│ │ │ │ └── values
│ │ │ │ ├── strings.xml # Strings usadas no app
│ │ │ │ ├── colors.xml # Cores definidas no projeto
│ └── build.gradle # Configuração do Gradle
└── README.md # Este arquivo
```

## Design e Prototipage
A interface do app foi criada usando **FrameLayout**;
O design é minimalista e fácil de usar, com foco na simplicidade e entendimento.

## Telas do App Hamburgueria
**Tela Principal**
Tela principal aonde o usuário poderá inserir as informações necessárias para saber o custo e o consumo de energia.

![image](https://github.com/user-attachments/assets/8f59fef4-bd32-45a8-8d38-76183c6f1997)

## Desenvolvedores
**Klaian Conceição da Rosa** - Desenvolvedor - [GitHub](https://github.com/Klaiancdrosa)

## Licenças
Este projeto está licenciado sob os termos da licença MIT. Para mais detalhes, veja o arquivo
[LICENSE](LICENSE).
