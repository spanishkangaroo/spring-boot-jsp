package es.sexycoding.jspjstlexample.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class IssueDoc {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String name;
	
	@OneToMany(mappedBy="issueDoc" )
	private List<IssueAnomaly> issueAnomalyList = new ArrayList<IssueAnomaly>();
	
	protected IssueDoc() {}

    public IssueDoc(String name) {
        this.name = name;
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<IssueAnomaly> getIssueAnomalyList() {
		return issueAnomalyList;
	}

	public void setIssueAnomalyList(List<IssueAnomaly> issueAnomalyList) {
		this.issueAnomalyList = issueAnomalyList;
	}

	@Override
	public String toString() {
		return String.format("IssueDoc[id=%d, name='%s']", id, name);
	}
}
