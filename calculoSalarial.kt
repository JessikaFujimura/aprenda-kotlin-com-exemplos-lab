object ReceitaFederal {
    fun calcularImposto(salario: Float): Float {
        val aliquota = when {
            (salario in 0.0f..1100.0f) -> 0.05f
            (salario in 1100.01f..2500.00f) -> 0.10f
            else -> 0.15f
        }
        return aliquota;
    }
}

fun main(){
    val valorSalarioBruto = readln().toFloat();
    var valorBeneficios = readln().toFloat();
    var valorImposto = ReceitaFederal.calcularImposto(valorSalarioBruto);

    (valorSalarioBruto-(valorSalarioBruto*valorImposto) + valorBeneficios).also { println(it) }
}

