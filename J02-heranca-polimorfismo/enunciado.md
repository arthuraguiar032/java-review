### J-02 — Herança e polimorfismo
 
Crie uma hierarquia: classe abstrata `Midia` com atributos `titulo` e `anoLancamento` e método abstrato `exibirDetalhes()`. Subclasses: `Anime`, `Manga`, `LightNovel`.
 
- Cada subclasse tem pelo menos um atributo próprio e implementa `exibirDetalhes()`.
- No `main`, crie uma `List<Midia>` mista e itere chamando `exibirDetalhes()`.
- Implemente a interface `Comparable<Midia>` para ordenar por ano de lançamento.