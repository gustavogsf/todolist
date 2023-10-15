<h1 align="center"> Todo List </h1>

<p align="center">
Programa exclusivo e gratuito, promovido pela Rocketseat para ensino de Java ☕. <br/>
<a href="https://app.rocketseat.com.br/events">Estude esse projeto em formato de vídeo clicando aqui.</a>
</p>

<p align="center">
  <img alt="License" src="https://img.shields.io/static/v1?label=license&message=MIT&color=49AA26&labelColor=000000">
</p>

<br>

<p align="center">
  <img alt="projeto DevLinks" src=".\assets\PROJETO.jpg" width="100%">
</p>

## 🚀 Tecnologias

Esse projeto foi desenvolvido com as seguintes tecnologias:

- Java
- Spring Boot
- Maven
- BCrypt
- Docker
- Git e Github

## 💻 Projeto

O Todo List é uma aplicação em Java desenvolvido com a framework Spring Boot.

## ⚙️ Como utilizar

1. Acesse uma Rest API (Recomendo o [Apidog](https://apidog.com/download/)).
2. Acesse um projeto e crie um novo Request.
3. Para <b>criar um usuário</b>, defina o método POST e adicione o caminho:
https://todolist-rocket-riy2.onrender.com/users/, depois, dentro do Body selecione "json" e insira as informações do usuário, como mostrado na figura. 

<br>

<p align="center">
  <img alt="Tela de criação de usuário" src=".\assets\USUARIO.jpg" width="100%">
</p>

<br><br>

4. Para <b>criar uma tarefa</b>, defina o método POST e adicione o caminho:
https://todolist-rocket-riy2.onrender.com/tasks/, depois, dentro do Body selecione "json" e insira as informações de criação de tarefa, como mostrado na figura. 

<br>

<p align="center">
  <img alt="Tela de criação de usuário" src=".\assets\TAREFA.jpg" width="100%">
</p>

<br><br>

5. Para <b>visualizar as tarefas criadas</b>, defina o método GET e adicione o caminho:
https://todolist-rocket-riy2.onrender.com/tasks/, depois, na aba Auth defina o type como "Basic Auth" e insira as informações do usuário que deseja ver as tarefas, como mostrado na figura. 

<br>

<p align="center"><b>IMPORTANTE:</b> As etapas 5 e 6 devem ser realizadas com o usuário dono das tarefas.</p>

<br>

<p align="center">
  <img alt="Tela de criação de usuário" src=".\assets\VERIFICAR.jpg" width="100%">
</p>

<br><br>

6. Para <b>modificar uma tarefa</b>, defina o método PUT e adicione o caminho:
https://todolist-rocket-riy2.onrender.com/tasks/(+ o ID da task que deseja modificar), depois, dentro do Body selecione "json" e insira as informações que deverão ser alteradas, como mostrado na figura. 

<br>

<p align="center">
  <img alt="Tela de criação de usuário" src=".\assets\ALTERAR.jpg" width="100%">
</p>

<br>

 

## :memo: Licença

Esse projeto está sob a licença MIT.

---

<br>

Feito com ♥ with Rocketseat :wave: [Participe da comunidade!](https://discord.gg/rocketseat)