import javax.swing.JOptionPane;

public class FabricanteExecutor {

    public void executar() {
    Fabricante fabricanteSC = new Fabricante();
    fabricanteSC.nome = "Bella Janela";
    fabricanteSC.cnpj = "72.344.591/0001-25";
    fabricanteSC.faturamento = 340000000.00;
    fabricanteSC.percentualLucro = 12;

    apresentar(fabricanteSC);

    Fabricante fabricanteRS = new Fabricante();
    fabricanteRS.nome = "Fruki Bebidas S.A.";
    fabricanteRS.cnpj = "87.315.099/0001-07";
    fabricanteRS.faturamento = 100000000.00;
    fabricanteRS.percentualLucro = 22;

    apresentar(fabricanteRS);
}
    public void apresentar(Fabricante fabricante) {
    double lucro = fabricante.faturamento * fabricante.percentualLucro / 100;

        JOptionPane.showMessageDialog(null,
                "=== Fabricante ===\n" +
                        "Nome: " + fabricante.nome + "\n" +
                        "CNPJ: " + fabricante.cnpj + "\n" +
                        "Faturamento: R$ " + fabricante.faturamento + "\n" +
                        "Percentual de Lucro: " + fabricante.percentualLucro + "%\n" +
                        "Lucro: R$ " + lucro);
    }
}