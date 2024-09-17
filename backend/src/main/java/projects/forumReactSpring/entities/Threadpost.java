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

@Table(name = "Posts")
@Setter
@Getter
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Threadpost {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer postId;
	
	@Column
	private Integer userId;
	
	@Column
	private Integer threadId;
	
	@Column
	private String postContent; 
	
	@Column
	private Timestamp postTime;
}
