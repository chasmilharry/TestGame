package renderEngine;

public class Loader {
	
	public RawModel loadToVAO(float[] positions){
		int vaoID = createVAO();
		storeDataInAttributeList(0,positions);
		unbindVAO();
		return new RawModel(vaoID,positions.length/3);
	}

	private int createVAO(){}
	
	private void storeDataInAttributeList(int attributeNumber, float[] data){
		
	}
	
	private void unbindVAO(){}
}
