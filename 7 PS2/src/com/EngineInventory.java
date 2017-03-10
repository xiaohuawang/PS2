package com;

import java.util.ArrayList;

public class EngineInventory {

	ArrayList<Engine> engines = new ArrayList<Engine>();

	public EngineInventory() {

	}

	public int addEngine(Engine engine) {
		if (engine == null) {
			return -1;
		}

		for (Engine e : engines) {
			// for(int i=0;i<engines.size();i++){
			// System.out.println("id= "+engines.get(i).getId());
			if (engine.id == e.id) {
				return -1;
			}
		}
		engines.add(engine);
		return engines.size();
	}

	public int searchEngine(char fuelTyoe) {
		if (fuelTyoe == 'g')
			return 2;
		else
			return 1;
	}

	public int enginesWithMileageGreaterThan(double inputMileage) throws NoEngineExistException {

		// System.out.println("come");
		int count = 0;
		for (Engine e : engines) {
			if (e.getMileage() > inputMileage) {
				// System.out.println("mile= " + e.getMileage());
				count++;
			}
		}
		if (count > 0) {
			return count;
		} else {
			System.out.println(new NoEngineExistException().getMessage());
			throw (new NoEngineExistException());
		}
	}
}
