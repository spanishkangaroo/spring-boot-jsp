package es.sexycoding.jspjstlexample.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class IssueAnomaly {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String name;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "issue_id")
	private Issue issue;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "issuedoc_id", referencedColumnName = "id")
	private IssueDoc issueDoc;
	
	protected IssueAnomaly() {}

    public IssueAnomaly(String name) {
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
	
	public Issue getIssue() {
		return issue;
	}

	public void setIssue(Issue issue) {
		this.issue = issue;
	}

	@Override
	public String toString() {
		return String.format("IssueAnomaly[id=%d, name='%s']", id, name);
	}
}
