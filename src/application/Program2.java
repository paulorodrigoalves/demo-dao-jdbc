package application;

import jdk.swing.interop.SwingInterOpUtils;
import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Program2 {

    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);

        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        /*System.out.println("\n====  Teste 1: Testando a função insert ====");
        Department newDp = new Department(null, "Arquitetura");
        departmentDao.insert(newDp);
        System.out.println("Inserção feita com sucesso, Id: " + newDp.getId());

        System.out.println("\n====  Teste 2: Testando a função findById ====");
        newDp = departmentDao.findById(6);
        System.out.println(newDp);

        System.out.println("\n====  Teste 3: Testando a função update ====");
        newDp = departmentDao.findById(5);
        newDp.setName("Laboratório");
        departmentDao.update(newDp);
        newDp = departmentDao.findById(5);
        System.out.println("Atualização feita com sucesso!");
        System.out.println(newDp);

        System.out.println("\n====  Teste 4: Testando a função deleteById ====");
        System.out.print("Informe o Id que deseja deletar: ");
        int id = sc.nextInt();
        departmentDao.deleteById(id);
        System.out.println("Deletado com sucesso! ");*/

        System.out.println("\n====  Teste 5: Testando a função findAll ====");
        List<Department> list = departmentDao.findAll();

        for (Department dp : list) {
            System.out.println(dp);
        }

    }
}
