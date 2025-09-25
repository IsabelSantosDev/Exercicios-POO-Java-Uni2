# 📘 Atividade Unidade 2 - Programação Orientada a Objetos (POO) em Java

Bem-vindo(a) à atividade da **Unidade 2**!  
Aqui estão os exercícios práticos desenvolvidos em **Java** para treinar **herança, polimorfismo, interfaces e classes abstratas**.  
Cada exercício foi feito em um arquivo separado para melhor organização. 🎯

---

## 📂 Estrutura de Pastas

src/
└─ exercicios_unidade2/

├─ VeiculoHerança.java # Veículo, Carro e Moto

├─ HierarquiaAnimais.java # Hierarquia de Animais

├─ ContaBancaria.java # Conta Bancária, Corrente e Poupança

├─ InfoVeiculos.java # Impressão de Informações de Veículos

├─ SonsAnimais.java # Sons dos Animais

├─ Calculadora.java # Calculadora com Polimorfismo (sobrecarga)

├─ FormasGeometricas.java # Formas Geométricas

├─ ListaSonsAnimais.java # Lista de Sons de Animais

├─ JurosContaBancaria.java # Aplicação de Juros

└─ AutenticaçãoUsuario.java # Interface Autenticável

---

## 📝 Exercícios Implementados

### 1️⃣ Veículo e Herança
- Classe base **Veículo** com modelo e ano.
- Subclasses **Carro** e **Moto**, com atributos específicos e métodos adicionais.

### 2️⃣ Hierarquia de Animais
- Classe base **Animal**.
- Subclasses **Mamífero, Ave e Peixe** com características próprias.

### 3️⃣ Conta Bancária
- Classe base **ContaBancaria**.
- Subclasses **ContaCorrente** e **ContaPoupanca**, cada uma com comportamentos diferentes.

### 4️⃣ Impressão de Informações de Veículos
- Método `imprimirInformacoes()` sobrescrito em **Carro** e **Moto**.

### 5️⃣ Sons dos Animais
- Método `emitirSom()` sobrescrito em **Mamífero, Ave e Peixe**.

### 6️⃣ Polimorfismo na Calculadora
- Classe **Calculadora** com métodos sobrecarregados para `int` e `double`.

### 7️⃣ Formas Geométricas
- Classe abstrata **FormaGeometrica**.
- Subclasses **Círculo, Retângulo e Triângulo**, cada uma com fórmulas próprias.

### 8️⃣ Lista de Sons de Animais
- Lista de animais com chamada polimórfica ao método `emitirSom()`.

### 9️⃣ Aplicação de Juros em Contas Bancárias
- Implementação de `aplicarJuros()` diferente em **ContaCorrente (15%)** e **ContaPoupança (6,5%)**.

### 🔟 Autenticação de Usuários
- Interface **Autenticavel**.
- Implementada por **Usuario** e **Administrador**.

---

## ▶️ Como Compilar e Executar

`bash

javac -d bin src/exercicios_unidade2/*.java

Rode o exercício desejado, por exemplo:

java -cp bin exercicios_unidade2.Main (Para os exercícios 1, 2, 3, 4, 5, 6, 8 e 9)

ou

java -cp bin exercicios_unidade2.AutenticaçãoUsuario (ou qualquer outro exercício que queira ver)

---

## 👩‍💻 Autor

Isabel dos Santos