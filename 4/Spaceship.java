public class Spaceship {
    String name;
    int capacity;
    int capLeft;
    Cargo e;
    String [] cargoEle = new String[100];
    int count = 0;
    int weight;

    Spaceship(String n, int c){
        name = n;
        capacity = c;
        capLeft = capacity;
    }    
    public void loadCargo(Cargo element){
        e = element;
        if(e.weight > capLeft)
            System.out.println("Warning: Unable to load "+e.name+" inside "+name+". Exceeds capacity by "+capLeft);
        else {
            cargoEle[count] = e.name;
            count++;
            capLeft -= e.weight; 
            weight += e.weight;
        }
    }
    public void displayDetails(){
        System.out.println("Spaceship Name: "+name);
        System.out.println("Capacity: "+capacity);
        System.out.println("Current Cargo Weight: "+weight);
        System.out.print("Cargo: ");
        for(int i = 0; i < count; i++)
            System.out.print(cargoEle[i]+" ");
        System.err.println();
    }
}

class Cargo {
    String name;
    int weight;
    
    Cargo (String n, int c){
        name = n;
        weight = c;
    }

}