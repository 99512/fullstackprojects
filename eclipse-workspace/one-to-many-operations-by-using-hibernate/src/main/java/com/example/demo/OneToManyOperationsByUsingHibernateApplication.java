package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.entity.PhoneNumber;
import com.example.demo.entity.Post;
import com.example.demo.entity.Tag;
import com.example.demo.entity.Persons;
import com.example.demo.repository.PersonRepository;
import com.example.demo.repository.PostRepository;
import com.example.demo.repository.TagsRepository;

@SpringBootApplication
public class OneToManyOperationsByUsingHibernateApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(OneToManyOperationsByUsingHibernateApplication.class, args);
	}

	@Autowired 
    private	PersonRepository personRepository;
	
	@Autowired
	private PostRepository postRepository;
	
	@Autowired
	private TagsRepository tagsRepository;
	
	@Override
	public void run(String... args) throws Exception {
		Persons persons=new Persons("naveen","ramesh","naveen@gamil.com","25");
		
		PhoneNumber comment1=new PhoneNumber("9381795963");
		PhoneNumber comment2=new PhoneNumber("1234567890");
		PhoneNumber comment3=new PhoneNumber("9087654321");
		PhoneNumber comment4=new PhoneNumber("5678904321");
		
		
		persons.getComments().add(comment1);
		persons.getComments().add(comment2);
		persons.getComments().add(comment3);
		persons.getComments().add(comment4);
		
		this.personRepository.save(persons);
		
		
		Post post=new Post("hibernate many to many mapping","thsi is understandble","good");
		Post post1=new Post("hibernate many to many mapping","thsi is understandble","good");
		Tag tag=new Tag("Spring boot");

		Tag tag1=new Tag("hibernate");
		Tag tag3=new Tag("jpa");
		
		post.getTags().add(tag);
		post.getTags().add(tag1);
		post.getTags().add(tag3);
		
		tag.getPosts().add(post);
		tag1.getPosts().add(post);
		tag3.getPosts().add(post);
		
		tag.getPosts().add(post1);
		post1.getTags().add(tag1);
		this.postRepository.save(post);
		this.postRepository.save(post1);
	}

}
