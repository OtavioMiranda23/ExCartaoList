import java.util.ArrayList;

public class CartaoDeCredito {
    private double limite;
    private double saldo;
    ArrayList<Compra> compras;

    public CartaoDeCredito(double limite) {
        this.limite = limite;
        this.saldo = saldo;
        this.compras = compras;
    }

    public double getLimite() {
        return limite;
    }

    public double getSaldo() {
        return saldo;
    }

    public ArrayList<Compra> getCompras() {
        return compras;
    }

    public boolean lancaCompra(Compra compra) {
        if (this.saldo > compra.getValor()) {
            limite -= compra.getValor();
            this.compras.add(compra);
            return true;
        } else {
            return false;
        }
    }
}

