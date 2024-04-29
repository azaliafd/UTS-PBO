package UTS;

interface Hewan {
  void makan();
}

abstract class Binatang implements Hewan {
  private String nama;

  public void setNama(String nama) {
    this.nama = nama;
  }

  public String getNama() {
    return this.nama;
  }

  public abstract void makan();
}

class Kucing extends Binatang {
  @Override
  public void makan() {
    System.out.println(this.getNama() + " sedang makan ikan");
  }
}

class Anjing extends Binatang {
  @Override
  public void makan() {
    System.out.println(this.getNama() + " sedang makan tulang");
  }
}

public class Main {
  public static void main(String[] args) {
    Kucing kucing = new Kucing();
    Anjing anjing = new Anjing();

    kucing.setNama("Garfield");
    kucing.makan();

    anjing.setNama("Spike");
    anjing.makan();
  }
}

