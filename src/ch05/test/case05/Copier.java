package condingTest.ch05.case05;

public class Copier {
	public Document copy(Document srcDoc){			
		Document destDoc = new Document();	
		destDoc.setTitle(srcDoc.getTitle());	
		destDoc.setContent(srcDoc.getContent());	
		destDoc.setCreationDate(srcDoc.getCreationDate());	
		destDoc.setPageNum(srcDoc.getPageNum());	
			
		return destDoc;	
	}		
}			
