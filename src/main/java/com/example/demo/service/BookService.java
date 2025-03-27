package com.example.demo.service;

import com.example.demo.entity.Book;
import com.example.demo.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BookService {

   private final BookRepository bookRepository; // DI(생성자 주입)

   //책 전체 목록 가져오기...(연습)
   @Transactional(readOnly = true)
   public List<Book> getAllLists(){
       // 순환참조 문제를 해결 ? -> DTO
       List<Book> books=bookRepository.findAll(); // 1번 SQL
       


       return null; // EntityManager가 살행
   }
}
