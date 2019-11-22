package me.mizhoux.mbgcomment;
import com.mysql.jdbc.StringUtils;
import org.mybatis.generator.api.IntrospectedColumn;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.dom.java.Field;
import org.mybatis.generator.api.dom.java.Method;
import org.mybatis.generator.api.dom.java.TopLevelClass;
import org.mybatis.generator.internal.util.StringUtility;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

public class MySQLCommentGenerator extends EmptyCommentGenerator {

    private Properties properties;

    public MySQLCommentGenerator() {
        properties = new Properties();
    }

    @Override
    public void addConfigurationProperties(Properties properties) {
        // 获取自定义的 properties
        this.properties.putAll(properties);
    }

    @Override
    public void addModelClassComment(TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
        String author = properties.getProperty("author");
        String dateFormat = properties.getProperty("dateFormat", "yyyy-MM-dd");
        SimpleDateFormat dateFormatter = new SimpleDateFormat(dateFormat);

        // 获取表注释
        /*
        *
        * import io.swagger.annotations.ApiModel;
          import io.swagger.annotations.ApiModelProperty;
          import lombok.Data;
@Data
@ApiModel(value = "楼盘、小区对象")
        *
        * */
        String remarks = introspectedTable.getRemarks();
        /*if(StringUtils.isNullOrEmpty(remarks)){
            remarks="暂无";
        }*/
//        topLevelClass.addJavaDocLine("/**");
//        topLevelClass.addJavaDocLine(" * " + remarks);
//        topLevelClass.addJavaDocLine(" *");
//        topLevelClass.addJavaDocLine(" * @author " + author);
//        topLevelClass.addJavaDocLine(" * @date   " + dateFormatter.format(new Date()));
//        topLevelClass.addJavaDocLine(" */");
        topLevelClass.addJavaDocLine("import io.swagger.annotations.ApiModel;");
        topLevelClass.addJavaDocLine("import io.swagger.annotations.ApiModelProperty;");
        topLevelClass.addJavaDocLine("import lombok.Data;");
        topLevelClass.addJavaDocLine("@Data");
        topLevelClass.addJavaDocLine("@ApiModel(value =\""+remarks+"\")");
    }

    @Override
    public void addFieldComment(Field field, IntrospectedTable introspectedTable, IntrospectedColumn introspectedColumn) {
        // 获取列注释 @ApiModelProperty(value = "搜藏用户的id")
        String remarks = introspectedColumn.getRemarks();
       /* if(StringUtils.isNullOrEmpty(remarks)){
            remarks="暂无";
        }*/
//        field.addJavaDocLine("/**");
//        field.addJavaDocLine(" * " + remarks);
//        field.addJavaDocLine(" */");
        field.addJavaDocLine("@ApiModelProperty(value =\""+remarks+"\")");
    }

    @Override
    public void addSetterComment(Method method, IntrospectedTable introspectedTable, IntrospectedColumn introspectedColumn) {
        super.addSetterComment(method, introspectedTable, introspectedColumn);
    }

    @Override
    public void addGeneralMethodComment(Method method, IntrospectedTable introspectedTable) {
//        super.addGeneralMethodComment(method, introspectedTable);
    }
}
