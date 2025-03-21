package Actividad14;
public class ActividadItem {

	public static void main(String[] args) {
		
		Item item1 = new Item("primero");
        Item item2 = new Item("segundo");
        Item item3 = new Item("tercero");

        System.out.println("Item 1: Nombre: "+item1.getNombre()+". Identificacion: "+item1.getgenerarId());
        System.out.println("Item 2: Nombre: "+item2.getNombre()+". Identificacion: "+item2.getgenerarId());
        System.out.println("Item 3: Nombre: "+item3.getNombre()+". Identificacion: "+item3.getgenerarId());
	}

}
