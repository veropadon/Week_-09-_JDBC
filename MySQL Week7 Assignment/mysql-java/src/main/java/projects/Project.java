package projects;

import java.math.BigDecimal;




	
	
	 
		  
		  public class Project {
			   
				private String projectName;
			    private BigDecimal estimatedHours;
			    private BigDecimal actualHours;
			    private Integer difficulty;
			    private String notes;
				private Integer projectId;
			    
			    public Project() {
			    	
			    
			    }

				public String getProjectName() {
					return projectName;
				}

				public void setProjectName(String projectName) {
					this.projectName = projectName;
					

				
					
				}

				public BigDecimal getEstimatedHours() {
					return estimatedHours;
				}

				public void setEstimatedHours(BigDecimal estimatedHours) {
					this.estimatedHours = estimatedHours;
				}

				public BigDecimal getActualHours() {
					return actualHours;
				}

				public void setActualHours(BigDecimal actualHours) {
					this.actualHours = actualHours;
				}

				public Integer getDifficulty() {
					return difficulty;
				}

				public void setDifficulty(Integer difficulty) {
					this.difficulty = difficulty;
				}

				public String getNotes() {
					return notes;
				}

				public void setNotes(String notes) {
					this.notes = notes;
				}
				
				
				 public int getProjectId() {
				        return projectId; 
				        
				 
				 }

				public void setProjectId(int  projectId) {
					this.projectId = projectId;
					
				}
					
				
			
				
					
				//	@Override 
				
				public String toString() {
				    if ("Hang a Door".equals(projectName)) {
				        System.out.println("1");
				        
				    }
					
					
				        return "\nID = " + projectId + 
				        	 	" \nname = " + projectName +
				               " \nEstimatedHours = " + estimatedHours +
				               " \nActualHours = " + actualHours +
				               "\ndifficulty = " + difficulty +
				               " \nnotes = " + notes +
				               " \nMaterials = "  +
				               " \nSteps = "  +
				               " \nCategories = " ;
				    }
				}
		  
				
				
					
					
					
					
			
			    
			    
			    
			    
			    
			    
			    
			    
			    
		  
		  
	  


