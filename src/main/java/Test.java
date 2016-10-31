import org.jxls.common.Context;
import org.jxls.util.JxlsHelper;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * desc the file.
 *
 * @author demon
 * @Date 2016/10/31 10:42
 */
public class Test {
    public static void main(String[] args) throws IOException {
        List<Employee> employees = generateSampleEmployeeData();
        InputStream is = Test.class.getResourceAsStream("object_collection_template.xls");
        OutputStream os = new FileOutputStream("object_collection_output.xls");
        Context context = new Context();
        context.putVar("employees", employees);
        JxlsHelper.getInstance().processTemplate(is, os, context);

    }

    public static List<Employee> generateSampleEmployeeData() {
        List<Employee> employees = new ArrayList<>();
        Employee employee = new Employee("demon", new Date(), new BigDecimal(10000), new BigDecimal(1000));
        Employee employee1 = new Employee("demon1", new Date(), new BigDecimal(10000), new BigDecimal(1000));
        Employee employee2 = new Employee("demon2", new Date(), new BigDecimal(10000), new BigDecimal(1000));
        Employee employee3 = new Employee("demon3", new Date(), new BigDecimal(10000), new BigDecimal(1000));
        Employee employee4 = new Employee("demon4", new Date(), new BigDecimal(10000), new BigDecimal(1000));
        employees.add(employee);
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);
        return employees;
    }


}
