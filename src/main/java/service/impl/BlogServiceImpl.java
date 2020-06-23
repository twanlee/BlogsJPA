package service.impl;

import model.Blog;
import org.springframework.beans.factory.annotation.Autowired;
import repository.BlogRepository;
import service.BlogService;

import java.util.List;

public class BlogServiceImpl implements BlogService {
    @Autowired
    private BlogRepository blogService;
    @Override
    public List<Blog> findAll() {
        return blogService.findAll();
    }

    @Override
    public Blog findById(Long id) {
        return blogService.findById(id);
    }

    @Override
    public void save(Blog customer) {
        blogService.save(customer);
    }

    @Override
    public void remove(Long id) {
        blogService.remove(id);
    }
}
