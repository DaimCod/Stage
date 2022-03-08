package interfaceEs2;

public class Test {

	public static void main(String[] args) {
		DistributoreBenzina db1 = new DistributoreBenzina();
		DistributoreBenzina db2 = new DistributoreBenzina("Milano", "Rossi", 1000, 500);
		
		System.out.println("DB1");
		System.out.println("Benzina " + db1.getBenzinaAttuale());
		System.out.println("Incasso "+ db1.getIncasso());
		
		System.out.println("DB2 prima");
		System.out.println("Benzina " + db2.getBenzinaAttuale());
		System.out.println("Incasso "+ db2.getIncasso());
		System.out.println("DB2 dopo");
		db2.erogazione(20);
		System.out.println("Benzina " + db2.getBenzinaAttuale());
		System.out.println("Incasso "+ db2.getIncasso());
		
		DistributoreBenzina db3 = new DistributoreBenzina("Roma", "Verdi", 500, 300);
		db3.compare(db2);
	}

}
