package com.ssg.w1.todo;

import com.ssg.w1.todo.DTO.TodoDTO;
import com.ssg.w1.todo.service.TodoService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "todoListController", urlPatterns = "/todo/list")
public class TodoListController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("/todo/list.....call");


        List<TodoDTO> dtoList = TodoService.INSTANCE.getList();
        req.setAttribute("dtoList", dtoList);


        req.getRequestDispatcher("/todo/list.jsp").forward(req, resp);
    }
}
