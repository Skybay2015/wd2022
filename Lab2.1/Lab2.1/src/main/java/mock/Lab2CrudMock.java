package mock;

import bed.Bed;
import crud.Lab2Crud;

public class Lab2CrudMock implements Lab2Crud {

	@Override
	public Bed readBed() {
		// TODO Auto-generated method stub
		return new Bed("Bed", "https://mebli4you.com.ua/images/product_images/popup_images/13627_0.jpg", "Mock");
	}

	@Override
	public void updateBed(Bed bed) {
		// TODO Auto-generated method stub

	}

}
