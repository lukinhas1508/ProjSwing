Exemplo de BorderLayout em Java Swing  

 **Autor:** Lucas Dias Bernardes  
 **Curso:** Ciências da Computação – UNIP  
---

## 🎯 Objetivo  

O objetivo desta prática foi **desenvolver uma interface gráfica em Java** utilizando a biblioteca **Swing**, aplicando diferentes tipos de *Layouts Managers* para organizar os componentes da janela.  

---

## 📝 Descrição do Código  

O programa cria uma janela gráfica contendo:  

- **Dois rótulos** (`Nome` e `Endereço`);  
- **Dois campos de texto** (`JTextField`) para entrada de dados;  
- **Um botão** `OK` para interação.  

Para isso, foram utilizados três `JPanel`, cada um configurado com um tipo de layout diferente:  

- **BorderLayout** → para organizar as regiões principais da janela.  
- **GridLayout** → para alinhar os rótulos e campos de texto.  
- **FlowLayout** → para organizar o botão na parte inferior.  

---

## 🏗️ Estrutura do Programa  

1. Criação da janela principal (`JFrame`).  
2. Instanciação dos componentes gráficos (`JLabel`, `JTextField`, `JButton`).  
3. Organização dos componentes em painéis (`JPanel`).  
4. Definição dos layouts:  
   - `jPanel1` → `GridLayout` para rótulos.  
   - `jPanel2` → `GridLayout` para campos de texto.  
   - `jPanel3` → `FlowLayout` para o botão.  
5. Inserção dos painéis no `BorderLayout` da janela.  
6. Exibição da janela com o método `setVisible(true)`.  

---

## 📊 Resultado Esperado  

Ao executar o programa, o usuário visualizará:  

- **Lado esquerdo (WEST):** rótulos “Nome” e “Endereço”;  
- **Centro (CENTER):** campos de entrada de texto correspondentes;  
- **Parte inferior (SOUTH):** botão **OK**.  

---

## Conclusão

Este exercício permitiu compreender a importância dos Layouts Managers na criação de interfaces gráficas em Java.
O uso combinado de BorderLayout, GridLayout e FlowLayout possibilitou organizar os componentes de forma clara e funcional.

## Observação: Este exemplo é didático e faz parte das práticas de programação com Java Swing desenvolvidas na faculdade.
