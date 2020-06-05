package asm.org.apache.taglibs.standard.tag.common.sql;
import org.objectweb.asm.AnnotationVisitor;
import org.objectweb.asm.Attribute;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.ConstantDynamic;
import org.objectweb.asm.FieldVisitor;
import org.objectweb.asm.Handle;
import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.RecordComponentVisitor;
import org.objectweb.asm.Type;
import org.objectweb.asm.TypePath;
public class SetDataSourceTagSupportDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_PUBLIC | ACC_SUPER, "org/apache/taglibs/standard/tag/common/sql/SetDataSourceTagSupport", null, "jakarta/servlet/jsp/tagext/TagSupport", null);

{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "dataSource", "Ljava/lang/Object;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "dataSourceSpecified", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "jdbcURL", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "driverClassName", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "userName", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "password", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "scope", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "var", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/servlet/jsp/tagext/TagSupport", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/taglibs/standard/tag/common/sql/SetDataSourceTagSupport", "init", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "init", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/taglibs/standard/tag/common/sql/SetDataSourceTagSupport", "dataSource", "Ljava/lang/Object;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/taglibs/standard/tag/common/sql/SetDataSourceTagSupport", "dataSourceSpecified", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(DUP_X1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/taglibs/standard/tag/common/sql/SetDataSourceTagSupport", "password", "Ljava/lang/String;");
methodVisitor.visitInsn(DUP_X1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/taglibs/standard/tag/common/sql/SetDataSourceTagSupport", "userName", "Ljava/lang/String;");
methodVisitor.visitInsn(DUP_X1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/taglibs/standard/tag/common/sql/SetDataSourceTagSupport", "driverClassName", "Ljava/lang/String;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/taglibs/standard/tag/common/sql/SetDataSourceTagSupport", "jdbcURL", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/taglibs/standard/tag/common/sql/SetDataSourceTagSupport", "var", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/taglibs/standard/tag/common/sql/SetDataSourceTagSupport", "scope", "I");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setScope", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/taglibs/standard/tag/common/core/Util", "getScope", "(Ljava/lang/String;)I", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/taglibs/standard/tag/common/sql/SetDataSourceTagSupport", "scope", "I");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setVar", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/taglibs/standard/tag/common/sql/SetDataSourceTagSupport", "var", "Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "doStartTag", "()I", null, new String[] { "jakarta/servlet/jsp/JspException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/Exception");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/taglibs/standard/tag/common/sql/SetDataSourceTagSupport", "dataSource", "Ljava/lang/Object;");
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/taglibs/standard/tag/common/sql/SetDataSourceTagSupport", "dataSource", "Ljava/lang/Object;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/taglibs/standard/tag/common/sql/SetDataSourceTagSupport", "pageContext", "Ljakarta/servlet/jsp/PageContext;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/taglibs/standard/tag/common/sql/DataSourceUtil", "getDataSource", "(Ljava/lang/Object;Ljakarta/servlet/jsp/PageContext;)Ljavax/sql/DataSource;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
Label label4 = new Label();
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/taglibs/standard/tag/common/sql/SetDataSourceTagSupport", "dataSourceSpecified", "Z");
Label label5 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label5);
methodVisitor.visitTypeInsn(NEW, "jakarta/servlet/jsp/JspException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("SQL_DATASOURCE_NULL");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/taglibs/standard/resources/Resources", "getMessage", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/servlet/jsp/JspException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label5);
methodVisitor.visitTypeInsn(NEW, "org/apache/taglibs/standard/tag/common/sql/DataSourceWrapper");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/taglibs/standard/tag/common/sql/DataSourceWrapper", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/taglibs/standard/tag/common/sql/SetDataSourceTagSupport", "driverClassName", "Ljava/lang/String;");
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/taglibs/standard/tag/common/sql/SetDataSourceTagSupport", "driverClassName", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/taglibs/standard/tag/common/sql/DataSourceWrapper", "setDriverClassName", "(Ljava/lang/String;)V", false);
methodVisitor.visitLabel(label1);
Label label6 = new Label();
methodVisitor.visitJumpInsn(GOTO, label6);
methodVisitor.visitLabel(label2);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitTypeInsn(NEW, "jakarta/servlet/jsp/JspTagException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("DRIVER_INVALID_CLASS");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Exception", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/taglibs/standard/resources/Resources", "getMessage", "(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/servlet/jsp/JspTagException", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label6);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/taglibs/standard/tag/common/sql/SetDataSourceTagSupport", "jdbcURL", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/taglibs/standard/tag/common/sql/DataSourceWrapper", "setJdbcURL", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/taglibs/standard/tag/common/sql/SetDataSourceTagSupport", "userName", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/taglibs/standard/tag/common/sql/DataSourceWrapper", "setUserName", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/taglibs/standard/tag/common/sql/SetDataSourceTagSupport", "password", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/taglibs/standard/tag/common/sql/DataSourceWrapper", "setPassword", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitLabel(label4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/taglibs/standard/tag/common/sql/SetDataSourceTagSupport", "var", "Ljava/lang/String;");
Label label7 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label7);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/taglibs/standard/tag/common/sql/SetDataSourceTagSupport", "pageContext", "Ljakarta/servlet/jsp/PageContext;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/taglibs/standard/tag/common/sql/SetDataSourceTagSupport", "var", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/taglibs/standard/tag/common/sql/SetDataSourceTagSupport", "scope", "I");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/servlet/jsp/PageContext", "setAttribute", "(Ljava/lang/String;Ljava/lang/Object;I)V", false);
Label label8 = new Label();
methodVisitor.visitJumpInsn(GOTO, label8);
methodVisitor.visitLabel(label7);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/taglibs/standard/tag/common/sql/SetDataSourceTagSupport", "pageContext", "Ljakarta/servlet/jsp/PageContext;");
methodVisitor.visitLdcInsn("jakarta.servlet.jsp.jstl.sql.dataSource");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/taglibs/standard/tag/common/sql/SetDataSourceTagSupport", "scope", "I");
methodVisitor.visitMethodInsn(INVOKESTATIC, "jakarta/servlet/jsp/jstl/core/Config", "set", "(Ljakarta/servlet/jsp/PageContext;Ljava/lang/String;Ljava/lang/Object;I)V", false);
methodVisitor.visitLabel(label8);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(7, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "release", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/taglibs/standard/tag/common/sql/SetDataSourceTagSupport", "init", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
