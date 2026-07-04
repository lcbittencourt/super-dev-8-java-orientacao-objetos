import javax.swing.JOptionPane;

public class CarroExecutor {
    public void executar() {
        Carro uno = new Carro();
        uno.motor = 3.5;
        uno.modelo = "Uno com escada";
        uno.cor = "Claro";
        uno.isEletrico = false;
        uno.marca = "Fiat";
        uno.aro = 14;

        uno.modelo = "Uno com escada dupla";
        uno.motor = 7.0;
        uno.cor = "Relampago marquinhos";

        Carro carro1 = new Carro();
        carro1.modelo = JOptionPane.showInputDialog("Digite o modelo do carro");
        carro1.cor = JOptionPane.showInputDialog("Digite a cor");
        carro1.isEletrico = Boolean.parseBoolean(JOptionPane.showInputDialog("Carro elétrico? [true/false]"));
        carro1.motor = Double.parseDouble(JOptionPane.showInputDialog("Digite a potência do motor"));
        carro1.marca = JOptionPane.showInputDialog("Digite o nome da marca");
        carro1.aro = Integer.parseInt(JOptionPane.showInputDialog("Digite o aro do carro"));

        JOptionPane.showMessageDialog(null,
            "=== Dados do Uno ====" +
            "\nModelo: " + uno.modelo +
            "\nCor: " + uno.cor +
            "\nElétrico: " + uno.isEletrico +
            "\nMotor: " + uno.motor +
            "\nMarca: " + uno.marca +
            "\nAro: " + uno.aro +

            "\n\n=== Dados Carro 1 ===" +
            "\nModelo: " + carro1.modelo +
            "\nCor: " + carro1.cor +
            "\nElétrico: " + carro1.isEletrico +
            "\nMotor: " + carro1.motor +
            "\nMarca: " + carro1.marca +
            "\nAro: " + carro1.aro
        );
    }
}
