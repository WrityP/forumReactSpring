package projects.forumReactSpring.entities;


import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "Thread")
@Setter
@Getter
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Thread {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer threadId; 
	
	@Column
	private String threadName; 
	
	@Column
	private Timestamp threadTime;
}
