import java.util.Arrays;

public class MyOwnList implements InterfaceOwnList {

	transient int TEMPORARY_CAPACITY = 0;
	transient Object[] dataRepository;
	private int counter = 0;

	public MyOwnList() {
		this.dataRepository = new Object[TEMPORARY_CAPACITY];
	}

	// listeye eleman ekler
	@Override
	public void add(Object object) {
		TEMPORARY_CAPACITY += 1;
		this.dataRepository = Arrays.copyOf(this.dataRepository, TEMPORARY_CAPACITY);
		this.dataRepository[counter] = object;
		this.counter++;
	}

	// listedeki eleman sayısını döner
	@Override
	public int size() {
		return counter;
	}

	// listenin istenilen indeksteki elemanını getirir
	@Override
	public Object getOf(int i) {
		if (this.dataRepository.length >= i)
			return this.dataRepository[i];
		else
			return null;
	}

	// istenilen değerin indeks değerini getirir,yoksa -1 döner
	@Override
	public int getİndexOf(Object object) {
		for (int i = 0; i < counter; i++) {
			if (this.dataRepository[i].toString().equals(object.toString())) {
				return i;
			}
		}
		return -1;

	}

	// silinmek istenen indeks değerini parametre olarak alır..
	@Override
	public boolean remove(int index) {
		if (this.dataRepository.length >= index) {
			counter--;
			TEMPORARY_CAPACITY--;			
			for (int i = index; i < this.dataRepository.length - 1; i++) {
				dataRepository[i] = dataRepository[i + 1];
			}
			return true;
		} else {
			return false;
		}

	}

	// listenin tüm elemanlarını gösterir...
	@Override
	public void show() {
		System.out.print("[ ");
		for (int i = 0; i <= this.size() - 1; i++) {
			if (i < this.size() & i != 0)
				System.out.print(" , ");
			System.out.print(this.dataRepository[i]);
		}
		System.out.println(" ]");
		
	}

}
