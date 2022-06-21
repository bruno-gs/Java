package simpledb;

import java.sql.SQLException;  
import java.sql.ResultSet;

public class Principal {
    public static void main(String[] args) {
        DAO crud = new DAO();
        try {
            ResultSet rs = crud.buscarPorNome("ENGENHARIA");
            while (rs.next()) {
                String lista = ("No do Depto: " + rs.getInt("DEPTNO") + " - " + "Nome: "
                        + rs.getString("DNAME") + " - " + "Localização: " + rs.getString("LOCAL"));
                System.out.println(lista);
            }
        } catch( SQLException e) {
            System.out.println("Consulta não foi possível");
        }
    }
}


//public class Principal {
//    public static void main(String[] args) {
//        DAO crud = new DAO();
//        try {
//            ResultSet rs = crud.buscar();
//            while (rs.next()) {
//                String lista = ("No do Depto: " + rs.getInt("DEPTNO") + " - " + "Nome: "
//                        + rs.getString("DNAME") + " - " + "Localização: " + rs.getString("LOCAL"));
//                System.out.println(lista);
//            }
//        } catch( SQLException e) {
//            System.out.println("Consulta não foi possível" + e.getMessage());
//        }
//    }
//}




//public class Principal {
//    public static void main(String[] args) {
//        // TODO code application logic here
//        DAO crud = new DAO();
//        crud.remover(80);
//    }
//}




//public class Principal {
//    public static void main(String[] args) {
//        // TODO code application logic here
//        DAO crud = new DAO();
//        crud.alterar(80, "TI");
//    }
//}



//public class Principal {
//    public static void main(String[] args) {
//        // TODO code application logic here
//        DAO crud = new DAO();
//        crud.inserir(100, "ENGENHARIA", "SAO PAULO - SP");
//        crud.inserir(80, "IT", "SAO PAULO");
//        crud.inserir(10, "management", "SAO PAULO - SP");
//    }
//}
