package crud;

import bed.Bed;
import fileIO.FileIO;
import fileIO.FileIOInteface;

public class FileCrud implements Lab2Crud {
	
	FileIOInteface fio;
	
	

	public FileCrud() {
		this.fio = new FileIO();
	}

	@Override
	public Bed readBed() {
		
		return (Bed) fio.loadFromFile();
	}

	@Override
	public void updateBed(Bed bed) {
		fio.saveToFile(bed);

	}

}
