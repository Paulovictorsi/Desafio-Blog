package com.spring.codeblog.utils;

import com.spring.codeblog.model.Post;
import com.spring.codeblog.repository.CodeblogRepository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DummyData {
    @Autowired
    CodeblogRepository codeblogRepository;

    //@PostConstruct
    public void savePosts(){
        //Criado para iniciar os dados no Banco de Dados

        List<Post> postList = new ArrayList<>();
        Post post1 = new Post();
        post1.setAutor("Paulo Vitor");
        post1.setData(LocalDate.now());
        post1.setTitulo("Teste1");
        post1.setTexto("Primeiro post, servirá para teste futuros");

        Post post2 = new Post();
        post2.setAutor("Paulo Vitor");
        post2.setData(LocalDate.now());
        post2.setTitulo("Teste2");
        post2.setTexto("Segundo post, servirá para teste futuros");

        postList.add(post1);
        postList.add(post2);

        for(Post post: postList){
            Post postSaved = codeblogRepository.save(post);
            System.out.println(postSaved.getId());
        }

    }
}
