package asm.org.apache.openjpa.jdbc.sql;
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
public class SQLFactoryImplDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/openjpa/jdbc/sql/SQLFactoryImpl", null, "java/lang/Object", new String[] { "org/apache/openjpa/jdbc/sql/SQLFactory", "org/apache/openjpa/lib/conf/Configurable" });

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "_conf", "Lorg/apache/openjpa/jdbc/conf/JDBCConfiguration;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/jdbc/sql/SQLFactoryImpl", "_conf", "Lorg/apache/openjpa/jdbc/conf/JDBCConfiguration;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getConfiguration", "()Lorg/apache/openjpa/jdbc/conf/JDBCConfiguration;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/sql/SQLFactoryImpl", "_conf", "Lorg/apache/openjpa/jdbc/conf/JDBCConfiguration;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "newSelect", "()Lorg/apache/openjpa/jdbc/sql/Select;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/jdbc/sql/SelectImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/sql/SQLFactoryImpl", "_conf", "Lorg/apache/openjpa/jdbc/conf/JDBCConfiguration;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/jdbc/sql/SelectImpl", "<init>", "(Lorg/apache/openjpa/jdbc/conf/JDBCConfiguration;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "newUnion", "(I)Lorg/apache/openjpa/jdbc/sql/Union;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/jdbc/sql/LogicalUnion");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/sql/SQLFactoryImpl", "_conf", "Lorg/apache/openjpa/jdbc/conf/JDBCConfiguration;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/jdbc/sql/LogicalUnion", "<init>", "(Lorg/apache/openjpa/jdbc/conf/JDBCConfiguration;I)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "newUnion", "([Lorg/apache/openjpa/jdbc/sql/Select;)Lorg/apache/openjpa/jdbc/sql/Union;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/jdbc/sql/LogicalUnion");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/sql/SQLFactoryImpl", "_conf", "Lorg/apache/openjpa/jdbc/conf/JDBCConfiguration;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/jdbc/sql/LogicalUnion", "<init>", "(Lorg/apache/openjpa/jdbc/conf/JDBCConfiguration;[Lorg/apache/openjpa/jdbc/sql/Select;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setConfiguration", "(Lorg/apache/openjpa/lib/conf/Configuration;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openjpa/jdbc/conf/JDBCConfiguration");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/jdbc/sql/SQLFactoryImpl", "_conf", "Lorg/apache/openjpa/jdbc/conf/JDBCConfiguration;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "startConfiguration", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(0, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "endConfiguration", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(0, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
