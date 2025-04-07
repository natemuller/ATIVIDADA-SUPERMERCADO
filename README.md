# ATIVIDADA-SUPERMERCADO

Construa um supermercado que possua um número de caixas definido durante
sua instanciação. Os caixas devem possuir capacidade máxima de
atendimento (# de clientes na fila), devem possuir uma identificação única
e podem estar em funcionamento ou parados. A entrada de clientes deve ser
feita via classe supermercado. A entrada de um cliente na fila deve sempre
ocorrer na fila menos cheia e que ainda tem condições de atender. Deve
haver um método na classe caixa que faz com que o atendimento no caixa
avance. O fim do atendimento e a consequente redução da fila deve ser
feita de forma probabilística, onde a chance de finalizar um atendimento
no caixa deve ser de 50 por cento. Todo cliente atendido deve ter um valor de
compra registrado para o supermercado saber o total faturado. Caso um
cliente não consiga ser atendido (não havia caixa aberto em condições de
lhe atender) um valor de perda de faturamento também de ser anotado.
Uma compra é de no mínimo R$ 10, podendo chegar até R$5000. Deve ser
possível consultar 

(a) o quanto o supermercado já faturou
(b) quanto ele perdeu
(c) quantos clientes entraram no supermercado
(d) quantos não
foram atendidos
(e) qual o valor da menor compra
(f) da maior compra,
(g) número de caixas disponíveis
(h) em funcionamento e parados.
