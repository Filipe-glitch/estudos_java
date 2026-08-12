package poo.sealed_class_c7.exemplo_dois;

public class PetMachine {
    private boolean clean = true;
    private int water = 30;
    private int shampoo = 10;
    private Pet pet;

    public void takeAShower() {
        if (this.pet == null) {
            System.out.println("Coloque o pet na máquina para iniciar o banho.");
            return;
        }

        if (this.water < 10 || this.shampoo < 2) {
            System.out.println("Nível de água ou shampoo insuficiente para dar banho.");
            return;
        }

        this.water -= 10;
        this.shampoo -= 2;
        pet.setClean(true);
        System.out.println("O pet " + pet.getName() + " tomou banho e está limpo!");
    }

    public void addWater() {
        if (water >= 30) {
            System.out.println("A capacidade de água da máquina já está no máximo (30L).");
            return;
        }
        water = Math.min(30, water + 2);
        System.out.println("Água adicionada. Nível atual: " + water + "L");
    }

    public void addShampoo() {
        if (shampoo >= 10) { // Corrigido bug do código original que comparava 'water' com 10
            System.out.println("A capacidade de shampoo da máquina já está no máximo (10L).");
            return;
        }
        shampoo = Math.min(10, shampoo + 2);
        System.out.println("Shampoo adicionado. Nível atual: " + shampoo + "L");
    }

    public int getShampoo() {
        return shampoo;
    }

    public int getWater() {
        return water;
    }

    public boolean hasPet() {
        return pet != null;
    }

    public void setPet(Pet pet) {
        if (!this.clean) {
            System.out.println("A máquina está suja! Limpe-a antes de colocar um novo pet.");
            return;
        }
        if (hasPet()) {
            System.out.println("O pet " + this.pet.getName() + " já está na máquina.");
            return;
        }

        this.pet = pet;
        System.out.println("O pet " + pet.getName() + " foi colocado na máquina.");
    }

    public void removePet() {
        if (!hasPet()) {
            System.out.println("Não há nenhum pet na máquina para remover.");
            return;
        }

        this.clean = this.pet.isClean();
        System.out.println("O pet " + this.pet.getName() + " foi retirado da máquina.");
        this.pet = null;
    }

    public void wash() {
        if (this.water < 10 || this.shampoo < 2) {
            System.out.println("Água ou shampoo insuficientes para lavar a máquina.");
            return;
        }
        this.water -= 10;
        this.shampoo -= 2;
        this.clean = true;
        System.out.println("A máquina foi higienizada com sucesso!");
    }
}