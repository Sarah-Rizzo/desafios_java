public class MaquinaBanho {

    private boolean clean = true;

    private int water = 30;

    private int shampoo = 10;

    private Pet pet;

    public void DarBanho() {
        if(this.pet == null) {
            System.out.println("Coloque o pet na maquina para iniciar o banho");
            return;
        }
        this.water -=10;
        this.shampoo -=2;
        pet.setClean(true);
        System.out.println("O pet" + pet.getName() + "esta limpo");
    }
    public void addWater () {
        if (this.water == 30){
            System.out.println("A capacidade de água da máquina esta no maximo");
        }


        water += 2;
    }
    public void addShampoo () {
        if (shampoo == 10){
            System.out.println("A capacidade de shampoo da máquina esta no maximo");
            return;
        }
        shampoo += 2;
    }

    public int getWater() {
        return water;
    }

    public int getShampoo() {
        return shampoo;
    }

    public boolean hasPet(){
        return pet != null;
    }

    public void setPet(Pet pet) {
        if (hasPet()){
            System.out.println("O pet " + this.pet.getName() + "  esta na maquina nesse momento.");
            return;
        }

        if (this.clean){
            System.out.println("O pet " + pet.getName() + " foi colocado na maquina");
            this.pet = pet;
        }

    }
    public void removePet() {
        this.clean = this.pet.isClean(); // caso a maquina esteja limpa o pet também estara.
        System.out.println(" O pet " + this.pet.getName() + " foi retirado da maquina.");
        this.pet = null;
        this.clean = true;
    }
    public void wash() {
        this.water -=10;
        this.shampoo -=2;
        this.clean = true;
        System.out.println(" Foi realizado a limpeza da maquina.");
        }
}

